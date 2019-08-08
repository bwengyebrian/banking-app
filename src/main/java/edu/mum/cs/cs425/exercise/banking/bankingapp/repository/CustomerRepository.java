package edu.mum.cs.cs425.exercise.banking.bankingapp.repository;

import edu.mum.cs.cs425.exercise.banking.bankingapp.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer,Long> {
}
