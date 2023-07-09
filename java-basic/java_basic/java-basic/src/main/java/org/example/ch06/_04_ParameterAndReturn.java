package org.example.ch06;

public class _04_ParameterAndReturn {
    public static int getPower(int num) {
        int result = num * num;
        return result;
    }

    public static int getPowerByExp(int num, int exponent) {
            int result = 1;
            for (int i = 0; i < exponent; i++) {
                result *= num;
            }
            return result;
    }
    public static void main(String[] args) {
        // 전달값과 반환값이 있는 메소드

        int num = 2;
        int returnValue = getPower(num); // 2 * 2 = 4;

        System.out.println(num + "의 2 승은 " + returnValue);

        int exponent = 3;
        returnValue = getPowerByExp(num, exponent);
        System.out.println(num + "의 " + exponent + " 승은 " + returnValue);
        System.out.println(getPowerByExp(2, 3));
    }
}
