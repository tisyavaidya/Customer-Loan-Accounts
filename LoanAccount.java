/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programmingassignment3;

/**
 *
 * @author tisyavaidya
 */
class LoanAccount {
    
    //properties of the class
    private double principal;
    private double annualInterestRate;
    private int months;
    
    //constructor
    public LoanAccount(double principal, double annualInterestRate, int months){
        this.principal=principal;
        this.annualInterestRate=annualInterestRate;
        this.months=months;
    }
    
    public double calculateMonthlyPayment(){
        double monthlyInterest;
        monthlyInterest= annualInterestRate/12;
        double monthlyPayment= principal*((monthlyInterest/100)/(1-Math.pow(1+(monthlyInterest/100),-months)));
        return monthlyPayment;
        
    }
    
    //setter and getter methods for three property variables
    public void setPrincipal(double principal){
        this.principal=principal;
    }
    
    public double getPrincipal(){
        return principal;
    }
    
    public void setAnnualInterestRate(float annualInterestRate){
        this.annualInterestRate=annualInterestRate;
    }
    
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    
    public void setMonths(int months){
        this.months=months;
    }
    
    public int getMonths(){
        return months;
    }
    
    //displaying information
    @Override
    public String toString(){
        return "\nPrincipal : $"+String.format("%.2f",getPrincipal())+"\nAnnual Interest Rate :"+String.format("%.2f",getAnnualInterestRate())+"%\nTerm of Loan in Months :"+getMonths()+"\nMonthly Payment: $"+String.format("%.2f",calculateMonthlyPayment());
    }
    
}
