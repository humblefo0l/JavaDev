package com.gaurav;

import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transaction;

    public Customer(String name, double transactionAmount) {
        this.name = name;
        this.transaction = new ArrayList<Double>();
        addTranscation(transactionAmount);
    }

    public void addTranscation(double amount){
        this.transaction.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransaction() {
        return transaction;
    }

}
