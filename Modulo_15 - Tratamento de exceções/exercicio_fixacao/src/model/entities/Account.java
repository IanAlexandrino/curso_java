package model.entities;

import model.exceptions.AccountException;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account() {
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
        if (balance < amount){
            throw new AccountException("The account does not have enough balance to carry out the transaction!");
        }
        if (amount > withdrawLimit){
            throw new AccountException("The transaction amount is greater than the account withdrawal limit");
        }

        this.balance -= amount;
    }
}
