package org.example;

/**
 * 문제: 개인 정보 중 일부를 비공개로 전환하는 프로그램을 작성하시오.
 * 증명서의 정보
 * 인자바 -> 인**
 * 941130-1234567 -> 941130-1******
 * 010-1234-5678 -> 010-1234-****
 *
 * 조건:
 * 1. 개인정보를 비공개로 전환하는 메소드 작성
 * 2. 하나의 메소드에서 모든 동작을 처리
 * 3. 각 정보는 아래의 위치부터 비공개 적용
 * 이름: 2번째 글자 (인"자바")
 * 주민등록번호: 9번째 글자(941130-1"234567")
 * 전화번호: 10번째 글자(010-1234-"5678")
 *
 * 코드:
 * 주어진 코드의 getHiddenData(...) 메소드를 완성하시오
 *
 * Hint:
 * subString()을 이용하면 문자열 일부를 자를 수 있음
 * length()를 이용하면 문자열 길이를 알 수 있음
 */
public class _Quiz_06 {
    public static String getHiddenData(String data, int idx) {
        String hiddenData = data.substring(0, idx); // 인자바 -> 인
        for (int i = idx; i < data.length(); i++) {
            hiddenData += "*"; // 인**
        }
        return hiddenData;
    }

    public static void main(String[] args) {
        String name = "인자바"; // 이름
        String id = "941130-1234567"; // 주민등록번호
        String phone = "010-1234-5678"; // 전화번호

        System.out.println("이름: " + getHiddenData(name, 1)); // 개인정보, 비공개 시작 위치
        System.out.println("주민등록번호: " + getHiddenData(id, 8));
        System.out.println("전화번호: " + getHiddenData(phone, 9));
    }
}
