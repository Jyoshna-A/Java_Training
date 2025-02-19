package com.celcom.Saturday1;

import java.util.Scanner;
import java.util.ArrayList;
// Account is a Bean Class(private data members,public getter setter methods)
class Account {
    private int accountNumber;
    private String accountHolderName;
    private String branchName;
    private long phoneNumber;
    private double balance;

    public Account(int accountNumber, String accountHolderName, String branchName, long phoneNumber) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.branchName = branchName;
        this.phoneNumber = phoneNumber;
        this.balance = 0.0; //Initially setting balance 0
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getBranchName() {
        return branchName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Branch: " + branchName);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Account Balance: " + balance);
        
    }
}
// Bank and Account have HAS-A Relationship 
class Bank {
    private ArrayList<Account> accountsList;
    
    public Bank() {
        accountsList = new ArrayList<>();
       
    }

    public boolean addAccount(Account newAccount) {
        for (Account account : accountsList) {
            if (account.getAccountNumber() == newAccount.getAccountNumber()) {
                System.out.println("Account with this number already exists.");
                return false;
            }
        }
        accountsList.add(newAccount);
        return true;
    }

    public Account findAccountByNumber(int accountNumber) {
        for (Account account : accountsList) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        System.out.println("Account not found.");
        return null;
    }

    public void displayAllAccounts() {
        if (accountsList.isEmpty()) {
            System.out.println("No accounts available.");
        } else {
            for (Account account : accountsList) {
                account.displayAccountInfo();
            }
        }
    }

    public void handleDeposit(int accountNumber, double amount) {
        Account account = findAccountByNumber(accountNumber);
        if (account != null) {
            account.deposit(amount);
            System.out.println("Deposit successful!");
        }
    }

    public void handleWithdrawal(int accountNumber, double amount) {
        Account account = findAccountByNumber(accountNumber);
        if (account != null) {
            account.withdraw(amount);
            System.out.println("Withdrawal successful!");
        }
    }

    public void displayAccountDetails(int accountNumber) {
        Account account = findAccountByNumber(accountNumber);
        if (account != null) {
            account.displayAccountInfo();
        }
    }
}

public class Assignment7 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. View Account Details");
            System.out.println("5. View All Accounts");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    int accountNumber = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Account Holder Name: ");
                    String accountHolderName = scanner.nextLine();

                    System.out.print("Enter Branch Name: ");
                    String branchName = scanner.nextLine();

                    System.out.print("Enter Phone Number: ");
                    long phoneNumber = scanner.nextLong();

                    Account newAccount = new Account(accountNumber, accountHolderName, branchName, phoneNumber);
                    if (bank.addAccount(newAccount)) {
                        System.out.println("Account created successfully!");
                    }
                    break;

                case 2:
                    System.out.print("Enter Account Number for Deposit: ");
                    int depositAccountNumber = scanner.nextInt();

                    System.out.print("Enter Amount to Deposit: ");
                    double depositAmount = scanner.nextDouble();

                    bank.handleDeposit(depositAccountNumber, depositAmount);
                    break;

                case 3:
                    System.out.print("Enter Account Number for Withdrawal: ");
                    int withdrawAccountNumber = scanner.nextInt();

                    System.out.print("Enter Amount to Withdraw: ");
                    double withdrawAmount = scanner.nextDouble();

                    bank.handleWithdrawal(withdrawAccountNumber, withdrawAmount);
                    break;

                case 4:
                    System.out.print("Enter Account Number to View Details: ");
                    int accountDetailsNumber = scanner.nextInt();

                    bank.displayAccountDetails(accountDetailsNumber);
                    break;

                case 5:
                    bank.displayAllAccounts();
                    break;

                case 6:
                    System.out.println("Exiting the Program");
                    return;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
