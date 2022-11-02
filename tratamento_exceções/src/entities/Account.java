package entities;

import exceptions.WithdrawException;

public class Account {
	private int number;
	private String holder;
	private double balance;
	private double withdrawLimit;
	
	public Account() {
		
	}
	

	public Account(int number, String holder, double balance, double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}



	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount) throws WithdrawException {
		
		if (this.balance <= amount) {
			throw new WithdrawException("Not enough balance.");
		
		}else if (amount > this.withdrawLimit) {
			throw new WithdrawException("The amount exceeds withdraw limit.");
		}
		
		this.balance -= amount;
	}
	
}
