package org.example.ch07;

/**
 * 캡슐화 (Encapsulation): 연관된 것을 모음 (하나의 클래스로 정의)
 * 정보은닉 (Information hiding)
 */
public class _10_AccessModifier {
    /**
     * 접근 제어자: 말 그대로 범위를 지정해서 접근을 나누는 것
     * private: 해당 클래스 내에서만 접근이 가능하다.
     * public: 모든 클래스에서 접근이 가능하다.
     * default: (아무것도 적지 않으면 적용) 같은 패키지 내에서만 접근 가능
     * protected: 같은 패키지 내에서는 접근이 가능하지만, 다른 패키지인 경우에는 자식 클래스에서 접근이 가능하다.
     */

    public static void main(String[] args) {
        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망이";
        // b1.resolution = "FHD";
        b1.setPrice(200000);
        b1.color = "Black";

        // 할인 행사
        b1.setPrice(-5000);
        System.out.println("가격: " + b1.getPrice() + "원");

        // 고객 문의
        System.out.println("해상도: " + b1.resolution);

        System.out.println("---------- 구분선 ----------");
        BlackBoxRefurbish b2 = new BlackBoxRefurbish();
        b2.setModelName("하양이");
        b2.setPrice(-5000);
        b2.setColor("White");

        System.out.println("가격: " + b2.getPrice() + "원");
        System.out.println("해상도: " + b2.getResolution());
    }
}
