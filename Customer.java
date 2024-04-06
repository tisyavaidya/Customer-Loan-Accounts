/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programmingassignment3;

import java.util.ArrayList;

/**
 *
 * @author tisyavaidya
 */
public class Customer {
    
    private String firstName;
    private String lastName;
    private String SSN;
    private final ArrayList<LoanAccount> loanAccounts;
    
    public Customer(String firstName, String lastName, String SSN){
        this.firstName=firstName;
        this.lastName=lastName;
        this.SSN=SSN;
        this.loanAccounts=new ArrayList<> ();
    }
    
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public void setSSN(String ssn){
        this.SSN=ssn;
    }
    
    public void addLoanAccount(LoanAccount account){
        this.loanAccounts.add(account);
    }
    
    public String printMonthlyReport(){
        String result="Account Report for Customer: "+ firstName+" "+lastName+" with SSN "+SSN+"\n";
        for (LoanAccount loanAccount : loanAccounts){
            result+=loanAccount.toString();
        }
        return result;
    }

}
