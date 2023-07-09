package org.example.ch06;

public class _02_Parameter {
    public static void power(int num) { // num: Parameter, 매개변수
        int result = num * num;
        System.out.println(num + " 의 2 승은 " + result);
    }

    // 매개변수는 2개 이상을 지정할 수 있다.
    public static void powerByExp(int num, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= num;
        }
        System.out.println(num + " 의 " + exponent + " 승은 " + result );
    }

    public static void main(String[] args) {
        // 전달값, Parameter
        // 2 -> 2 * 2 = 4
        // 3 -> 3 * 3 = 9

        // Argument: 인수 - 2, 3
        power(2); // 2 * 2 = 4
        power(3); // 3 * 3 = 9
        powerByExp(2, 3); // 2 * 2 * 2 = 8
        powerByExp(3, 3);
        powerByExp(10, 0);
    }
}
