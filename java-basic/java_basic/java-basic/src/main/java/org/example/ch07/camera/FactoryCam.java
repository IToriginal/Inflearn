package org.example.ch07.camera;

// FactoryCam is a Camera (Is - A 관계)
public class FactoryCam extends Camera{ // 자식 클래스

    public FactoryCam() {
        // this.name = "공장 카메라";
        super("공장 카메라");
    }

    /**
     * 동영상 녹화후 화재 감지를 함께
     */
    public void recordVideo() {
        super.recordVideo();
        detectFire();
    }

    /**
     * 화재 감지 기능
     */
    public void detectFire() {
        System.out.println("화재를 감지합니다.");
    }

    /**
     * Overrides method in Camera (org.example.ch07.camera)
     */
    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능: 화재 감지");
    }
}
