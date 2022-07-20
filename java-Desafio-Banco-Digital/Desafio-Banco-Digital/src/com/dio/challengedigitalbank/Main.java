package com.dio.challengedigitalbank;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        int menu;
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("*** Digital Bank ***");
//        System.out.println("1 - Create an account");
//        System.out.println("2 - Log into an account");
//        System.out.println("");
//        System.out.println("");

        Customer Rodrigo = new Customer("Rodrigo", "06751639600");
        CurrentAccount rodrigoAccount = new CurrentAccount(Rodrigo);
        Customer Denise = new Customer("Denise", "06525800684");
        SavingAccount deniseAccount = new SavingAccount(Denise);

        System.out.println(rodrigoAccount);
        System.out.println(deniseAccount);

        rodrigoAccount.deposit(1000.00);
        rodrigoAccount.printAccountBallance();
        rodrigoAccount.transfer(500.00, deniseAccount);
        rodrigoAccount.withdraw(100.00);

        deniseAccount.loan(10000.00);

        rodrigoAccount.printAccountBallance();
        deniseAccount.printAccountBallance();




    }
}
