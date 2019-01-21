package com.cg.tms.dao;


import java.sql.Date;
import java.util.List;

import com.cg.tms.entities.Book;
import com.cg.tms.entities.LibTransaction;
import com.cg.tms.entities.Member;



public interface LibraryDao
{
	
	public Member FindById(String id);
	
	public List<Member> GetAllMembers();
	
	public List<Book> GetBooksTitleAndQuantity();
	
	public List<Book> GetBookByTitle(String title);
	
	public List<Object[]> GetBooksByDate();
	
	public List<LibTransaction> TransactionWithinPeriod(String startDate,String endDate);
	
	public List<Member> RegisteredWithinGivenDates(String startDate,String endDate);
	
}
