package com.exception;

public class CheckingAccount extends Account{
    double overdraftProtection;
    public void withdraw(double money) throws OverdraftException{
        if(balance-money<overdraftProtection){
            throw new OverdraftException("您的透支额度为"+overdraftProtection+",很抱歉,您的透支金额超过了透支额度！");
        }
        balance-=money;
    }

    public static void main(String[] args) throws OverdraftException {
        CheckingAccount test=new CheckingAccount();
        test.overdraftProtection=-100000;
        test.balance=100;
        test.withdraw(1000);
        System.out.println(test.balance);
        test.withdraw(1e10);
        System.out.println(test.balance);

    }

}
