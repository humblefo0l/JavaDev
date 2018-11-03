package com.gaurav;

import java.util.ArrayList;

public class Bank {
    private String name;

    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName,
                               double initialAmount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.newCustomer(customerName, initialAmount);
        }
        return false;
    }


    public boolean addCustomerTransaction(String branchName, String customerName,
                                          double amount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            branch.addCustomerTransaction(customerName, amount);
            return true;
        }
        return false;
    }

    private Branch findBranch(String branch) {
        for (int i = 0; i < this.branches.size(); i++) {
            Branch checkedBranch = this.branches.get(i);
            if (checkedBranch.getName().equals(branch)) {
                return checkedBranch;
            }
        }
        return null;
    }


    public boolean listCustomers(String branchName, boolean isTransaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customer details for branch " + branch.getName());
            ArrayList<Customer> branchCustomer = branch.getCustomersArrayList();

            for (int i=0; i< branchCustomer.size(); i++) {
                System.out.println((i + 1) + ". " + branchCustomer.get(i).getName());

                if(isTransaction){
//                    System.out.println("Transactions");
                    ArrayList<Double> customersTransaction = branchCustomer.get(i).getTransaction();
                    for (int j=0; j<customersTransaction.size(); j++){
                        System.out.println("Transaction: " + (j+1) + " - " + customersTransaction.get(j));
                    }
                }
            }
            return true;
        }
        return false;
    }




}
