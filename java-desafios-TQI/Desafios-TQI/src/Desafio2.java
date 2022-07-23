/*
Faça um programa que calcule e mostre o volume de uma esfera sendo fornecido o valor de seu raio (R).
A fórmula para calcular o volume é: (4/3) * pi * R3. Considere (atribua) para pi o valor 3.14159.
Dica: Ao utilizar a fórmula, procure usar (4/3.0) ou (4.0/3), pois algumas linguagens (dentre elas o C++),
assumem que o resultado da divisão entre dois inteiros é outro inteiro.
 */

// Abaixo segue um exemplo de código que você pode ou não utilizar
import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //TODO: Complete os espaços em branco com uma possível solução para o desafio
        double pi = 3.14159;
        double R = sc.nextDouble();
        double volume = (4.0/3) * pi * (Math.pow(R, 3.0));
        System.out.printf("VOLUME = %.3f%n", volume);
    }

}
