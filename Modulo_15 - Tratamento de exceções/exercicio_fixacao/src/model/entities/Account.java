package model.entities;

import model.exceptions.AccountException;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account() {
    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(Double amount){
        if (amount > withdrawLimit){
            throw new AccountException("The transaction amount is greater than the account withdrawal limit");
        }
        if (balance < amount){
            throw new AccountException("The account does not have enough balance to carry out the transaction!");
        }

        this.balance -= amount;
    }
}
