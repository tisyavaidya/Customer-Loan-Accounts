/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programmingassignment3;

/**
 *
 * @author tisyavaidya
 */
public class Address {
    
//properties of the class
    private String street;
    private String state;
    private String zipcode;
    private String city;
    
    //constructor
    public Address(String street, String city, String state, String zipcode){
        this.street=street;
        this.state=state;
        this.zipcode=zipcode;
        this.city=city;     
    }
    
    //getter and setter methods for the properties
    public void setStreet(String street){
        this.street=street;
    }
    
    public String getStreet(){
        return street;
    }
    
    public void setState(String state){
        this.state=state;
    }
    
    public String getState(){
        return state;
    }
    
    public void setZipcode(String zipcode){
        this.zipcode=zipcode;
    }
    
    public String getZipcode(){
        return zipcode;
    }
    
    public void setCity(String city){
        this.city=city;
    }
    
    public String getCity(){
        return city;
    }
    
    //displaying the information
    @Override
    public String toString(){
        return "\nProperty Address:"+"\n  "+street+"\n  "+city+", "+state+" "+zipcode+"\n";
    }
}
