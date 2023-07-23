package com.inflearn.thejava8;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/**
 * 람다
 * - (인자리스트) -> {바디}
 * 인자 리스트
 * - 인자가 없을 때: ()
 * - 인자가 한개일 때: (one) 또는 one
 * - 인자가 여러 개일 때: (one, two)
 * - 인자의 타입은 생략이 가능하다. 컴파일러가 추론(infer) 하지만, 명시할 수 있다. (Integer one, Integer two)
 * 바디
 * - 화살표 오른쪽에 함수 본문을 정의한다.
 * - 여러 줄인 경우는 {} 블럭으로 묶는다.
 * - 한 줄의 경우는 {}을 생략하고, return도 생략이 가능하다.
 * 변수 캡처(Variable Capture)
 * - 로컬 변수 캡처
 *   -> final이거나 effective final인 경우에만 참조할 수 있다.
 *   -> 그렇지 않을 경우 concurrency 문제가 생길 수 있기 때문에 컴파일러가 이를 방지한다.
 * - effective final
 *   -> 자바8부터 지원하는 기능으로 "사실상" final인 변수
 *   -> final 키워드를 사용하지 않은 변수를 익명 클래스 구현체 또는 람다에서 참조할 수 있다.
 * - 익명 클래스 구현체와 달리 '쉐도윙'하지 않는다.
 *   -> 익명 클래스는 새로운 Scope을 생성하지만, 람다는 람다를 감싸고 있는 Scope과 같다.
 */
public class Lambda {
    public static void main(String[] args) {
        Lambda lambda = new Lambda();
        lambda.run();
        // Supplier<Integer> get10 = () -> 10;
        // BinaryOperator<Integer> sum = (a, b) -> a + b;
    }

    private void run() {
        final int baseNumber = 10;

        // 로컬 클래스
        class localClass {
            void printBaseNumber() {
                int baseNumber = 11;
                System.out.println(baseNumber); // 11
            }
        }

        // 익명 클래스
        Consumer<Integer> integerConsumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer baseNumber) {
                System.out.println(baseNumber);
            }
        };

        // 람다
        IntConsumer printInt = (i) -> {
            System.out.println(i + baseNumber);
        };

        printInt.accept(10);
    }
}
