package br.com.dio.collection.streamAPI;

/*
Dadas as seguintes informações de id e contato, crie um dicionário
e ordene este dicionário exibindo (Nome id - Nome contato)

id = 1 - Contato = nome: Simba, numero: 2222;
id = 4 - Contato = nome: Cami, numero: 5555;
id = 3 - Contato = nome: Jon, numero: 1111;
 */

import java.util.*;

public class RefatoracaoOrdenacaoMap {

    public static void main(String[] args) {

        System.out.println("--\tNumber Order\t--");
        Map<Integer, Contato> agenda = new HashMap<>(){{
            put(1, new Contato("Simba", 5555));
            put(4, new Contato("Cami", 6666));
            put(3, new Contato("Jon", 2222));
        }};
        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(
                cont -> cont.getValue().getNumber()));
        set.addAll(agenda.entrySet());
        for(Map.Entry<Integer, Contato> entry : set) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumber() +
                    ": " + entry.getValue().getName());
        }

        System.out.println("--\tContact Order\t--");
        Set<Map.Entry<Integer, Contato>> set1 = new TreeSet<>(Comparator.comparing(
                cont -> cont.getValue().getName()));
        set1.addAll(agenda.entrySet());
        for(Map.Entry<Integer, Contato> entry : set1) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumber() +
                    ": " + entry.getValue().getName());
        }


    }
}
