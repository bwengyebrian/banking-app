package edu.mum.cs.cs425.exercise.banking.bankingapp.service.impl;

import edu.mum.cs.cs425.exercise.banking.bankingapp.model.Account;
import edu.mum.cs.cs425.exercise.banking.bankingapp.model.Customer;
import edu.mum.cs.cs425.exercise.banking.bankingapp.repository.CustomerRepository;
import edu.mum.cs.cs425.exercise.banking.bankingapp.service.AccountService;
import edu.mum.cs.cs425.exercise.banking.bankingapp.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private AccountService accountService;
    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Iterable<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getCustomerById(Long customerId) {
        return customerRepository.findById(customerId).orElse(null);
    }

    @Override
    public Iterable<Account> getCustomerAccounts(Customer customer) {
        return accountService.getAccountsByCustomer(customer);
    }
}
