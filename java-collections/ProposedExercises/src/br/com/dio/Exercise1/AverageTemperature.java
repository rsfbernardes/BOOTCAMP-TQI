package br.com.dio.Exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média, e
em que mês elas ocorreram (mostrar o mês por extenso: 1 - Janeiro, 2 - Fevereiro e etc).
 */

public class AverageTemperature {

    public static void main(String[] args) {

        List<Double> temperature = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        double value = 0;
        double average = 0;

        System.out.println("Type de average temperature of January: ");
        temperature.add(scan.nextDouble());
        System.out.println("Type de average temperature of February: ");
        temperature.add(scan.nextDouble());
        System.out.println("Type de average temperature of March: ");
        temperature.add(scan.nextDouble());
        System.out.println("Type de average temperature of April: ");
        temperature.add(scan.nextDouble());
        System.out.println("Type de average temperature of May: ");
        temperature.add(scan.nextDouble());
        System.out.println("Type de average temperature of June: ");
        temperature.add(scan.nextDouble());

        for (double temp : temperature) {
            value += temp;
        }
        average = value/6;
        System.out.printf("Average temperature of the semester: %.2f\n", average);

        System.out.println("Months with temperature above de average in the semester: ");
        for (int i = 0; i < temperature.size(); i++) {
            if ( i == 0 && temperature.get(i) > average) {
                System.out.printf("1 - January: %.2f\n", temperature.get(i));
            }
            if ( i == 1 && temperature.get(i) > average) {
                System.out.printf("2 - February: %.2f\n", temperature.get(i));
            }
            if ( i == 2 && temperature.get(i) > average) {
                System.out.printf("3 - March: %.2f\n", temperature.get(i));
            }
            if ( i == 3 && temperature.get(i) > average) {
                System.out.printf("4 - April: %.2f\n", temperature.get(i));
            }
            if ( i == 4 && temperature.get(i) > average) {
                System.out.printf("5 - May: %.2f\n", temperature.get(i));
            }
            if ( i == 5 && temperature.get(i) > average) {
                System.out.printf("6 - June: %.2f\n", temperature.get(i));
            }
        }
    }
}
