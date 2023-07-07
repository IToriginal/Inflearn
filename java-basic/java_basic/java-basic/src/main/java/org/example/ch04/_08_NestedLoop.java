package org.example.ch04;

public class _08_NestedLoop {
    public static void main(String[] args) {
        // 이중 반복문

        // 별(*) 찍기: 사각형 만들기 ( 5 x 5 )
        /*

         *****
         *****
         *****
         *****
         *****

         */

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("========== NEXT EXAMPLE");

        // 별(*) 찍기: 왼쪽 직각 삼각형 만들기
        /*

         *
         **
         ***
         ****
         *****

         */

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("========== NEXT EXAMPLE");

        // 별(*) 찍기: 오른쪽 직각 삼각형 만들기
        /*

             *
            **
           ***
          ****
         *****

         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
