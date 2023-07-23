package com.inflearn.thejava8;

/**
 * 함수형 인터페이스 (Functional Interface)
 * - 추상 메서드를 딱 1개만 가지고 있는 인터페이스 ✨
 * - SAM(Single Abstract Method) 인터페이스
 * - @FuncationInterface 어노테이션을 가지고 있는 인터페이스
 */
@FunctionalInterface
public interface RunSomething {
    int doIt(int number);

}
