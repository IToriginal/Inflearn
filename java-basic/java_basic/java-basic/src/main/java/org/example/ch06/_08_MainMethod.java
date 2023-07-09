package org.example.ch06;

public class _08_MainMethod {
    public static void main(String[] args) {
        // 메인 메소드: Java 프로그램이 실행될 때 가장 먼저 진입되는 Method
        for (String s: args) {
            System.out.println(s);
        }

        /**
         * 1. 도서 조회
         * 2. 도서 대출
         * 3. 도서 반납
         */
        if (args.length == 1) {
            switch (args[0]) {
                case "1" -> {
                    System.out.println("도서조회 메뉴 입니다.");
                }
                case "2" -> {
                    System.out.println("도서 대출 메뉴 입니다.");
                }
                case "3" -> {
                    System.out.println("도서 반납 메뉴 입니다.");
                }
                default -> {
                    System.out.println("잘못 입력하셨습니다.");
                }
            }
        } else {
            System.out.println("사용법: 1 ~ 3 메뉴 중 하나를 입력하세요.");
        }
    }
}
