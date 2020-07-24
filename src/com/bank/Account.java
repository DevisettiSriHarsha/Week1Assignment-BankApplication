package com.bank;


public class Account {
	
	private String accountId;
	private String accountName;
	private String address;
	private double depositAmmount;
	
	Transaction transaction;
	
	
	

	public Account(String accountId, String accountName, String address, double depositAmmount) {
		super();
		this.accountId = accountId;
		this.accountName = accountName;
		this.address = address;
		this.depositAmmount = depositAmmount;
	}



	public String getAccountId() {
		return accountId;
	}



	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}



	public String getAccountName() {
		return accountName;
	}



	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public double getDepositAmmount() {
		return depositAmmount;
	}



	public void setDepositAmmount(double depositAmmount) {
		this.depositAmmount = depositAmmount;
	}



	public Account() {
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", accountName=" + accountName + ", address=" + address
				+ ", depositAmmount=" + depositAmmount + "]";
	}
	
	public Account getDetails()
	{
		return null;
	}
	public boolean showDetails(String id, Account accounts[]) {
		for(Account  account : accounts) {
			if((account.getAccountId()).equals(id)) {
				System.out.println("Account ID: "+account.getAccountId());
				System.out.println("Account Name: "+account.getAccountName());
				System.out.println("Address: "+account.getAddress());
				System.out.println("Balance Amount: "+account.getDepositAmmount());
				return true;
			}
		}
		return false;
	}
	 public boolean validateAccountId(String id) {
			String regexId = "^[0-9]{7}-[A-Za-z]{4}$";
			return id.matches(regexId);
	}
	 public boolean validateAccountName(String name) {
			String regexName = "^[A-Z]{1}[a-z]{2,30}$";
			return name.matches(regexName);
		}

}
