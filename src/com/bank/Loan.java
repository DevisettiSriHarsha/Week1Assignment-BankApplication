package com.bank;

public class Loan extends Account {
	
	private String loanId;
	private String loanType;
	private double loanAmount;
	
	
	

	public Loan(String loanId, String loanType, double loanAmount) {
		super();
		this.loanId = loanId;
		this.loanType = loanType;
		this.loanAmount = loanAmount;
	}
	
	public double amount;




	public String getLoanId() {
		return loanId;
	}




	public void setLoanId(String loanId) {
		this.loanId = loanId;
	}




	public String getLoanType() {
		return loanType;
	}




	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}




	public double getLoanAmount() {
		return loanAmount;
	}




	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}




	public Loan() {
		// TODO Auto-generated constructor stub
	}
	
	public void getLoan(double loanAmount,double balance,Account acc)
	{
		acc.setDepositAmmount(loanAmount+balance);
		System.out.println("Your Loan Approved and credited to your Account Successfully ");
		
	}
	public void showLoanDetails(Loan l)
	{
		System.out.println("Loan ID: " +l.getLoanId());
		System.out.println("Loan Type: " +l.getLoanType());
		System.out.println("Loan Amount: "+l.getLoanAmount());
		
		
	}

}
