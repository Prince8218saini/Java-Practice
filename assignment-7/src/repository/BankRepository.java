package repository;

import java.util.HashMap;
import model.Account;

public class BankRepository {

    private static HashMap<Integer, Account> accounts = new HashMap<>();

    static {
        accounts.put(821840, new Account(821840, "Prince", 1234, 5000));
        accounts.put(102, new Account(102, "Rahul", 1111, 8000));
        accounts.put(103, new Account(103, "Amit", 2222, 12000));
    }

    public Account getAccount(int accNo) {
        return accounts.get(accNo);
    }
}
