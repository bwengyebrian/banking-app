package edu.mum.cs.cs425.exercise.banking.bankingapp.controller;

import edu.mum.cs.cs425.exercise.banking.bankingapp.model.Account;
import edu.mum.cs.cs425.exercise.banking.bankingapp.model.Customer;
import edu.mum.cs.cs425.exercise.banking.bankingapp.service.AccountService;
import edu.mum.cs.cs425.exercise.banking.bankingapp.service.AccountTypeService;
import edu.mum.cs.cs425.exercise.banking.bankingapp.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class AccountController {
    @Autowired
    private AccountService accountService;
    @Autowired
    private CustomerService customerService;
    @Autowired
    private AccountTypeService accountTypeService;

    @GetMapping(value = {"/bankingapp/account/list","bankingapp/account/list"})
    public String listAccounts(Model model){
        model.addAttribute("accounts",accountService.getAccounts());
        return  "account/list-account";
    }

    @GetMapping(value = {"/bankingapp/account/new","bankingapp/account/new"})
    public String addNewAccount(Model model){
        Account account = new Account();
        model.addAttribute("account",account);
        model.addAttribute("customers",customerService.getAllCustomers());
        model.addAttribute("accountTypes",accountTypeService.getAllAccountTypes());
        return "account/new-account";
    }

    @PostMapping(value = {"/bankingapp/account/new","bankingapp/account/new"})
    public String saveNewAccount(@Valid @ModelAttribute("account") Account account, BindingResult bindingResult, Model model){
        if (bindingResult.hasErrors()){
            model.addAttribute("errors",bindingResult.getAllErrors());
            return "account/new-account";
        }
        accountService.saveAccount(account);
        return "redirect:/bankingapp/account/list";
    }
}
