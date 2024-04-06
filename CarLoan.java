/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programmingassignment3;

/**
 *
 * @author tisyavaidya
 */
class CarLoan extends LoanAccount {
    
    //property of the class
    private final String vehicleVIN;
 
    //constructor
    public CarLoan(double principal, double annualInterestRate, int months, String vehicleVIN){
        super(principal, annualInterestRate, months);
        this.vehicleVIN=vehicleVIN;
    }
    
    //display the information
    @Override
    public String toString(){
        return "\nCar Loan with: "+super.toString()+"\nVehicle VIN: "+vehicleVIN+"\n";
    }          
}
