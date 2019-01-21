package com.cg.tms.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="Book")
public class Book 
{

	@Id
	@Column(name="BOOKID")
	private Integer bkId;
	
	@Column(name="BOOKTITLE")
	@NotEmpty
	@Pattern(regexp="[A-Z][a-z]+",message="Please select valid Book Name starting with Capital letter followed by small letters")
	private String bkTitle;
	
	@Column(name="BOOKQUANTITY")
	private Integer bkQty;
	
	@Column(name="BOOKEDITION")
	private String bkEdition;
	
	@Column(name="BOOKCOST")
	private Integer bkCost;

	public Integer getBkId() {
		return bkId;
	}

	public void setBkId(Integer bkId) {
		this.bkId = bkId;
	}

	public String getBkTitle() {
		return bkTitle;
	}

	public void setBkTitle(String bkTitle) {
		this.bkTitle = bkTitle;
	}

	public Integer getBkQty() {
		return bkQty;
	}

	public void setBkQty(Integer bkQty) {
		this.bkQty = bkQty;
	}

	public String getBkEdition() {
		return bkEdition;
	}

	public void setBkEdition(String bkEdition) {
		this.bkEdition = bkEdition;
	}

	public Integer getBkCost() {
		return bkCost;
	}

	public void setBkCost(Integer bkCost) {
		this.bkCost = bkCost;
	}

	
	
}
