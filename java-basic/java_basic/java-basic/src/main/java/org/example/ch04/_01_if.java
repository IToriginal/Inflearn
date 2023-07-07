package org.example.ch04;

public class _01_if {
    public static void main(String[] args) {
        // 조건문 if
        int hour = 15; // 오전 10시를 의미

        // if 문 내에 하나의 문장만 존재할 때는 { } 를 생략할 수 있다.
        if (hour > 14)
            System.out.println("아이스티 + 1");

        // 2개 이상의 문장에는 { }를 생략할 수 없다.
        if (hour <= 14) {
            System.out.println("ICE 아메리카노 + 1");
            System.out.println("샷추가");
        }
        System.out.println("커피 주문이 완료되었습니다.");
    }
}
