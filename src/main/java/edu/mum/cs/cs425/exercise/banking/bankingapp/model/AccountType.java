package edu.mum.cs.cs425.exercise.banking.bankingapp.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
@Entity
@Table(name = "account-types")
public class AccountType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer accountTypeId;
    @NotBlank(message = "Account type is required")
    private String accountTypeName;

    public AccountType(){
        super();
    }
    public AccountType(@NotBlank(message = "Account type is required") String accountTypeName) {
        this.accountTypeName = accountTypeName;
    }

    @Override
    public String toString() {
        return "AccountType{" +
                "accountTypeId=" + accountTypeId +
                ", accountTypeName='" + accountTypeName + '\'' +
                '}';
    }
}
