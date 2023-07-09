package org.example.ch07;

import org.example.ch07.camera.Camera;
import org.example.ch07.camera.FactoryCam;
import org.example.ch07.camera.SpeedCam;

public class _14_Polymorphism {
    public static void main(String[] args) {
        /**
         * 다형성(Polymorphism)
         *
         * class Person: 사람
         * class Student extends Person: 학생 (학생은 사람이다. Student is a person - 역은 성립하지 않는다.)
         * class Teacher extends Person: 선생님 (선생님은 사람이다. Teacher is a person - 역은 성립하지 않는다.)
         */

        Camera camera = new Camera();
        Camera factoryCam = new FactoryCam();
        Camera speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();

        System.out.println("---------- 구분선 ----------");

        Camera[] cameras = new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new SpeedCam();

        for (Camera cam : cameras) {
            cam.showMainFeature();
        }

        System.out.println("---------- 구분선 ----------");
        // factoryCam.detectFire();
        // speedCam.checkSpeed();
        // speedCam.recognizeLicensePlate();

        if (camera instanceof Camera) {
            System.out.println("카메라 입니다.");
        }

        if (factoryCam instanceof FactoryCam) {
            ((FactoryCam)factoryCam).detectFire();
        }

        if (speedCam instanceof SpeedCam) {
            ((SpeedCam)speedCam).checkSpeed();
            ((SpeedCam)speedCam).recognizeLicensePlate();
        }

        // Object[] objs = new Object[3];
        // objs[0] = new Camera();
        // objs[1] = new FactoryCam();
        // objs[2] = new SpeedCam();
    }
}
