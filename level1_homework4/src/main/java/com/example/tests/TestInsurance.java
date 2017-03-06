package com.example.tests;

public class TestInsurance {

	public static void main(String[] args) {
		Policy newDriver= new Policy(1469, 3000, true, 12);
		newDriver.payPremium(1000);
		newDriver.getBalance();
	}

}
