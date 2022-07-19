package com.dio.challengedigitalbank;

public class Account implements IAccount{

    private static final int DEFAULT_AGENCY = 1;
    private static int SEQUENCY = 1;

    private int agency = DEFAULT_AGENCY;
    private int account = SEQUENCY++;
    private double ballance;
    private Customer customer;

    public Account() {
    }

    public Account(Customer customer) {
        this.ballance = 0;
        this.customer = customer;
    }

    public static int getSEQUENCY() {
        return SEQUENCY;
    }

    public static void setSEQUENCY(int SEQUENCY) {
        Account.SEQUENCY = SEQUENCY;
    }

    public int getAgency() {
        return agency;
    }

    public void setAgency(int agency) {
        this.agency = agency;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public double getBallance() {
        return ballance;
    }

    public void setBallance(double ballance) {
        this.ballance = ballance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
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
    public void printAccountBallance() {
        System.out.printf("Name: %s%n", this.customer.getName());
        System.out.printf("Agency: %d%n", this.agency);
        System.out.printf("Name: %d%n", this.account);
        System.out.printf("Name: %.2f%n", this.ballance);
    }

    @Override
    public String toString() {
        return "Account{" +
                "agency=" + agency +
                ", account=" + account +
                ", ballance=" + ballance +
                ", customer=" + customer +
                '}';
    }
}
