package com.bank;

public class Transaction extends Loan {
	
	private double amount;

	public Transaction(double amount) {
		super();
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Transaction() {
		// TODO Auto-generated constructor stub
	}
	
	public double depositAmount(double depositAmount,double balance)
	{
		amount=depositAmount+balance;
		return amount;
		
	}
	
	public double withdrawAmount(double withdrawAmount, double balance)
	{
		amount=balance-withdrawAmount;
		return amount;
		
	}
	
	public Loan payLoan(Loan l,  double balance, Account acc) {
		l.setLoanAmount(l.getLoanAmount()-balance);
		transaction.setAmount((transaction.getAmount()-balance));
		System.out.println(balance+ " Debited Successfully");
		return l;
	}
	public Account showAccountDetails()
	{
		return null;
		
	}

}
