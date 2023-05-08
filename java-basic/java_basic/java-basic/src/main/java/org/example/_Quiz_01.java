package org.example;

public class _Quiz_01 {

    /**
     * 버스 도착 정보를 출력하는 프로그램을 작성하시오.
     * 각 정보는 적절한 자료형의 변수에 정의한다.
     * [1] 버스 번호는 “1234”, “상암08” 과 같은 형태
     * [2] 남은 시간은 분 단위(예: 3분, 5분)
     * [3] 남은 거리는 km 단위 (예: 1.5km, 0.8km)
     * OUTPUT
     * 상암08번 버스
     * 약 3분 후 도착
     * 남은 거리 1.2km
     */
    public static void main(String[] args) {

        final String BUS_KIND = "상암"; // 버스 종류
        String busNum = "08"; // 버스 번호
        long time = 3; // 남은 시간
        double dist = 1.2; // 남은 거리
        final String UNIT = "km"; // 거리 단위

        System.out.println(BUS_KIND + busNum + "번 버스");
        System.out.println("약 " + time + "분 후 도착");
        System.out.println("남은 거리 " + dist + UNIT);
    }
}
