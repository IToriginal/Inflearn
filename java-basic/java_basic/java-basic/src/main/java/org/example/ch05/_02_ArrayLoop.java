package org.example.ch05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        // 배열의 순회
        String[] coffees = {"아메리카노", "카페모카", "카푸치노", "라떼"};

        // for 반복문 순회
        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요");

        System.out.println("------------ 구분선 -------------");

        // enhanced for (for - each) 반복문
        for (String coffee : coffees) {
            System.out.println(coffee + " 하나");
        }
        System.out.println("주세요");
    }
}
