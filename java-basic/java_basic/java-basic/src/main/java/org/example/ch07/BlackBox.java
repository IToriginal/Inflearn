package org.example.ch07;

public class BlackBox {
    // 인스턴스 변수(필드) 생성
    String modelName; // 모델명

    String resolution; // 해상도

    int price; // 가격

    String color; // 색상

    // Class 변수
    static boolean canAutoReport = false;

    // 자동 신고 method
    void autoReport() {
        if (canAutoReport) {
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        } else {
            System.out.println("자동 신고 기능이 지원되지 않습니다.");
        }
    }

    void insertMemoryCard(int capacity) {
        System.out.println("메모리 카드가 삽입되었습니다.");
        System.out.println("용량은 " + capacity + "GB 입니다.");
    }

    int getVideoFileCnt(int type) {
        if (type == 1) { // 일반 영상
            return 9; // 9개가 있다고 가정
        } else if (type == 2) { // 이벤트 영상
            return 1; // 1개가 있다고 가정
        }
        return 10;
    }

    /**
     * @param showDateTime : 날짜 정보 표시 여부
     * @param showSpeed: 속도 정보 표시 여부
     * @param min: 영상 기록 단위(분)
     */
    void record(boolean showDateTime, boolean showSpeed, int min) {
        System.out.println("녹화를 시작합니다.");
        if (showDateTime) {
            System.out.println("영상에 날짜 정보가 표시됩니다.");
        }
        if (showSpeed) {
            System.out.println("영상에 속도 정보가 표시됩니다.");
        }
        System.out.println("영상은 " + min + "분 단위로 기록됩니다.");
    }

    // 디폴트 값 설정
    void record() {
        record(true, true, 5);
    }
}
