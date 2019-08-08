package edu.mum.cs.cs425.exercise.banking.bankingapp.controller;

import edu.mum.cs.cs425.exercise.banking.bankingapp.ComponentTest;
import edu.mum.cs.cs425.exercise.banking.bankingapp.service.CustomerService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = CustomerController.class)
public class CustomerControllerTest {
    @Autowired
    private CustomerService customerService;
}
