package com.celcom.day5;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
class Account {
    
     String name;
     String email;
     long phoneNumber;
     long balance;
    
    public Account(String name, String email, long phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }
    public long getBalance() {
        return balance;
    }

    
    public String write() {
        return " Name: " + name + " Email: " + email + " PhoneNumber: " + phoneNumber +" Balance " +balance;
    }
}

class Bank {
    List<Account> bank= new ArrayList<>();
   
    
    public void addAccount(Account account) {
        bank.add(account);
        System.out.println("Account added: " + account.write());
    }

    public void removeAccount(long phoneNumber) {
        Account accountToRemove = null;
        for (Account account :bank) {
            if (account.getPhoneNumber()==phoneNumber) {
               accountToRemove = account;
                break;
            }
        }
        if (accountToRemove != null) {
            bank.remove(accountToRemove);
            System.out.println("Account removed: " + accountToRemove.write());
        } else {
            System.out.println("Account with PhoneNumber " + phoneNumber + " not found.");
        }
    }    
    
    public void displayAccounts() {
        
            System.out.println("Accounts in the Bank:");
            for (Account account : bank) {
                System.out.println(account.write());
            }
        
    }
    
    public void depositMoney(long money,long phoneNumber)
    {
    	Account accountToAddMoney = null;
    	for (Account account :bank) {
            if (account.getPhoneNumber()==phoneNumber) {
               accountToAddMoney = account;
                break;
            }
        }
    	if (accountToAddMoney  != null) {
    		accountToAddMoney.balance+=money;
            
            System.out.println("Money Deposited: " + accountToAddMoney.write());
        } else {
            System.out.println("Account with PhoneNumber " + phoneNumber + " not found.");
        }
    	
    }
    
    public void withDrawMoney(long money,long phoneNumber)
    {
    	Account accountwithDrawMoney = null;
    	for (Account account :bank) {
            if (account.getPhoneNumber()==phoneNumber) {
               accountwithDrawMoney = account;
                break;
            }
        }
    	if (accountwithDrawMoney  != null) {
    		accountwithDrawMoney.balance-=money;
            
            System.out.println("Money withdraw: " + accountwithDrawMoney.write());
        } else {
            System.out.println("Account with PhoneNumber " + phoneNumber + " not found.");
        }
    }
}

public class Assignment7 {
    public static void main(String[] args) {
        Bank bank=new Bank();  
        Account account1=new Account("Jyoshna","naidujyoshna@gmail.com",7683451234L);
        Account account2=new Account("ramya","naiduramya@gmail.com",7683423441L);
        Account account3=new Account("Mahesh","maheshnaidu@gmail.com",9683450234L);
      

        
        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);
        bank.displayAccounts();
        bank.removeAccount(7683451234L);
        
        bank.displayAccounts();

        
   
    }
}

