package org.example.thisjava.self;

public class Account {
    private String ano;
    private String ownner;
    private int balance;

    public Account(String ano, String ownner, int balance) {
        this.ano = ano;
        this.ownner = ownner;
        this.balance = balance;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getOwnner() {
        return ownner;
    }

    public void setOwnner(String ownner) {
        this.ownner = ownner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}

