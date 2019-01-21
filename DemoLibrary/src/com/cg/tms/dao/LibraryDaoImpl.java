package com.cg.tms.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.tms.entities.Book;
import com.cg.tms.entities.LibTransaction;
import com.cg.tms.entities.Member;



@Repository
public class LibraryDaoImpl implements LibraryDao
{

	@PersistenceContext
	EntityManager em;

	@Override
	public Member FindById(String id) 
	{
		return em.find(Member.class, id);
	}

	@Override
	public List<Member> GetAllMembers() 
	{
		String jpql="SELECT m FROM Member m";
		TypedQuery<Member> query=em.createQuery(jpql,Member.class);
		
		List<Member> mList=query.getResultList();
		
		return mList;
	}

	@Override
	public List<Book> GetBooksTitleAndQuantity() 
	{
		//SELECT b.bkTitle, max(b.bkQty) FROM Book b GROUP BY b.bkTitle
		
		String jpql="SELECT b FROM Book b ";
		
		Query query=em.createQuery(jpql);
		
		List<Book> bookDetails=query.getResultList();
	
		System.out.println("Inside BookDao  "+bookDetails);
		
		return bookDetails;
	}

	@Override
	public List<Book> GetBookByTitle(String bookTitle) 
	{
		String jpql="SELECT b FROM Book b WHERE b.bkTitle=:title";
		TypedQuery<Book> query=em.createQuery(jpql,Book.class);
		query.setParameter("title", bookTitle);
		
		List<Book> result= query.getResultList();
		
		return result;
	}

	@Override
	public List<Object[]> GetBooksByDate()
	{
		String jpql="SELECT b.bkId, b.bkTitle, b.bkQty, b.bkEdition, b.bkCost, t.issueDt, t.returnStatus FROM Book b,Transaction t WHERE b.bkId=t.bId";
		
		Query query=em.createQuery(jpql);
			
		List<Object[]> result= query.getResultList();
		
		System.out.println("Inside Dao  "+result);
		
		return result;
	}

	@Override
	public List<LibTransaction> TransactionWithinPeriod(String startDate, String endDate)
	{
		String jpql="SELECT t FROM LibTransaction t WHERE t.issueDt BETWEEN :sDate AND :eDate";
		
		TypedQuery<LibTransaction> query=em.createQuery(jpql,LibTransaction.class);
		query.setParameter("sDate", startDate);
		query.setParameter("eDate", endDate);
		List<LibTransaction> result= query.getResultList();
		return result;
	}

	@Override
	public List<Member> RegisteredWithinGivenDates(String startDate, String endDate)
	{
		String jpql="SELECT m FROM Member m WHERE m.regDate BETWEEN :sDate AND :eDate";
		TypedQuery<Member> query=em.createQuery(jpql,Member.class);
		query.setParameter("sDate", startDate);
		query.setParameter("eDate", endDate);
		List<Member> result= query.getResultList();
		return result;
	}

	
	
}
