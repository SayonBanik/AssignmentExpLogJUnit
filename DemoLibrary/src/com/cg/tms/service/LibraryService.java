package com.cg.tms.service;

import java.sql.Date;
import java.util.List;

import com.cg.tms.entities.Book;
import com.cg.tms.entities.LibTransaction;
import com.cg.tms.entities.Member;

public interface LibraryService 
{

	public Member FindById(String string);
	
	public List<Member> GetAllMembers();
	
	public List<Book> GetBooksTitleAndQuantity();
	
	public List<Book> GetBookByTitle(String title);
	
	public List<Object[]> GetBooksByDate();
	
	public List<LibTransaction> TransactionWithinPeriod(String startDate,String endDate);
	
	public List<Member> RegisteredWithinGivenDates(String startDate,String endDate);
	

}
