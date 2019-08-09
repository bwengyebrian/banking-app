package edu.mum.cs.cs425.exercise.banking.bankingapp.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long accountId;
    @NotNull(message = "Ivalid Account Number")
    private Long accountNumber;
    @NotNull(message = "Ivalid balance")
    private Double balance;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id",nullable = true )
    private Customer customer;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name =  "account_type_id")
    private AccountType accountType;

    public Account() {
    }

    public Account(@NotBlank(message = "Ivalid Account Number") Long accountNumber, @NotBlank(message = "Ivalid balance") Double balance, @NotNull Customer customer) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customer = customer;
    }

    public Account(@NotBlank(message = "Ivalid Account Number") Long accountNumber, @NotBlank(message = "Ivalid balance") Double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public Account(@NotBlank(message = "Ivalid Account Number") Long accountNumber, @NotBlank(message = "Ivalid balance") Double balance, Customer customer, @NotNull(message = "Account Type not Set") AccountType accountType) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customer = customer;
        this.accountType = accountType;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                ", customer=" + customer +
                ", accountType=" + accountType +
                '}';
    }
}
