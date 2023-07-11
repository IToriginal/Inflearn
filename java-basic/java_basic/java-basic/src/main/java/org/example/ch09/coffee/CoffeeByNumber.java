package org.example.ch09.coffee;

public class CoffeeByNumber {
    public int waittingNumber;

    public CoffeeByNumber(int waittingNumber) {
        this.waittingNumber = waittingNumber;
    }

    public void ready() {
        System.out.println("커피 준비 완료: " + waittingNumber);
    }
}
