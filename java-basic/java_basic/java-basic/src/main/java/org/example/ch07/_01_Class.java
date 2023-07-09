package org.example.ch07;
/**
 * 객체 지향 프로그래밍 (OOP: Object-Oriented Programming)
 * 유지보수가 용이
 * 코드의 재사용성이 높음
 */
public class _01_Class {
    public static void main(String[] args) {

        /**
         * 차량용 블랙박스
         * 정보: 모델명, 해상도, 가격, 색상
         */
        // 기존 제품
        String modelName = "까망이";
        String resolution = "FHD";
        int price = 200000;
        String color = "Black";

        // 새로운 제품을 개발
        String newModelName = "하양이";
        String newResolution = "UHD";
        int newPrice = 300000;
        String newColor = "White";

        // 또 다른 제품을 개발?
        BlackBox bbox = new BlackBox();
        // BlackBox 클래스로부터 bbox 객체를 생성
        // bbox 객체는 BlackBox 클래스의 인스턴스

        BlackBox bbox2 = new BlackBox();
    }
}
