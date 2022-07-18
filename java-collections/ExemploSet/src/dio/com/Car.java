package dio.com;

import java.util.Objects;

public class Car implements Comparable<Car>{

    private final String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        return this.getBrand().compareToIgnoreCase(o.getBrand());
    }
}
