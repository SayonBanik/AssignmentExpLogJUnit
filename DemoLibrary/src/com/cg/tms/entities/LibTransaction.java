package com.cg.tms.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Transaction_Library")
public class LibTransaction 
{
	@Id
	@Column(name="TRANSACTIONID")
	private Integer txnId;
	
	@Column(name="ISSUEDBOOKSQUANTITY")
	private Integer issuedBooksQty;
	
	@Column(name="ISSUEDATE")
	private String issueDt;
	
	@Column(name="RETURNDATE")
	private String returnDt;
	
	@Column(name="RETURN_STATUS")
	private String returnStatus;
	
	@Column(name="T_MEMBERID")
	private Integer mId;
	
	@Column(name="T_BOOKID")
	private Integer bId;

	public Integer getTxnId() {
		return txnId;
	}

	public void setTxnId(Integer txnId) {
		this.txnId = txnId;
	}

	public Integer getIssuedBooksQty() {
		return issuedBooksQty;
	}

	public void setIssuedBooksQty(Integer issuedBooksQty) {
		this.issuedBooksQty = issuedBooksQty;
	}

	public String getIssueDt() {
		return issueDt;
	}

	public void setIssueDt(String issueDt) {
		this.issueDt = issueDt;
	}

	public String getReturnDt() {
		return returnDt;
	}

	public void setReturnDt(String returnDt) {
		this.returnDt = returnDt;
	}

	public String getReturnStatus() {
		return returnStatus;
	}

	public void setReturnStatus(String returnStatus) {
		this.returnStatus = returnStatus;
	}

	public Integer getmId() {
		return mId;
	}

	public void setmId(Integer mId) {
		this.mId = mId;
	}

	public Integer getbId() {
		return bId;
	}

	public void setbId(Integer bId) {
		this.bId = bId;
	}

	
		
}
