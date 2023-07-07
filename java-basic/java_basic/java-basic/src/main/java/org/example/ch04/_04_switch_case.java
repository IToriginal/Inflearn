package org.example.ch04;

public class _04_switch_case {
    public static void main(String[] args) {
        // 석차에 따른 장학생에게 장학금 지급 시스템
        // 1등: 전액 장학금
        // 2등과 3등: 반액 장학금
        // 그 외: 장학금의 대상이 아님

        int ranking = 1;

        // If문으로 구현
        /*
        if (ranking == 1) {
            System.out.println("전액 장학금 대상입니다.");
        } else if (ranking == 2 || ranking == 3) {
            System.out.println("반액 장학금 대상입니다.");
        } else {
            System.out.println("아쉽게도 장학금 대상이 아닙니다.");
        }
        System.out.println("조회가 완료되었습니다.");
         */

        // Switch 문으로 구현
        switch (ranking) {
            case 1 -> System.out.println("전액 장학금 대상입니다.");
            case 2, 3 -> System.out.println("반액 장학금 대상입니다.");
            default -> System.out.println("아쉽게도 장학금 대상이 아닙니다.");
        }
        System.out.println("조회가 완료되었습니다.");

        // 중고 상품의 등급에 따른 가격을 측정하는 시스템 (1급: 최상 ~ 4급: 최하)
        int grade = 1;
        int price = 7000; // 기본 가격
        switch (grade) {
            case 1:
                price += 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;
        }
        System.out.println(grade + "등급 제품의 가격: " + price + "원");
        // 1등급 제품의 가격: 10000원
        // 2등급 제품의 가격: 9000원

    }
}
