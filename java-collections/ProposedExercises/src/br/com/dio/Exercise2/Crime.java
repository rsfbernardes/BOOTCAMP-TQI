package br.com.dio.Exercise2;

/*
Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime.
As perguntas são:
1. Telefonou para a vítima?
2. Esteve no local do crime?
3. Mora perto da vítima?
4. Devia para a vítima?
5. Já trabalhou com a vítima?

Se a pessoa responder positivamente a 2 questões ela deve ser classificada como suspeita,
entre 3 e 4 como cúmplice e 5 como Assassina.
Caso contrário, ela será classificada como inocente.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Crime {

    public static void main(String[] args) {

        List<Integer> responses = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int count = 0;

        System.out.println("1. Called to the victim? Type 1 for Yes or any for No");
        responses.add(scan.nextInt());
        System.out.println("2. Have been at the scene? Type 1 for Yes or any for No");
        responses.add(scan.nextInt());
        System.out.println("3. Live close to the victim? Type 1 for Yes or any for No");
        responses.add(scan.nextInt());
        System.out.println("4. Owed to the victim? Type 1 for Yes or any for No");
        responses.add(scan.nextInt());
        System.out.println("5. Have you ever worked with the victim? Type 1 for Yes or any for No");
        responses.add(scan.nextInt());

        for (int response:responses) {
            if (response == 1) count++;
        }

        switch (count) {
            case 2 -> System.out.println("Suspect!");
            case 3, 4 -> System.out.println("Accomplice!");
            case 5 -> System.out.println("Murderer!");
            default -> System.out.println("Innocent!");
        }
    }
}
