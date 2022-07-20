package com.dio.challengedigitalbank;

import java.util.ArrayList;
import java.util.List;

public class Account implements IAccount{

    private static final int DEFAULT_AGENCY = 1;
    private static int SEQUENTIAL = 1;

    protected int agency;
    protected int accountNumber;
    protected double ballance;
    protected Customer customer;

    protected List<Account> accounts;

    public Account(Customer customer) {
        this.agency = Account.DEFAULT_AGENCY;
        this.accountNumber = Account.SEQUENTIAL++;
        this.ballance = 0;
        this.customer = customer;
    }

    public int getAgency() {
        return agency;
    }

    public int getAccount() {
        return accountNumber;
    }

    public double getBallance() {
        return ballance;
    }

    @Override
    public void withdraw(double value) {
        ballance -= value;
    }

    @Override
    public void deposit(double value) {
        ballance += value;
    }

    @Override
    public void transfer(double value, IAccount destinationAccount) {
        this.withdraw(value);
        destinationAccount.deposit(value);
    }

    @Override
    public void loan(double value) {
        this.deposit(value);
    }

    @Override
    public void loanPayment(double value) {
        this.withdraw(value);
    }

    public void initializeAccountList() {
        this.accounts = new ArrayList<>();
    }

    @Override
    public void printAccountBallance() {
        System.out.println("=====================================");
        System.out.printf("Name: %s%n", this.customer.getName());
        System.out.printf("Agency: %d%n", this.agency);
        System.out.printf("Name: %d%n", this.accountNumber);
        System.out.printf("Ballance: %.2f%n", this.ballance);
        System.out.println("=====================================");
    }
}
