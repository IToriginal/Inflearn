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
    }
}
