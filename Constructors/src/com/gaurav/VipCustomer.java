package com.gaurav;

public class VipCustomer {
    private String name;
    private double credit_limit;
    private String email;

    public VipCustomer(String name, double credit_limit,
                       String email){
        this.name = name;
        this.credit_limit = credit_limit;
        this.email = email;
        System.out.println("In All three method");

    }

    public VipCustomer(){
        this("default", 1000, "default@xyz.com");
        System.out.println("In Empty Constructor");
    }

    public VipCustomer(String name, double credit_limit){
        this(name, credit_limit, "default@xyz.com" );
    }

    public String getName(){
        return this.name;
    }
    public String getEmail(){
            return this.email;
    }
    public double getCredit_limit(){
        return this.credit_limit;
    }

}
