package com.dio.challengedigitalbank;

public class Account implements IAccount{

    private static final int DEFAULT_AGENCY = 1;
    private static int SEQUENTIAL = 1;

    protected int agency;
    protected int account;
    protected double ballance;
    protected Customer customer;

    public Account(Customer customer) {
        this.agency = Account.DEFAULT_AGENCY;
        this.account = Account.SEQUENTIAL++;
        this.ballance = 0;
        this.customer = customer;
    }

    public int getAgency() {
        return agency;
    }

    public int getAccount() {
        return account;
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

    @Override
    public void printAccountBallance() {
        System.out.printf("Name: %s%n", this.customer.getName());
        System.out.printf("Agency: %d%n", this.agency);
        System.out.printf("Name: %d%n", this.account);
        System.out.printf("Ballance: %.2f%n", this.ballance);
    }

    @Override
    public String toString() {
        return "Account{" +
                "agency=" + agency +
                ", account=" + account +
                ", ballance=" + ballance +
                ", customer{" +
                "name: " + customer.getName() +
                ",cpf: " + customer.getCpf() +
                    '}' +
                '}';
    }
}
