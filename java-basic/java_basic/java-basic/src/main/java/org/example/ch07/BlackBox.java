package org.example.ch07;

public class BlackBox {
    // 인스턴스 변수(필드) 생성
    String modelName; // 모델명

    String resolution; // 해상도

    int price; // 가격

    String color; // 색상

    int serialNumber; // 시리얼 번호

    static int counter = 0; // 시리얼 번호를 생성해주는 역할 (++: 처음에는 0으로 시작해 증가시킬 예정)

    // Class 변수
    static boolean canAutoReport = false;

    BlackBox() {
        System.out.println("기본 생성자 호출");
        this.serialNumber = ++counter;
        System.out.println("새로운 시리얼 넘버를 발급받았습니다..." + this.serialNumber);
    }

    BlackBox(String modelName, String resolution, int price, String color) {
        this(); // 기본 생성자 호출

        System.out.println("사용자 정의 생성자 호출");
        this.modelName = modelName;
        this.resolution = resolution;
        this.price = price;
        this.color = color;
    }

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

    static void callServiceCenter() {
        System.out.println("서비스 센터(1588-0000)로 연결합니다.");
    }

    void appendModelName(String modelName) {
        // this.을 붙혀 사용하게되면 클래스의 인스턴스변수에 직접 접근이 가능해진다.
        // 파라미터변수와 이름이 같을 경우에는 this를 꼭 붙혀서 사용해야한다.
        this.modelName += modelName;
    }
}
