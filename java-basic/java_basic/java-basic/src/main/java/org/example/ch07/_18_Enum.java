package org.example.ch07;

public class _18_Enum {
    public static void main(String[] args) {
        /**
         * 열거형 (enum): 상수들의 묶음
         * EX)
         * 달력: JAN, FEB, MAR, ...
         * 옷 사이즈: S, M, L, XL ...
         * OS 종류: WINDOW, MAC, LINUX, ...
         * ...
         */

        Resolution resolution = Resolution.HD;
        System.out.println(resolution);

        resolution = Resolution.FHD;
        System.out.println(resolution);

        System.out.print("동영상 녹화 품질: ");
        switch (resolution) {
            case HD -> {
                System.out.println("일반화질");
            }
            case FHD -> {
                System.out.println("고화질");
            }
            case UHD -> {
                System.out.println("초고화질");
            }
        }

        resolution = Resolution.valueOf("UHD");
        System.out.println(resolution);

        System.out.println("---------- 구분선 ----------");

        for (Resolution myRes: Resolution.values()) {
            System.out.println(myRes.name() + " : " + myRes.ordinal());
        }

        System.out.println("---------- 구분선 ----------");
        for (Resolution myRes: Resolution.values()) {
            System.out.println(myRes.name() + " : " + myRes.getWidth());
        }

    }
}

enum Resolution {
    HD(1280), FHD(1920), UHD(3840);

    private final int width;

    Resolution(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }
}
