package com.cg.tms.controller;

import java.util.List;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.tms.entities.Book;
import com.cg.tms.entities.LibTransaction;
import com.cg.tms.entities.Member;
import com.cg.tms.service.LibraryService;

@Controller
public class LibraryController
{
	private static Logger logger =Logger.getLogger(LibraryController.class);
	
	@Autowired
	LibraryService lSer;
	
	@RequestMapping("start")
	public String Start()
	{
		return "Choice";
	}
	
	@RequestMapping("Choice")
	public String Choice(@RequestParam("option") Integer option, Model model)
	{
		
		switch(option)
		{
			case 1:{	
						PropertyConfigurator.configure("log4j.properties");
						
						logger.info("This is info message");
						
						List<Book> bDetails=null;
						bDetails=lSer.GetBooksTitleAndQuantity();  
						
						if(bDetails.isEmpty())
						{ 
							String message="There is no record of books in Database";
							model.addAttribute("message",message);
							return "Error";
						}
						
						else {
							model.addAttribute("bDetails",bDetails);
							return "ShowBooks";
						}
					}
			
			case 2:{List<Member> mList=lSer.GetAllMembers(); model.addAttribute("mList",mList); return "Display";}
			case 3:{Member mDetails=new Member(); model.addAttribute("mDetails",mDetails); return "Memberid";}
			case 4:{Book bookInfo=new Book();model.addAttribute("bookInfo",bookInfo); return "Bookid";}
			case 5:{String message="Case 5 is not created"; model.addAttribute("message", message); return "Error";}
			case 6:{return "Transactiondates";}
			case 7:{return "Registrationdate";}
			default:{return "Login";}
		}
	}
	
	@RequestMapping("MemberId")
	public String FindMemberById(@Valid@ModelAttribute("mDetails") Member mDetails,BindingResult res, Model model)
	{
		if(res.hasErrors())
		{
			return "Memberid";
		}
		
		else
		{
			Member mRecord=null;
			
			model.addAttribute("mDetails", mDetails);
			mRecord=lSer.FindById(mDetails.getMemId());
			
			if(mRecord!=null)
			{
				model.addAttribute("mRecord", mRecord);
				return "Memberdetails";
			}
			
			else 
			{
				String message="The member id "+mDetails.getMemId()+" does not exist.Please try another id";
				model.addAttribute("message", message);
				return "Error";
			}
		}
	}
	
	@RequestMapping("GetBook")
	public String FindMemberById(@Valid@ModelAttribute("bookInfo") Book bookInfo,BindingResult res, Model model)
	{
		if(res.hasErrors())
		{
			return "Bookid";
		}
		
		else
		{
			List<Book> bInfo;
			
			model.addAttribute("bookInfo",bookInfo);	
			bInfo=lSer.GetBookByTitle(bookInfo.getBkTitle());
			
			if(bInfo.isEmpty())
			{
				String message="The book named "+bookInfo.getBkTitle()+" no longer exists.";
				model.addAttribute("message", message);
				return "Error";
			}
			
			else 
			{
				model.addAttribute("bInfo",bInfo);
				return "BookDetails";
			}
		}
	}
	
	
	@RequestMapping("GetTransaction")
	public String GetTransactionHistory(@RequestParam("sDate") String sDate,@RequestParam("eDate") String eDate, Model model)
	{
		List<LibTransaction> tList;
		model.addAttribute("sDate",sDate);
		model.addAttribute("eDate",eDate);
		
		tList=lSer.TransactionWithinPeriod(sDate, eDate);
		
		if(tList.isEmpty())
		{
			return "Error";
		}
		else
		{
			model.addAttribute("tList",tList);
			return "ShowTransaction";
		}
	}
	
	
	@RequestMapping("RegistrationDate")
	public String RegisteredWithinGivenDates(@RequestParam("sDate") String sDate,@RequestParam("eDate") String eDate, Model model)
	{
		List<Member> mList;
		model.addAttribute("sDate",sDate);
		model.addAttribute("eDate",eDate);
		
		mList=lSer.RegisteredWithinGivenDates(sDate, eDate);
		
		if(mList.isEmpty())
		{
			String message="Enter valid date in the format DD-Mon-YYYY. Make sure the input fields are not empty and End Date is greater than Start Date";
			model.addAttribute("message",message);
			return "Error";
		}
		else
		{
			model.addAttribute("mList",mList);
			return "RegistrationDetails";
		}
		
	}
	
	
}
