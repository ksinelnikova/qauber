package com.example.tests;

public class Policy {
	
	private int policyNumber;
	private double policyBalance;
	private boolean policyStatus;
	private int policyTerm;

	public Policy(int policyNumber,double policyBalance, boolean policyStatus, int policyTerm) {
		this.policyNumber = policyNumber;
		this.policyBalance = policyBalance;
		this.policyStatus = policyStatus;
		this.policyTerm = policyTerm;
	}

	public void payPremium(double amount){
		policyBalance = policyBalance + amount;
	}
	public void getBalance(){
		System.out.println(policyBalance);
	}
}
