package com.dio.challengedigitalbank;

public class CurrentAccount extends Account{

    public CurrentAccount(Customer customer) {
        super(customer);
    }

    @Override
    public String toString() {
        return "CurrentAccount{" +
                "agency=" + agency +
                ", account=" + accountNumber +
                ", ballance=" + ballance +
                ", customer{" +
                "name: " + customer.getName() +
                ",cpf: " + customer.getCpf() +
                '}' +
                '}';
    }
}
