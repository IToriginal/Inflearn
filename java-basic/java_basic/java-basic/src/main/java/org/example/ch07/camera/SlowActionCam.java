package org.example.ch07.camera;

public class SlowActionCam {
    public String name;
    public SlowActionCam() {
        this.name = "슬로우 액션 카메라";
    }

    public void makeVideo() {
        System.out.println(this.name + "로 촬영한 영상을 통해 슬로우비디오를 제작합니다.");
    }
}
