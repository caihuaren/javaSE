package com.exception;

public class Account {
    double balance;
    double deficit;
    public double geBalance(){
        return balance;
    }
    public void deposit(double money){
        balance+=money;
    }
    public void withdraw(double money) throws OverdraftException {
        balance-=money;
    }
}
