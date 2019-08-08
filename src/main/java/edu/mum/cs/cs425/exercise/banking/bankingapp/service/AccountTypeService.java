package edu.mum.cs.cs425.exercise.banking.bankingapp.service;

import edu.mum.cs.cs425.exercise.banking.bankingapp.model.AccountType;

public interface AccountTypeService {
    public abstract AccountType saveAccountType(AccountType accountType);
    public abstract Iterable<AccountType> getAllAccountTypes();
    public abstract AccountType getAccountTypeById(Integer accountTypeid);
}
