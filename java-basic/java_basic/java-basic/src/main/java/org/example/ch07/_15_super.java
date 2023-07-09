package org.example.ch07;

import org.example.ch07.camera.FactoryCam;
import org.example.ch07.camera.SpeedCam;

public class _15_super {
    // Super: 부모 클래스의 어떠한 것을 자식 클래스에서 사용
    public static void main(String[] args) {
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        factoryCam.recordVideo();
        System.out.println("---------- 구분선 ----------");
        speedCam.takePicture();
    }
}
