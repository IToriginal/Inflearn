package org.example.ch04;

public class _05_for {
    public static void main(String[] args) {

        // 반복문 for
        for (int i = 1; i <= 10 ; i++) {
            if (i < 4) {
                System.out.println("itoriginal에 오신 "+ i + "번째 손님 환영합니다.");
            } else if (i < 7) {
                System.out.println("어서오세요 " + i + "번째 손님 itoriginal에 오신 것을 환영합니다.");
            } else {
                System.out.println("어서오세요 " + i + "번째 손님 originalit에 오신 것을 환영합니다");
            }
        }

        // 짝수만 출력: 02468
        for (int i = 0; i < 10; i += 2) {
            System.out.print(i);
        }
        System.out.println();

        // 홀수만 출력: 13579
        for (int i = 1; i < 10; i += 2) {
            System.out.print(i);
        }
        System.out.println();

        // 거꾸로 숫자: 54321
        for (int i = 5; i > 0; i--) {
            System.out.print(i);
        }
        System.out.println();

        // 1부터 10까지의 수의 합: 55
        int sumI = 0;
        for (int i = 1; i <= 10; i++) {
            sumI += i;
        }
        System.out.println(sumI);
    }
}
