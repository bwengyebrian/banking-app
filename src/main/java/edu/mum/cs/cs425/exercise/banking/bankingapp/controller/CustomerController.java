package edu.mum.cs.cs425.exercise.banking.bankingapp.controller;

import edu.mum.cs.cs425.exercise.banking.bankingapp.model.Customer;
import edu.mum.cs.cs425.exercise.banking.bankingapp.service.CustomerService;
import edu.mum.cs.cs425.exercise.banking.bankingapp.service.impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
public class CustomerController {
    private CustomerService customerService;

    @GetMapping(value = {"/bankingapp/customers/list","bankingapp/customers/list"})
    public String listCustomers(Model model){
        model.addAttribute("",customerService.getAllCustomers());
        return  "customer/list";
    }

    @GetMapping(value = {"/bankingapp/customer/new","bankingapp/customer/new"})
    public String addNewCustomer(Model model){
        Customer customer = new  Customer();
        model.addAttribute("customer",customer);
        return "customer/new";
    }

    public String saveNewCustomer(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult,Model model){
        if (bindingResult.hasErrors()){
            model.addAttribute("errors",bindingResult.getAllErrors());
            return "customer/new";
        }
        customerService.saveCustomer(customer);
        return "redirect:customer/list";
    }

    public ModelAndView editCustomer(){
        ModelAndView model = new ModelAndView();
        model.addObject("customer" ,"");
        model.setViewName("");
        return  null;
    }
}
