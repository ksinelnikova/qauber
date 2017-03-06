package com.example.tests;

public class BankAccount {
	
	private int accountNumber; 
	private String name;
	private double balance; 
	private boolean isActive;
	
	public BankAccount(int accountNumber, String name, boolean isActive, double balance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.isActive = isActive;
	}
	public String name() {
		return name;
	}
	public void withdraw(double amount){
		if(balance - amount < 500) {
		System.out.println("\n" + "Your balance is less than 500. Minimum balance to withdraw is 500");
		}else {
		balance = balance - amount;
		}
	}
	public void deposit(double amount){
		balance = balance + amount;
	}
	public double getBalance(){
		return balance;
} }
