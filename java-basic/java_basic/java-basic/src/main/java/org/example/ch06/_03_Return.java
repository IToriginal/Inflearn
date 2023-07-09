package org.example.ch06;

public class _03_Return {
    // 호텔 전화번호
    public static String getPhoneNumber() {
        String phoneNumber = "02-1234-5678";
        return phoneNumber;
    }

    // 호텔 주소
    public static String getAddress() {
        return "서울특별시 ... ";
    }

    // 호텔 복지
    public static String getActivities() {
        return "볼링장, 탁구장, 노래방";
    }

    public static void main(String[] args) {
        // 반환값, Return
        String hotelNumber = getPhoneNumber();
        String hotelAddress = getAddress();

        System.out.println("호텔 번호: " + hotelNumber);
        System.out.println("호텔 주소: " + hotelAddress);
        System.out.println("호텔 복지: " + getActivities());

    }
}
