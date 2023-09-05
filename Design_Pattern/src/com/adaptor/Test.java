package com.adaptor;

public class Test {

	public static void main(String[] args) {
		
		CareCredit careCredit = new BankCustomerAdaptor();
		careCredit.giveBankDetails();
		String creditCard = careCredit.getCreditCard();
		System.out.println(creditCard);
	}
}
