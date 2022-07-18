package dio.com;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Set<Car> hashSetCars = new HashSet<>();

        hashSetCars.add(new Car("Chevrolet"));
        hashSetCars.add(new Car("Fiat"));
        hashSetCars.add(new Car("Peugeot"));
        hashSetCars.add(new Car("Zip"));
        hashSetCars.add(new Car("Alfa Romeu"));
        hashSetCars.add(new Car("Ford"));

        System.out.println(hashSetCars);

        Set<Car> treeSetCars = new TreeSet<>();

        treeSetCars.add(new Car("Chevrolet"));
        treeSetCars.add(new Car("Fiat"));
        treeSetCars.add(new Car("Peugeot"));
        treeSetCars.add(new Car("Zip"));
        treeSetCars.add(new Car("Alfa Romeu"));
        treeSetCars.add(new Car("Ford"));

        System.out.println(treeSetCars);
    }
}
