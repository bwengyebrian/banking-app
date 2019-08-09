package edu.mum.cs.cs425.exercise.banking.bankingapp.repository;

import edu.mum.cs.cs425.exercise.banking.bankingapp.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer,Long> {
}
