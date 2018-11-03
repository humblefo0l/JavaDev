package com.gaurav;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer("Tom", 54.97);
        Customer anotherCustomer = customer;
        anotherCustomer.setBalance(12.24);

        System.out.println("Balance of customer" + customer.getName() +
                 " is " + customer.getBalance());
    }
}
