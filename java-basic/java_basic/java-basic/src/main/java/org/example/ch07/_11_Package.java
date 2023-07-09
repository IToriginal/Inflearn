package org.example.ch07;

import java.util.Random;

public class _11_Package {
    /**
     * 패키지: 폴더 구조, 연관된 클래스를 묶어둔다
     */
    public static void main(String[] args) {
        // 랜덤 클래스
        Random random = new Random();
        System.out.println("랜덤 정수: " + random.nextInt()); // int의 범위 내에서 정수형 값 반환
        System.out.println("랜덤 정수 (범위): " + random.nextInt(10)); // 0 ~ 10 미만 값
        System.out.println("랜덤 실수: " + random.nextDouble()); // 0.0 ~ 1.0 미만의 실수값
        System.out.println("랜덤 실수 (범위): " + random.nextDouble(10.0)); // 0.0 ~ 10.0 미만의 실수값

        // 실수 범위 지정 5.0 ~ 10.0
        double min = 5.0;
        double max = 10.0;
        System.out.println("랜덤 실수 (범위): " + (min + (max - min) * random.nextDouble()));

        System.out.println("랜덤 boolean: " + random.nextBoolean());

        // 로또 번호: 1 ~ 45
        System.out.println("로또 번호: " + (random.nextInt(45) + 1));
        // nextInt(45): 0 이상 45 미만의 수
        // nextInt(45) + 1: 1 이상 46 미만의 수

        // Math, Scanner, StringBuilder, StringBuffer, StringTokenizer
        // BigIntger, BigDeciaml
        // LocalDate, LocalTime, LocalDateTime, DateTimeFormatter, ...
    }
}
