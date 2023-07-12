package org.example.ch10;

public class _01_AnnoymousClass1 {
    public static void main(String[] args) {
        // 익명 클래스 - 이름이 없는 클래스
        Coffee c1 = new Coffee();
        c1.order("아메리카노");

        System.out.println("-------------------- 구분선 --------------------");

        Coffee c2 = new Coffee();
        c2.order("아이스라떼");

        System.out.println("-------------------- 구분선 --------------------");

        // VIP 손님 방문 (서비스를 제공)
        Coffee vipCoffee = new Coffee() {
            @Override
            public void order(String coffee) {
                super.order(coffee);
                System.out.println("케이크는 서비스입니다.");
            }

            @Override
            public void returnTray() {
                System.out.println("감사합니다. 또 방문 해주세요");
            }
        };
        vipCoffee.order("바닐라라떼");
        vipCoffee.returnTray();
    }
}

class Coffee {
    public void order(String coffee) {
        System.out.println("주문하신 " + coffee + " 나왔습니다.");
    }

    public void returnTray() {
        System.out.println("커피 반납이 완료 되었습니다.");
    }
}
