package com.bank;

import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		
		Transaction transaction=new Transaction();
		Scanner scanner=new Scanner(System.in);
		Account [] accounts=new Account[10];
		Loan [] loans=new Loan[10];
		accounts[0] = new Account("1234567-HARS", "Harsha", "India", 10000);
		
		int accountIndex=1;
		int loanIndex=0;
		String acountId;
		double depositAmmount;
		double withdrawAmmount;
		double ammount;
		String loadId;
		
		
		
		while(true) {
			System.out.println("Choose any one");
			System.out.println("Enter 1 for Create account");
			System.out.println("Enter 2 for Deposit Amount");
			System.out.println("Enter 3 for Withdraw Amount");
			System.out.println("Enter 4 for ShowAccountDetails");
			System.out.println("Enter 5 for Get Loan");
			System.out.println("Enter 6 for Pay Loan");
			System.out.println("Enter 7 for ShowLoanDetails");
			System.out.println("Enter 8 Exit");
			
			int option = scanner.nextInt();
			
			switch (option) {
			case 1:
				
				Account account=new Account();
				while(true) {
					
					System.out.println("Enter account Id(Eg:[1234567-ABCD]:");
					acountId=scanner.next();
					if(account.validateAccountId(acountId))
					{
						account.setAccountId(acountId);
						break;
					}
					else 
					{
						System.out.println("Account ID is not valid");
						
					}
					
					
				}
				while(true) {
					System.out.println("Enter user name");
					String username = scanner.next();
					if(account.validateAccountName(username)) {
						account.setAccountName(username);
						break;
					}else {
						System.out.println("Entered Name is not in valid format");
					}
				}	
				System.out.println("Enter your Address:");
				account.setAddress(scanner.next());
				System.out.println("Enter Deposit Amount:");
				account.setDepositAmmount(scanner.nextDouble());
				accounts[accountIndex++] =  account;
				System.out.println("Account successfully created");
				break;
				
			case 2:	
				
				System.out.println("Enter the Account ID:");
				acountId =scanner.next();
				for(Account acc : accounts) {
					if ((acc.getAccountId()).equals(acountId)) {
						
						System.out.println("Enter  deposit Amount :");
						depositAmmount=scanner.nextDouble();
						acc.setDepositAmmount(transaction.depositAmount(depositAmmount, acc.getDepositAmmount()));
						System.out.println("Transaction Completed");
						System.out.println("Your new balance is " + acc.getDepositAmmount());
						break;
						
					}
					else 
					{
						System.out.println("Account ID does not Exist...Enter valid Acount ID");
					}
					
					
				}
				break;
			case 3:
				System.out.println("Enter the Account ID:");
				acountId =scanner.next();
				for(Account acc : accounts) {
					if ((acc.getAccountId()).equals(acountId)) {
						
						System.out.println("Enter withdraw Amount :");
						withdrawAmmount=scanner.nextDouble();
						if(withdrawAmmount<=transaction.getAmount()) {
							
							acc.setDepositAmmount(transaction.withdrawAmount(withdrawAmmount, acc.getDepositAmmount()));
							System.out.println("Transaction Completed");
							System.out.println("Your new balance is " + acc.getDepositAmmount());
							break;
							
						}
						else
						{
							System.out.println("Insufficient balance");
						}
						
						
					}
					else 
					{
						System.out.println("Account ID does not Exist...Enter valid Acount ID");
					}
					
					
				}
				break;
			case 4:
				System.out.println("Enter the Account ID:");
				acountId =scanner.next();
				for(Account acc: accounts)
				{
					if(acc.getAccountId().equals(acountId))
					{
						acc.showDetails(acc.getAccountId(),accounts);
						break;
					}
					else
					{
						System.out.println("Account ID does not Exist...Enter valid Acount ID");
					}
					
				}
				break;
				
			case 5:
				System.out.println("Enter your Account Id:");
				acountId = scanner.next();
				Loan loan = new Loan();
				for(Account acc : accounts) {
					if(acc.getAccountId().equals(acountId)) {
						
						System.out.println("Enter Loan Id:");
						loan.setLoanId(scanner.next());
						System.out.println("Enter Loan Type [Eg: House, Education, Bike, Car]:");
						loan.setLoanType(scanner.next());
						System.out.println("Enter Loan Amount:");
						loan.setLoanAmount(scanner.nextDouble());
						loan.getLoan(loan.getLoanAmount(),acc.getDepositAmmount(), acc);
						loans[loanIndex] = loan;
						loanIndex++;
						break;
					}
					else 
					{
						System.out.println("Enter Valid Account Id");
					}
				}
				break;
				
			case 6:
				System.out.println("Enter your Loan Id:");
				loadId = scanner.next();
				for(Loan l : loans) {
					if(l.getLoanId().equals(loadId)) {
						System.out.println("Your Total Loan Amount is "+ l.getLoanAmount());
						System.out.println("Enter the amount you want to repay:");
						ammount = scanner.nextDouble();
						System.out.println("Enter your Account Id: ");
						acountId = scanner.next();
						for(Account acc : accounts) {
							if(acc.getAccountId().equals(acountId)) {
								if(ammount <= acc.getDepositAmmount()) {
									transaction.payLoan(l, ammount,acc);
									System.out.println("The new Loan Amount you need to pay is "+ l.getLoanAmount());
									break;
								}
								else {
									System.out.println("Account ID does not Exist...Enter valid Acount ID");
									break;
								}
							}
						}
						break;
						}
					else {
						System.out.println("Invalid Loan Id.");
						break;
				     }
				}
				break;
			case 7:
				System.out.println("Enter Loan Id:");
				loadId = scanner.next();
				for(Loan l : loans) {
					if(l.getLoanId().equals(loadId)) {
						l.showLoanDetails(l);
						break;
					}
					else {
						System.out.println("Enter the Valid Id");
						break;
					}
				}
				break;
			case 8:
				System.out.println("Thank you for using our Application");
				scanner.close();
				System.exit(0);
				
			default:
				System.out.println("Choose the proper action.");
				break;
				
			}
			
		}
			
			
			
		
		

	}

}
