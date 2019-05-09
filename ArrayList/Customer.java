package com.sherryzhu;

import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transactions  = new ArrayList<Double>();
        addTransaction(initialAmount); //
    }

    public void addTransaction(double amount) {
        this.transactions.add(amount);
    }


    public String getName() {
        return name;
    }


    public ArrayList<Double> getTransactions() {
        return transactions;
    }


//    public double getTransaction() {
//        int position = Branch.findCustomer(this.name);
//        if(position >= 0) {
//            return this.transaction.get(position); // unboxing shortcut
//        }
//    }
//
//    public static Customer createCustomer(String name, double amount) {
//        return new Customer(name, amount);
//    }

}
