package com.gaurav.flg.model;

import java.util.Calendar;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="person")
public class Person {

	private long pID;
	private String fName;
	private String lName;
	private String sexCd;
	private Date brthDt;
	private String prmCntNum;
	private String emailId;
	
	public Person(){
		pID=0L;
		fName="";
		lName="";
		sexCd="Male";
		brthDt=Calendar.getInstance().getTime();
		prmCntNum="";
		emailId="";
	}

	public long getpID() {
		return new Long(pID);
	}

	public void setpID(long pID) {
		this.pID = pID;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getSexCd() {
		return sexCd;
	}

	public void setSexCd(String sexCd) {
		this.sexCd = sexCd;
	}

	public Date getBrthDt() {
		return brthDt;
	}

	public void setBrthDt(Date brthDt) {
		this.brthDt = brthDt;
	}

	public String getPrmCntNum() {
		return prmCntNum;
	}

	public void setPrmCntNum(String prmCntNum) {
		this.prmCntNum = prmCntNum;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

}
