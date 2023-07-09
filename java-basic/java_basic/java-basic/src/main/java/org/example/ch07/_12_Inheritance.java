package org.example.ch07;

import org.example.ch07.camera.Camera;
import org.example.ch07.camera.FactoryCam;
import org.example.ch07.camera.SpeedCam;

public class _12_Inheritance {
    public static void main(String[] args) {
        // 상속: 부모 클래스에서 제공되는 모든 것들을 자식 클래스에서 가져다 사용한다.
        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        System.out.println(camera.name);
        System.out.println(factoryCam.name);
        System.out.println(speedCam.name);

        camera.takePicture();
        factoryCam.recordVideo();
        speedCam.takePicture();

        factoryCam.detectFire();
        speedCam.checkSpeed();
        speedCam.recognizeLicensePlate();
    }
}
