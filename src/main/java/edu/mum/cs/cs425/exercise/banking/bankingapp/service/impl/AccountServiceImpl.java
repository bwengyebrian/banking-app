package edu.mum.cs.cs425.exercise.banking.bankingapp.service.impl;

import edu.mum.cs.cs425.exercise.banking.bankingapp.model.Account;
import edu.mum.cs.cs425.exercise.banking.bankingapp.model.Customer;
import edu.mum.cs.cs425.exercise.banking.bankingapp.repository.AccountRepository;
import edu.mum.cs.cs425.exercise.banking.bankingapp.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;

public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Account saveAccount(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public Iterable<Account> getAccounts() {
        return accountRepository.findAll();
    }

    @Override
    public Account getAccountById(Long accountId) {
        return accountRepository.findById(accountId).orElse(null);
    }

    @Override
    public Iterable<Account> getAccountsByCustomer(Customer customer) {
        return null;
    }


}