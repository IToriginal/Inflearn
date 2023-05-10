package org.example;

public class _Quiz_03 {
    public static void main(String[] args) {

        String id = "901231-1234567"; // 주민등록번호 13자리
        System.out.println(id.substring(0, 8)); // 0 위치 부터 8 위치 직전까지
        id = "030708-4567890";
        System.out.println(id.substring(0, id.indexOf("-") + 2));
    }
}
