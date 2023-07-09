package org.example.ch07.camera;

// SpeedCam is a Camera (Is - A 관계)
public class SpeedCam extends Camera{ // 자식 클래스

    public SpeedCam() {
        // this.name = "과속 단속 카메라";
        super("과속 단속 카메라");
    }

    /**
     * 사진 촬영 후 번호판과 속도를 체크
     */
    public void takePicture() {
        super.takePicture();
        checkSpeed();
        recognizeLicensePlate();
    }

    /**
     * 속도 체크 메서드
     */
    public void checkSpeed() {
        System.out.println("속도를 측정합니다.");
    }

    /**
     * 차량 번호 인식
     */
    // @Override // Error: Method does not override method from its superclass
    public void recognizeLicensePlate() {
        System.out.println("차량 번호를 인식합니다.");
    }

    /**
     * Overrides method in Camera (org.example.ch07.camera)
     */
    @Override // annotation, 없어도 동작에는 문제가 없음.
    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능: 속도 측정, 차량 번호 인식");
    }
}
