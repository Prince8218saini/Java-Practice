package service;

import model.Account;

public interface ATMService {

    void checkBalance();
    void deposit(double amount);
    void withdraw(double amount);
    void miniStatement();
    void changePin(int newPin);
	boolean checkPin(int nextInt);
	Account getProfile();
	
}
