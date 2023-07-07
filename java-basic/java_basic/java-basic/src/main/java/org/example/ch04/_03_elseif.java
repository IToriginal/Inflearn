package org.example.ch04;

public class _03_elseif {
    public static void main(String[] args) {
        // 조건문 elseif
        // 한라봉 에이드가 있으면 주문 -> 없다면 망고 쥬스 -> 없으면 아이스 아메리카노

        boolean hallabongAde = false;
        boolean mangoJuice = false;
        System.out.println("주문서 #1");

        if (hallabongAde == true) {
            System.out.println("한라봉 에이드 + 1");
        } else if (mangoJuice == true) {
            System.out.println("망고 쥬스 + 1");
        } else {
            System.out.println("아이스 아메리카노 + 1");
        }
        System.out.println("주문이 완료 되었습니다.");

        // * else if 는 여러번 사용이 가능하다.
        boolean orangeJuice = true;
        System.out.println("주문서 #2");

        if (hallabongAde == true) {
            System.out.println("한라봉 에이드 + 1");
        } else if (mangoJuice == true) {
            System.out.println("망고 쥬스 + 1");
        } else if (orangeJuice == true) {
            System.out.println("오렌지 쥬스 + 1");
        } else {
            System.out.println("아이스 아메리카노 + 1");
        }
        System.out.println("주문이 완료 되었습니다.");
    }
}
