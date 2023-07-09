package org.example.ch06;

public class _06_WhenToUseMethod {
    public static int getPower(int number) {
        // Method 내에 Method를 사용할 수 있다.

        // return number * number;
        return getPower(number, 2);
    }
    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
    public static void main(String[] args) {
        // 메소드가 필요한 이유?
        // 코드를 간결하게: 중복되는 코드를 메소드로 정의해서 양을 줄이고 코드의 유지보수가 쉬워진다.

        // 2의 2승 구하기
        System.out.println(getPower(2, 2)); // 2 * 2 = 4
        System.out.println(getPower(2));

        // 3의 3승을 구하기
        System.out.println(getPower(3, 3)); // 3 * 3 * 3 = 27

        // 4의 2승을 구하기
        System.out.println(getPower(4, 2)); // 4 * 4 = 16
    }
}
