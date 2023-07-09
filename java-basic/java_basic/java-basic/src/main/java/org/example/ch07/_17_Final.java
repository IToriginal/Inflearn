package org.example.ch07;

import org.example.ch07.camera.ActionCam;
import org.example.ch07.camera.SlowActionCam;

public class _17_Final {
    public static void main(String[] args) {
        /**
         * Final
         * public (final) class ...
         * public (final) void ...
         * public > abstract > static > final > ...
         */

        ActionCam actionCam = new ActionCam();
        // actionCam.lens = "표준렌즈"; // error: cannot assign a value to final variable lens
        actionCam.recordVideo();
        actionCam.makeVideo();

        System.out.println("---------- 구분선 ----------");

        SlowActionCam slowActionCam = new SlowActionCam();
        slowActionCam.makeVideo();

    }
}
