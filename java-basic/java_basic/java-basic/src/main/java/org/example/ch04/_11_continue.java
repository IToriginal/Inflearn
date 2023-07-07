package org.example.ch04;

public class _11_continue {
    public static void main(String[] args) {
        // continue

        // 치킨 주문 손님중에 노쇼 손님이 있다고 가정
        // for
        int max = 20; // 최대 판매 가능 수량
        int sold = 0; // 현재 판매 수량
        int pass = 17; // 대기번호 17번 손님이 노쇼

        for (int guest = 1; guest < 50; guest++) {
            System.out.println(guest + "번 손님, 주문하신 치킨 나왔습니다.");

            // 대기번호 차례의 손님이 없을 경우 (noShow 손님)
            if (guest == pass) {
                System.out.println(guest + "번 손님은 없습니다. 패스하겠습니다.");
                continue;
            }

            sold++; // 판매 처리
            if (sold == max) {
                System.out.println("금일 재료가 모두 소진 되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");

        System.out.println("===============NEXT EXAMPLE");

        // while 문
        int guestNum = 0; // 손님 번호
        sold = 0;

        while (true) {
            guestNum++;
            System.out.println(guestNum + "번 손님, 주문하신 치킨 나왔습니다.");

            // 손님이 없다면
            if (guestNum == pass) {
                System.out.println(guestNum + "번 손님은 없습니다. 패스하겠습니다.");
                continue;
            }
            sold++; // 판매 처리
            if (sold == max) {
                System.out.println("금일 재료가 소진 되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");
    }
}
