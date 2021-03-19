package com.myWebApp.accountdataservice.models;

import java.util.Date;




public class Transaction {
	

	private String tnumber;
	private String acnumber;
	private Date dot;
	private String medium_of_transaction;
	private String transaction_type;
	private Double transaction_amount;
	
	
	public Transaction () {
		
	}
	
	
	public Transaction(String tnumber, String acnumber, Date dot, String medium_of_transaction, String transaction_type,
			Double transaction_amount) {
		this.tnumber = tnumber;
		this.acnumber = acnumber;
		this.dot = dot;
		this.medium_of_transaction = medium_of_transaction;
		this.transaction_type = transaction_type;
		this.transaction_amount = transaction_amount;
	}
	public String getTnumber() {
		return tnumber;
	}
	public void setTnumber(String tnumber) {
		this.tnumber = tnumber;
	}
	public String getAcnumber() {
		return acnumber;
	}
	public void setAcnumber(String acnumber) {
		this.acnumber = acnumber;
	}
	public Date getDot() {
		return dot;
	}
	public void setDot(Date dot) {
		this.dot = dot;
	}
	public String getMedium_of_transaction() {
		return medium_of_transaction;
	}
	public void setMedium_of_transaction(String medium_of_transaction) {
		this.medium_of_transaction = medium_of_transaction;
	}
	public String getTransaction_type() {
		return transaction_type;
	}
	public void setTransaction_type(String transaction_type) {
		this.transaction_type = transaction_type;
	}
	public Double getTransaction_amount() {
		return transaction_amount;
	}
	public void setTransaction_amount(Double transaction_amount) {
		this.transaction_amount = transaction_amount;
	}
	
}
