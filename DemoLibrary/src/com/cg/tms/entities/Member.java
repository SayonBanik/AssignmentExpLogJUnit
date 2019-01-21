package com.cg.tms.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="Member")
public class Member 
{
	@Id
	@NotEmpty
	@Pattern(regexp="[0-9]+",message="Please select valid Member Id. Id contains only numbers.")
	@Column(name="MEMBERID")
	private String memId;
	
	@Column(name="MEMBERNAME")
	private String memName;
	
	@Column(name="MEMBERSHIPTYPE")
	private String memType;
	
	@Column(name="DURATIONTOKEEPBOOKS")
	private Integer duration;
	
	@Column(name="REGISTRATIONDATE_DATE")
	private String regDate;
	
	@Column(name="PASSWORD")
	private String pass;

	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	public String getMemName() {
		return memName;
	}

	public void setMemName(String memName) {
		this.memName = memName;
	}

	public String getMemType() {
		return memType;
	}

	public void setMemType(String memType) {
		this.memType = memType;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

				
}
