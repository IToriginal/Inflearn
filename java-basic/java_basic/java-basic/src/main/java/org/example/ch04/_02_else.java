package org.example.ch04;

import java.time.LocalDateTime;

public class _02_else {
    public static void main(String[] args) {
        // 조건문 if else
        // 오후 2시가 넘지 않았으면 카페인이 들어있는 아이스 아메리카노를 주문하고
        // 시간이 늦었다면(오후 2시가 넘었다면) 디카페인의 아이스 아메리카노를 주문
        System.out.println("주문 #1");
        int hour = 10;
        if (hour < 14) {
            System.out.println("(카페인)ICE 아메리카노 + 1");
        } else {
            System.out.println("(디카페인)ICE 아메리카노 + 1");
        }
        System.out.println("주문해주셔서 감사합니다.");

        // 오후 2시 이후이거나 오늘 커피를 마신 적이 있는 경우? 디카페인
        System.out.println("주문 #2");
        hour = 15;
        boolean todayCoffee = true;
        if (hour >= 14 || todayCoffee == true) {
            System.out.println("(디카페인)ICE 아메리카노 + 1");
        } else {
            System.out.println("(카페인)ICE 아메리카노 + 1");
        }
        System.out.println("주문해주셔서 감사합니다.");
    }
}
