package com.exception;

public interface Bank {

	void deposit(double amount) throws InvalidAmountException;

	double withdraw(double amount) throws InsufficientFundsException;

	void balanceEnquiry();
}
