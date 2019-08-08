package edu.mum.cs.cs425.exercise.banking.bankingapp.service;

import edu.mum.cs.cs425.exercise.banking.bankingapp.model.Account;
import edu.mum.cs.cs425.exercise.banking.bankingapp.model.Customer;

import java.util.List;

public interface CustomerService {

    public abstract Customer saveCustomer(Customer customer);
    public abstract Iterable<Customer> getAllCustomers();
    public abstract Customer getCustomerById(Long customerId);
    public abstract Iterable<Account> getCustomerAccounts(Customer customer);
}
