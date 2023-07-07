package org.example;

/**
 * 문제: 조건문을 활용하여 주차 요금 정산 프로그램을 작성하시오.
 * 조건
 * -> 주차 요금은 시간당 4000 원 (일일 최대 요금은 30000 원)
 * -> 경차 또는 장애인 차량은 최종 요금에서 50% 할인을 적용
 * 예시
 * -> 일반 차량 5시간 주차 시 20000 원
 * -> 경차 5시간 주차 시 10000 원
 * -> 장애인 차량 10시간 주차 시 15000 원
 */
public class _Quiz_04 {
    public static void main(String[] args) {
        int hour = 10; // 주차 시간
        boolean smallCar = false; // 경차 차량 여부
        boolean disabledCar = true; // 장애인 차량 여부
        int pay = hour * 4000; // 시간당 기본 요금

        if (pay > 30000) {
            pay = 30000;
        }

        if (smallCar || disabledCar) {
            pay = pay / 2;
        }
        System.out.println("주차 요금은 " + pay + "원 입니다.");
    }
}
