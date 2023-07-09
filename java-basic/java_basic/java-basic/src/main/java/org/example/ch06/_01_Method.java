package org.example.ch06;

// 메소드(함수): 어떤 기능들을 하는 코드들의 묶음
public class _01_Method {
    public static void sayHello() {
        // 메소드 정의
        // 일반적으로 메소드의 이름은 동사로 많이 네이밍을 한다.
        System.out.println("안녕하세요? 메소드 입니다.");
    }

    public static void main(String[] args) {
        // 메소드 호출
        System.out.println("메소드 호출 전");
        sayHello();
        // 메소드는 설정하고 나면 얼마든지 사용이 가능하다.
        sayHello();
        sayHello();
        System.out.println("메소드 호출 후");
    }
}
