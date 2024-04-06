/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programmingassignment3;

/**
 *
 * @author tisyavaidya
 */
class UnsecuredLoan extends LoanAccount{
    
    //constructor
    public UnsecuredLoan(double principal, double annualInterestRate, int months){
        super(principal, annualInterestRate, months);
    }
    
    //displaying the information
    @Override
    public String toString(){
        return "Unsecured Loan with: "+super.toString()+"\n";

    }
    
}
