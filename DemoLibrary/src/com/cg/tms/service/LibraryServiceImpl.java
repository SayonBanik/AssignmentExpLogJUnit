package com.cg.tms.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.tms.dao.LibraryDao;
import com.cg.tms.entities.Book;
import com.cg.tms.entities.LibTransaction;
import com.cg.tms.entities.Member;

@Transactional
@Service
public class LibraryServiceImpl implements LibraryService {

	@Autowired
	LibraryDao lDao;

	@Override
	public Member FindById(String id)
	{
		return lDao.FindById(id);
	}

	@Override
	public List<Member> GetAllMembers() 
	{
		return lDao.GetAllMembers();
	}

	@Override
	public List<Book> GetBooksTitleAndQuantity()
	{
		return lDao.GetBooksTitleAndQuantity();
	}

	@Override
	public List<Book> GetBookByTitle(String title) 
	{
		return lDao.GetBookByTitle(title);
	}

	@Override
	public List<Object[]> GetBooksByDate() 
	{
		return lDao.GetBooksByDate();
	}

	@Override
	public List<LibTransaction> TransactionWithinPeriod(String startDate, String endDate)
	{
		return lDao.TransactionWithinPeriod(startDate, endDate);
	}

	@Override
	public List<Member> RegisteredWithinGivenDates(String startDate, String endDate) 
	{
		return lDao.RegisteredWithinGivenDates(startDate, endDate);
	}
	
	
	

}
