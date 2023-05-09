package org.example;

public class _Quiz_02 {

    /**
     * 어린이 키에 따른 놀이 기구 탑승 가능 여부를 확인하는 프로그램을 작성하시오.
     * [조건] 키가 120 cm 이상인 경우만 탑승 가능 (삼항 연산자 이용)
     * [실행 결과]
     * 키가 115 cm 이므로 탑승 불가능합니다.
     * 키가 121 cm 이므로 탑승 가능합니다.
     */
    public static void main(String[] args) {

        int limitH = 120;
        int childrenH1 = 115;
        int childrenH2 = 121;

        String result1 = (childrenH1 >= limitH) ?  "가능" : "불가능";
        String result2 = (childrenH2 >= limitH) ?  "가능" : "불가능";

        System.out.println("키가 " + childrenH1 + " cm 이므로 탑승 " + result1 + "합니다.");
        System.out.println("키가 " + childrenH2 + " cm 이므로 탑승 " + result2 + "합니다.");
    }
}
