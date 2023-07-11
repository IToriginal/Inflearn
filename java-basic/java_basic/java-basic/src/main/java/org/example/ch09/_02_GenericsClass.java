package org.example.ch09;

import org.example.ch09.coffee.Coffee;
import org.example.ch09.coffee.CoffeeByName;
import org.example.ch09.coffee.CoffeeByNickname;
import org.example.ch09.coffee.CoffeeByNumber;

/**
 * 제네릭 클래스
 */
public class _02_GenericsClass {
    public static void main(String[] args) {
        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();

        CoffeeByNickname c2 = new CoffeeByNickname("인프콘");
        c2.ready();

        System.out.println("---------- 구분선 ----------");

        CoffeeByName c3 = new CoffeeByName(34);
        c3.ready();

        CoffeeByName c4 = new CoffeeByName("엘리스");
        c4.ready();

        System.out.println("---------- 구분선 ----------");

        int c3Name = (int)c3.name;
        System.out.println("주문 고객 번호: " + c3Name);

        String c4Name = (String)c4.name;
        System.out.println("주문 고객 이름: " + c4Name);

        // c4Name = (String)c3.name; // ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String

        System.out.println("---------- 구분선 ----------");

        Coffee<Integer> c5 = new Coffee<>(35);
        c5.ready();
        int c5Name = c5.name;
        System.out.println("주문 고객 번호: " + c5Name);

        Coffee<String> c6 = new Coffee<>("마이콜");
        c6.ready();
        String c6Name = c6.name;
        System.out.println("주문 고객 이름: " + c6Name);
    }
}
