package com.htc.Exercise5.entity;

//Made by Ernest Paulino

public class BankAccount {
        private String accountNo;
        private String accountName;
        private double balance;
       
        static private int lastAssignedNo = 0;
       
        // Default Constructor
        public BankAccount() {
                super();
        }
 
        // Constructor for only accountName 
        public BankAccount(String accountName) {
                super();
                this.accountNo = Integer.toString(lastAssignedNo);
                this.accountName = accountName;
                this.balance = 1000;
                lastAssignedNo++;
        }

        // Constructor for accountNo and accountName 
        public BankAccount(String accountNo, String accountName) {
                super();
                this.accountNo = accountNo;
                this.accountName = accountName;
                this.balance = 1000;
        }
 
        // Constructor for all fields 
        public BankAccount(String accountNo, String accountName, double balance) {
                super();
                this.accountNo = accountNo;
                this.accountName = accountName;
                this.balance = balance;
        }
 
        // Getter and Setter
        public String getAccountNo() {
                return accountNo;
        }
 
        public void setAccountNo(String accountNo) {
                this.accountNo = accountNo;
        }
 
        public String getAccountName() {
                return accountName;
        }
 
        public void setAccountName(String accountName) {
                this.accountName = accountName;
        }
 
        public double getBalance() {
                return balance;
        }
 
        public void setBalance(double balance) {
                this.balance = balance;
        }
 
        // toString used to be able to display content of Object
        @Override
        public String toString() {
                return "BankAccount [accountNo=" + accountNo + ", accountName="
                                + accountName + ", balance=" + balance + "]";
        }
       
       
       
}