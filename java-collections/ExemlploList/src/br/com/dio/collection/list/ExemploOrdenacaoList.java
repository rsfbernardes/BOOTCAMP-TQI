package br.com.dio.collection.list;

/*
    Dados as seguintes informações sobre meus gatos, crie uma lista e ordene exibindo:
    (nome - idade - cor)

    Cat 1: Jon, 18, black
    Cat 2 : Simba, 6, white
    Cat 3: Jon, 12, yellow
     */

import java.util.*;

public class ExemploOrdenacaoList {

    public static void main(String[] args) {

        List<Cat> myCats = new ArrayList<>(){{
            add(new Cat("Jon", 18, "Black"));
            add(new Cat("Simba", 6, "White"));
            add(new Cat("Jon", 12, "Yellow"));
        }};

        System.out.println("--\tInsert Order:\t---");
        System.out.println(myCats);

        System.out.println("--\tRandom Order:\t---");
        Collections.shuffle(myCats);
        System.out.println(myCats);

        System.out.println("--\tName Order:\t---");
        Collections.sort(myCats);
        System.out.println(myCats);

        System.out.println("--\tAge Order:\t---");
        myCats.sort(new ComparatorAge()); // Collections.sort(myCats, new ComparatorAge());
        System.out.println(myCats);

        System.out.println("--\tColor Order:\t---");
        myCats.sort(new ComparatorColor()); // Collections.sort(myCats, new ComparatorColor());
        System.out.println(myCats);

        System.out.println("--\tName/Color/Age Order:\t---");
        myCats.sort(new ComparatorNameColorAge()); // Collections.sort(myCats, new ComparatorNameColorAge());
        System.out.println(myCats.toString());
    }
}

class Cat implements Comparable<Cat>{

    private String name;
    private int age;
    private String color;

    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat cat)) return false;
        return age == cat.age && Objects.equals(name, cat.name) && Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, color);
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int compareTo(Cat cat) {
        return this.getName().compareToIgnoreCase(cat.getName());
    }
}

class ComparatorAge implements Comparator<Cat> {
    @Override
    public int compare(Cat cat1, Cat cat2) {
        return Integer.compare(cat1.getAge(), cat2.getAge());
    }
}

class ComparatorColor implements Comparator<Cat> {
    @Override
    public int compare(Cat cat1, Cat cat2) {
        return cat1.getColor().compareToIgnoreCase((cat2.getColor()));
    }
}

class ComparatorNameColorAge implements Comparator<Cat> {

    @Override
    public int compare(Cat cat1, Cat cat2) {
        int name = cat1.getName().compareToIgnoreCase(cat2.getName());
        if (name != 0) return name;

        int color = cat1.getColor().compareToIgnoreCase(cat2.getColor());
        if (color != 0) return color;

        return Integer.compare(cat1.getAge(), cat2.getAge());
    }
}