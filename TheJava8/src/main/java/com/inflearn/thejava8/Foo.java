package com.inflearn.thejava8;

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
        int baseNumber = 10;
        RunSomething runSomething = number -> number + baseNumber;

    }
}
