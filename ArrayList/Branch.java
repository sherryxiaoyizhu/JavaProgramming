package com.sherryzhu;

import java.util.ArrayList;

public class Branch {

    private String name; //
    private ArrayList<Customer> customers;


    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialAmount) {
        if(findCustomer(customerName) == null) {
            this.customers.add(new Customer(customerName, initialAmount)); //
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount) {
        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName) {
        for(int i=0; i<this.customers.size(); i++) {
            Customer customer = this.customers.get(i);
            if(customer.getName().equals(customerName)) {
                return customer;
            }
        }
        return null;
    }


//    public boolean addNewCustomer(Customer customer) {
//        if(findCustomer(customer.getName()) >= 0) {
//            System.out.println("Customer is already on file");
//            return false;
//        }
//
//        myCustomers.add(customer);
//        return true;
//    }
//
//    public static int findCustomer(String customerName) {
//        for(int i=0; i<this.myCustomers.size(); i++) {
//            Customer customer = this.myCustomers.get(i);
//            if(customer.getName().equals(customerName)) {
//                return i;
//            }
//        }
//        return -1;
//    }
//
//    public boolean addTransaction(String name, double amount) {
//        int position = findCustomer(name);
//        if (position >= 0) {
//            double newTransaction = this.myCustomers.get(position).getTransaction() + amount;
//            Customer updatedCustomer = Customer.createCustomer(name, newTransaction);
//            this.myCustomers.set(position, updatedCustomer);
//        }
//    }

}
