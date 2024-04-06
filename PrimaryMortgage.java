/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programmingassignment3;

/**
 *
 * @author tisyavaidya
 */
class PrimaryMortgage extends LoanAccount{
    
    //properties of the class
    private final double PMIMonthlyAmount;
    private final Address address;
    
    //constructor
    public PrimaryMortgage(double principal, double annualInterestRate, int months, double PMIMonthlyAmount, Address address){
        super(principal, annualInterestRate, months);
        this.PMIMonthlyAmount=PMIMonthlyAmount;
        this.address=address;
    }
    
    //displaying the information
    @Override
    public String toString(){
        return "\nPrimary Mortgage Loan with: "+super.toString()+"\nPMI Monthly Amount: $"+PMIMonthlyAmount+address.toString()+"\n";
    }
    
}