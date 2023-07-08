package org.example;
/**
 * 문제
 * 배열을 활용하여 쇼핑몰에서 구매 가능한 신발 사이즈 옵션을 
 * 출력하는 프로그램을 작성하시오
 * 조건
 * -> 신발 사이즈는 250 부터 295까지 5 단위로 증가
 * -> 신발 사이즈 수는 총 10 가지
 * 출력
 * 사이즈 250 (재고 있음)
 * 사이즈 255 (재고 있음)
 * ...
 * 사이즈 295 (재고 있음)
 */
public class _Quiz_05 {
    public static void main(String[] args) {
        int[] sizeArr = new int[10];
        int minSize = 250;

        for (int i = 0; i < sizeArr.length; i++) {
            sizeArr[i] = minSize; // 250 + (5 * i)
            minSize += 5;
        }

        for (int size: sizeArr) {
            System.out.println("사이즈 " + size + " (재고 있음)");
        }
    }
}
