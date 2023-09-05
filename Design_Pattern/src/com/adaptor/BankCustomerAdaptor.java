package com.adaptor;

import java.util.Scanner;

public class BankCustomerAdaptor extends BankDetails implements CareCredit{

	@Override
	public void giveBankDetails() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter bank name : "); 
		String bankName = sc.next();
		System.out.print("Enter card holderName : ");
		String cardHolderName = sc.next();
		System.out.print("Enter account number: ");
		int accNumber = sc.nextInt();
		
		//set all Data to BankDetails
		setBankName(bankName);
		setCardHolderName(cardHolderName);
		setAccountNumber(accNumber);
	}

	@Override
	public String getCreditCard() {
		
		String bankName = getBankName();
		String cardHolderName = getCardHolderName();
		int accountNumber = getAccountNumber();
		return "BankName : "+bankName+", CardHolderName : "+cardHolderName+" , AccNumber: "+accountNumber;
	}

}
