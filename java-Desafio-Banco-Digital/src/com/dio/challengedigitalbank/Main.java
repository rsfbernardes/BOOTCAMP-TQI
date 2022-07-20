package com.dio.challengedigitalbank;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Account> accounts = new ArrayList<>();

        Customer joao = new Customer("Joao", "123456789");
        CurrentAccount joaoAccount = new CurrentAccount(joao);
        accounts.add(joaoAccount);

        Customer maria = new Customer("Maria", "987654321");
        SavingAccount mariaAccount = new SavingAccount(maria);
        accounts.add(mariaAccount);

        joaoAccount.printAccountBallance();
        mariaAccount.printAccountBallance();

        joaoAccount.deposit(1000.00);
        joaoAccount.printAccountBallance();
        joaoAccount.transfer(500.00, mariaAccount);
        joaoAccount.withdraw(100.00);

        mariaAccount.loan(10000.00);
        mariaAccount.loanPayment(1000.00);

        joaoAccount.printAccountBallance();
        mariaAccount.printAccountBallance();

        System.out.println(accounts);
    }
}
