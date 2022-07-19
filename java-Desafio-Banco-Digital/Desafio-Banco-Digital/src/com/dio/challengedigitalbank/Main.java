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
        Account rodrigoAccount = new Account(Rodrigo);

        System.out.println(rodrigoAccount);





    }
}
