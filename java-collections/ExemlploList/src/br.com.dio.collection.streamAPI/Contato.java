package br.com.dio.collection.streamAPI;

import java.util.Objects;

public class Contato {
    private String name;
    private Integer number;

    public Contato(String name, Integer number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato contato)) return false;
        return Objects.equals(name, contato.name) && Objects.equals(number, contato.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number);
    }

    @Override
    public String toString() {
        return "Contato{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
