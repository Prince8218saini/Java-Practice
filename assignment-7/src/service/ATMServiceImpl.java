package service;

import model.Account;
import model.Transaction;

public class ATMServiceImpl implements ATMService {

    private Account account;

    public ATMServiceImpl(Account account) {
        this.account = account;
    }

    public void checkBalance() {
        System.out.println("Current Balance: ₹" + account.getBalance());
    }

    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
        account.getTransactions().add(new Transaction("Deposit", amount));
        System.out.println("Amount deposited successfully");
    }

    public void withdraw(double amount) {

        if (amount > account.getBalance()) {
            System.out.println("Insufficient balance");
            return;
        }

        account.setBalance(account.getBalance() - amount);
        account.getTransactions().add(new Transaction("Withdraw", amount));
        System.out.println("Please collect your cash");
    }

    public void miniStatement() {

        if (account.getTransactions().isEmpty()) {
            System.out.println("No transactions yet");
            return;
        }

        System.out.println("---- Mini Statement ----");
        for (Transaction t : account.getTransactions()) {
            System.out.println(t);
        }
    }
    public boolean checkPin(int oldPin) {
        int old = account.getPin();
        if(old!=oldPin)
        {
        	return false;
        }
        	return true;   
    }
    public void changePin(int newPin) {
        account.setPin(newPin);
        System.out.println("PIN changed successfully");
    }
    public  Account  getProfile()
    {
	   return account;
	}
}
