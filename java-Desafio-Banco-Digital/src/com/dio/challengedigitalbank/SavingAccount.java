package com.dio.challengedigitalbank;

public class SavingAccount extends Account{

    public SavingAccount(Customer customer) {
        super(customer);
    }

    @Override
    public String toString() {
        return "SavingAccount{" +
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
