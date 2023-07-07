package org.example.ch04;

public class _10_break {
    public static void main(String[] args) {
        // break
        // 치킨 집에서 매일 20마리만 판매하는 상황 (1인당 1마리만 구매 가능)

        // for 문
        int max = 20;
        for (int guest = 1; guest <= 50 ; guest++) {
            System.out.println(guest + "번 손님, 주문하신 치킨 나왔습니다.");
            if (guest == max) {
                System.out.println("금일 재료가 모두 소진 되었습니다.");
                break; // 반복문을 탈출
            }
        }
        System.out.println("영업을 종료합니다.");

        System.out.println("---------------------- NEXT EXAMPLE");
        // while 문
        int index = 1; // 손님 대기 번호
        while (index <= 50) {
            System.out.println(index + "번 손님, 주문하신 치킨 나왔습니다.");
            if (index == max) {
                System.out.println("금일 재료가 모두 소진 되었습니다.");
                break;
            }
            index++;
        }
        System.out.println("영업을 종료합니다.");
    }
}
