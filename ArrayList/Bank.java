package com.sherryzhu;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Branch> branches;
    private String name;

    public Bank(String name) {
        this.branches = new ArrayList<Branch>();
        this.name = name;
    }

    public boolean newBranch(String branchName) {
        if(findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName)); //
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            return branch.newCustomer(customerName, initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            return branch.addCustomerTransaction(customerName, amount);
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        for(int i=0; i<this.branches.size(); i++) {
            Branch branch = this.branches.get(i);
            if(branch.getName().equals(branchName)) {
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            System.out.println("Customer details for branch: " + branchName); // branch.getName();

            ArrayList<Customer> branchCustomers = branch.getCustomers(); //

            for(int i=0; i<branchCustomers.size(); i++){
                Customer customer = branchCustomers.get(i);
                System.out.println("[" + (i+1) + "]" + " Customer: " + customer.getName());


                if(showTransactions) {
                    System.out.println("Transactions:");
                    ArrayList<Double> transactions = customer.getTransactions();
                    for(int j=0; j<transactions.size(); j++){
                        System.out.println("[" + (j+1) + "]" + " Transaction Amount: " + transactions.get(j)); // unboxing
                    }
                }
            }
            return true;
        }
        return false;
    }

}
