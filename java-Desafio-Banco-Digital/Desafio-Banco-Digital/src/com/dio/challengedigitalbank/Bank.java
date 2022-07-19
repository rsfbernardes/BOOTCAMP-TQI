package com.dio.challengedigitalbank;

import java.util.List;

public class Bank {

    private String nome;
    private List<Account> accounts;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Account> getContas() {
        return accounts;
    }

    public void setContas(List<Account> contas) {
        this.accounts = contas;
    }
}