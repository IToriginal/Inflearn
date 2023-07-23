package com.inflearn.thejava8;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * 메소드 레퍼런스
 * 람다가 하는 일이 기존 메소드 또는 생성자를 호출하는 거라면, 메소드 레퍼런스를 사용해 매우 간결하게 표현할 수 있다.
 *
 * 스태틱 메소드 참조 = 타입::스태틱 메소스
 * 특정 객체의 인스턴스 메소드 참조 = 객체 레퍼런스::인스턴스 메소드
 * 임의 객체의 인스턴스 메소드 참조 = 타입::인스턴스 메소드
 * 생성자 참조 = 타입::new
 *
 * - 메소드 또는 생성자의 매개변수로 람다의 입력값을 받는다.
 * - 리턴값 또는 생성한 객체는 람다의 리턴값이다.
 */
public class App {
    public static void main(String[] args) {
        Function<String, Greeting> huGreeting = Greeting::new;
        Greeting hu = huGreeting.apply("hu");
        System.out.println(hu.getName());

        Supplier<Greeting> newGreeting = Greeting::new;

        String[] names = {"java", "c", "c++"};
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));
    }
}
