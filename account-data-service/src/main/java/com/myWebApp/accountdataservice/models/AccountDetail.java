package com.myWebApp.accountdataservice.models;

import java.util.List;



public class AccountDetail {

	private Account accountDetail;
	private List<Transaction> transaction;
	
	public List<Transaction> getTransaction() {
		return transaction;
	}

	public void setTransaction(List<Transaction> transaction) {
		this.transaction = transaction;
	}

	public Account getAccountDetail() {
		return accountDetail;
	}

	public void setAccountDetail(Account accountDetail) {
		this.accountDetail = accountDetail;
	}



	
	
}
