package com.gaurav;

public class Account {
    private int number;
    private int balance;
    private String customer_name;
    private String email;
    private int phone_number;

    public void setNumber(int num){
        this.number = num;
    }
    public void setBalance(int bal){
        this.balance = bal;
    }
    public void setCustomer_name(int bal){
        this.balance = bal;
    }
    public void setEmail(int bal){
        this.balance = bal;
    }
    public void setPhone_number(int bal){
        this.balance = bal;
    }
    public int getNumber(){
        System.out.println("number: "+this.number);
        return this.number;
    }
    public int getBalance(){
        return this.balance;
    }
    public int getPhone_number(){
        return this.phone_number;
    }
    public String getCustomer_name(){
        return this.customer_name;
    }
    public String getEmail(){
        return this.email;
    }



}
