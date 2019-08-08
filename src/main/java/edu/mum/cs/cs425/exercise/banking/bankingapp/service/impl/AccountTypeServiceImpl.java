package edu.mum.cs.cs425.exercise.banking.bankingapp.service.impl;

import edu.mum.cs.cs425.exercise.banking.bankingapp.model.AccountType;
import edu.mum.cs.cs425.exercise.banking.bankingapp.repository.AccountTypeRepository;
import edu.mum.cs.cs425.exercise.banking.bankingapp.service.AccountTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountTypeServiceImpl implements AccountTypeService {

    @Autowired
    private AccountTypeRepository accountTypeRepository;
    @Override
    public AccountType saveAccountType(AccountType accountType) {
        return accountTypeRepository.save(accountType);
    }

    @Override
    public Iterable<AccountType> getAllAccountTypes() {
        return accountTypeRepository.findAll();
    }

    @Override
    public AccountType getAccountTypeById(Integer accountTypeid) {
        return accountTypeRepository.findById(accountTypeid).orElse(null);
    }
}
