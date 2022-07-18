package br.com.dio.collections.streamAPI.exercises;

import java.util.*;
import java.util.stream.Collectors;

public class StreamAPIExercises {

    public static void main(String[] args) {

        List<String> randomNumbers = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Print all of the elements of the String list: ");
        randomNumbers.forEach(System.out::println);

        System.out.println("Take the first 5 elements and put them in a Set: ");
        randomNumbers.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println("Transform the list on a list of integers numbers: ");
        List<Integer> collectList = randomNumbers.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println(collectList);

        System.out.println("Take the pair numbers and greater than 2 and put them in a list: ");
        List<Integer> collectList2 = randomNumbers.stream()
                .map(Integer::parseInt)
                .filter(i -> i % 2 == 0 && i > 2)
                .collect(Collectors.toList());
        System.out.println(collectList2);

        System.out.println("Show the average of the numbers: ");
        randomNumbers.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("Remove the odd numbers");
        List<Integer> List2 = randomNumbers.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List2.removeIf(number -> number % 2 != 0);
        System.out.println(List2);

        System.out.println("Ignore the first three numbers of the list and print the rest: ");
        randomNumbers.stream()
                .skip(3)
                .forEach(System.out::println);

        System.out.println("Removing the repeated numbers from the list, how many numbers are left?");
        List<String> List3 = randomNumbers.stream()
                .distinct()
                .toList();
        int List3Size = List3.size();
        System.out.println("There are " + List3Size + " numbers: " + List3);

        System.out.println("Show the lowest value in the list");
        OptionalInt min = randomNumbers.stream()
                .mapToInt(Integer::parseInt)
                .min();
        System.out.println(min);

        System.out.println("Show the biggest value in the list");
        OptionalInt max = randomNumbers.stream()
                .mapToInt(Integer::parseInt)
                .max();
        System.out.println(max);

        System.out.println("Take only the odd numbers and add them: ");
        int sum = randomNumbers.stream()
                .mapToInt(Integer::parseInt)
                .filter(number -> number % 2 != 0)
                .sum();
        System.out.println("The sum of the odd numbers is: " + sum);

        System.out.println("Show the list in the numeric order: ");
        randomNumbers.stream()
                .mapToInt(Integer::parseInt)
                .sorted()
                .forEach(System.out::println);


        System.out.println("Group together odd numbers multiples of 3 and 5");
        Map<Boolean, List<Integer>> MultiplesOf3And5 = randomNumbers.stream()
                .map(Integer::parseInt)
                .collect(Collectors.groupingBy(
                        number -> (number % 3 ==0 || number % 5 == 0)));
        System.out.println(MultiplesOf3And5);

    }
}
