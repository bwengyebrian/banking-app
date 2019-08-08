package edu.mum.cs.cs425.exercise.banking.bankingapp.service;

import edu.mum.cs.cs425.exercise.banking.bankingapp.model.Account;
import edu.mum.cs.cs425.exercise.banking.bankingapp.model.Customer;

public interface AccountService {

    public abstract Account saveAccount(Account account);
    public abstract Iterable<Account> getAccounts();
    public abstract Account getAccountById(Long accountId);
    public abstract Iterable<Account> getAccountsByCustomer(Customer customer);
}
