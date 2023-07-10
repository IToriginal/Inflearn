package org.example.ch08;

import org.example.ch08.camera.Camera;
import org.example.ch08.camera.FactoryCam;
import org.example.ch08.camera.SpeedCam;

/**
 * 데이터 추상화 (Data Abstraction)
 * abstract
 * 추상 클래스 (아직 완성되지 않은 클래스)
 * 추상 메소드 (추상 클래스 또는 인터페이스에서 사용가능한 껍데기만 있는 메소드)
 */
public class _01_AbstractClass {
    public static void main(String[] args) {

        // Camera camera = new Camera(); // Error: 'Camera' is abstract; cannot be instantiated
        Camera factoryCam = new FactoryCam();
        factoryCam.showMainFeature();

        Camera speedCam = new SpeedCam();
        speedCam.showMainFeature();
    }
}
