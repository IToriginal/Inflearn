package org.example.ch04;

public class _09_multipleTable {
    public static void main(String[] args) {
        // 구구단 출력하기: 2단 ~ 9단
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j ++) {
                System.out.println(i + " x " + j + " = " + (i*j));
            }
            System.out.println();
        }
    }
}
