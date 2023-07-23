package com.inflearn.thejava8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/**
 * 자바에서 함수형 프로그래밍
 * - 함수를 First class object로 사용할 수 있다.
 * - 순수 함수(Pure function):
 *    -> 사이드 이팩트가 없다. (함수 밖에 있는 값을 변경하지 않는다.)
 *    -> 상태가 없다. (함수 밖에 있는 값을 사용하지 않는다.)
 * - 고차 함수(Higher-Order Function)
 *    -> 함수가 함수를 매개변수로 받을 수 있고 함수를 리턴할 수도 있다.
 * - 불변성
 */
public class Foo {
    public static void main(String[] args) {

        // Function<Integer, Integer> plus10 = (number) -> number + 10;
        // Function<Integer, Integer> multiply2 = (number) -> number * 2;
        // Funtion<Integer, Integer> == UnaryOperator<Integer> 타입이 같을 때 사용 가능
        UnaryOperator<Integer> plus10 = (number) -> number + 10;
        UnaryOperator<Integer> multiply2 = (number) -> number * 2;

        Function<Integer, Integer> plus10AndThenMultiply2 = plus10.andThen(multiply2);
        System.out.println(plus10AndThenMultiply2.apply(2)); // (2 + 10) * 2 = 24

        Function<Integer, Integer> multiply2ComposePlus10 = plus10.compose(multiply2);
        System.out.println(multiply2ComposePlus10.apply(2)); // 2 * 2 + 10 = 14

        Consumer<Integer> printT = (i) -> System.out.println(i);
        printT.accept(10);

        Supplier<Integer> get10 = () -> 10;
        System.out.println(get10);

        Predicate<String> startsWithName = (s) -> s.startsWith("hu");
        boolean startsWithNameResult = startsWithName.test("hun");
        System.out.println(startsWithNameResult); // true
        Predicate<Integer> isEven = (i) -> i % 2 == 0;
        boolean isEvenResult = isEven.test(10);
        System.out.println(isEvenResult); // true
    }
}
