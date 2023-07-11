package org.example.ch09;

import java.util.HashMap;

public class _07_HashMap {
    public static void main(String[] args) {
        // Map: (key, Value)

        HashMap<String, Integer> map = new HashMap<>();

        // Data 추가
        map.put("유재석", 10);
        map.put("박명수", 5);
        map.put("서장훈", 15);
        map.put("김종국", 3);

        System.out.println("총 고객의 수: " + map.size());
        System.out.println("------------ 구분선 -----------");

        // 조회
        System.out.println(map.get("유재석"));
        System.out.println(map.get("박명수"));

        // 확인
        if (map.containsKey("서장훈")) {
            int point = map.get("서장훈");
            map.put("서장훈", ++point);
            System.out.println(map.get("서장훈"));
        } else {
            map.put("서장훈", 1);
            System.out.println("신규 등록이 완료되었습니다. (포인트 1)");
        }
        System.out.println("------------ 구분선 -----------");

        // 삭제
        map.remove("유재석");
        System.out.println(map);

        System.out.println("------------ 구분선 -----------");

        // 전체 삭제
        map.clear();
        System.out.println(map);

        // Data 추가
        map.put("유재석", 10);
        map.put("박명수", 5);
        map.put("서장훈", 15);
        map.put("김종국", 3);

        System.out.println("------------ 구분선 -----------");

        // Key 순회
        for (String key : map.keySet()) {
            System.out.println(key);
        }

        System.out.println("------------ 구분선 -----------");

        // Value 확인
        for (int value : map.values()) {
            System.out.println(value);
        }

        System.out.println("------------ 구분선 -----------");

        // Key Value 확인
        for (String key : map.keySet()) {
            System.out.println(key + "...." + map.get(key));
        }
    }
}
