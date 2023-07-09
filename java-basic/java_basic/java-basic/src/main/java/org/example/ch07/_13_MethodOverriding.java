package org.example.ch07;

import org.example.ch07.camera.Camera;
import org.example.ch07.camera.FactoryCam;
import org.example.ch07.camera.SpeedCam;

public class _13_MethodOverriding {
    public static void main(String[] args) {
        /**
         * 메소드 오버라이딩
         * 자식 클래스에서 부모 클래스의 메소드를 덮어씌워지는 동작을 하게 되는 것을 말한다.
         * 즉, 부모클래스의 메소드를 자식 클래스에서 재정의한다.
         */
        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();
    }
}
