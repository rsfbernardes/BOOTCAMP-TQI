package br.com.dio.collection.list;

import java.util.*;

public class ExemploList {

    public static void main(String[] args) {
        // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

        //  List notas = newArrayList(); //antes do java 5
        //  List<Double> notas = new ArrayList<>(); //Generics(jdk 5) - Diamond Operator (jdk 7)
        //  ArrayList<Double> notas = new ArrayList<>();
        //  List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        /*  List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
            notas.add(10d);
            System.out.println(notas);
        */
        /*  List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
            notas.add(1d);
            notas.remove(5d);
            System.out.println(notas);
        */

        System.out.println("Crie uma lista e adicione as sete notas: ");

        List<Double> notas = new ArrayList<>();

        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);

        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d) + " " + notas);

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5.0),6.0);
        System.out.println(notas.toString());

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5.0));

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        for (Double nota: notas) System.out.println(nota);

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("Exiba a soma das notas: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        System.out.println("Exiba a média das notas: " + (soma/notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){    // notas.removeIf(next -> next < 7d);
            Double next = iterator1.next();
            if (next < 7d) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());

        /*
        Resolva esses exercícios utilzando os métodos da implementação LinkedList:

        System.out.println("Crie uma lista chamada notas2 " +
            "e coloque todos os elementos da List ArrayList nessa nova Lista: ");

            System.out.println("Mostre a primeira nota da nota lista sem removê-lo: ");

            System.out.println("Mostre a primeira nota da nova Lista removendo-o: ")
        */

        System.out.println("Crie uma lista chamada notas2 " +
                "e coloque todos os elementos da List ArrayList nessa nova Lista: ");

        List<Double> notas2 = new LinkedList<>();

        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);

        System.out.println("notas2 = " + notas2.toString());

        System.out.println("Mostre a primeira nota da lista sem removê-lo: " + notas2.get(0));
        System.out.println("notas2 = " + notas2.toString());

        System.out.println("Mostre a primeira nota da nova Lista removendo-o: " + notas2.remove(0));
        System.out.println("notas2 = " + notas2.toString());
    }
}
