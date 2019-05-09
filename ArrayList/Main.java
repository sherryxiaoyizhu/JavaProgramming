package com.sherryzhu;

public class Main {

    public static void main(String[] args) {

        // Udemy: Java Programming Masterclass for Software Developers by Tim Buchalka
        // #97 Arrays, Lists, AutoBoxing & UnBoxing; 08-May-2019

        // This program is to create a simple banking application.
        // There should be a Bank class
        // It should have an arraylist of Branches
        // Each Branch should have an arraylist of Customers
        // The Customer class should have an arraylist of Doubles (transactions)

        // Customer:
        // Name, and the ArrayList of doubles.

        // Branch:
        // Need to be able to add a new customer and initial transaction amount.
        // Also needs to add additional transactions for that customer/branch

        // Bank:
        // Add a new branch
        // Add a customer to that branch with initial transaction
        // Add a transaction for an existing customer for that branch

        // Show a list of customers for a particular branch and optionally a list
        // of their transactions
        // Demonstration autoboxing and unboxing in your code
        // Hint: Transactions
        // Add data validation.
        // e.g. check if exists, or does not exist, etc.
        // Think about where you are adding the code to perform certain actions


        Bank bank = new Bank("US Bank");
        bank.newBranch("MN");
        bank.addCustomer("MN", "Sherry", 204.69);

        bank.newBranch("CA");
        bank.addCustomer("CA", "Joey", 549.41);
        bank.addCustomer("CA", "Sherry", 43.41); //

        bank.addCustomerTransaction("CA", "Sherry", 193.07);
        bank.addCustomerTransaction("CA", "Sherry", 98.33);

        bank.addCustomerTransaction("CA", "Joey", 123.04);
        bank.addCustomerTransaction("CA", "Joey", 12.44);
        bank.addCustomerTransaction("CA", "Joey", 73.78);

        bank.listCustomers("CA", true);
        bank.listCustomers("MN", true);

        if(!bank.addCustomer("AZ", "Sherry", 23.43)) {
            System.out.println("Branch does not exist!");
        }

//        private static Scanner scanner = new Scanner(System.in);
//
//        private static void addNewCustomer() {
//            System.out.println("Enter branch name: ");
//            String branch = scanner.nextLine();
//            System.out.println("Enter new customer name: ");
//            String name = scanner.nextLine();
//            System.out.println("Enter transaction amount: ");
//            double transaction = scanner.nextDouble();
//
//            Bank newBankAccount = Bank.createBankAccount(branch, name, transaction);
//
//            if(Branch.addNewCustomer()) {
//                System.out.println("New contact added: name = " + name + ", phone = "+ phone);
//            } else {
//                System.out.println("Cannot add, " + name + " already on file");
//            }
//        }

    }
}
