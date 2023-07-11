package org.example.ch09;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class _06_HashSet {
    public static void main(String[] args) {
        // Set: 중복을 허용하지 않는다.
        // 순서도 보장하지 않는다.
        HashSet<String> set = new HashSet<>();

        // Data 추가
        set.add("삼겹살");
        set.add("쌈장");
        set.add("음료");
        set.add("소금");
        set.add("후추");
        set.add("삼겹살");
        set.add("깻잎");
        set.add("상추");
        set.add("삼겹살");

        System.out.println(set.size());
        System.out.println(set);

        System.out.println("----------- 구분선 ------------");

        // 확인
        System.out.println(set.contains("삼겹살"));

        System.out.println("----------- 구분선 ------------");

        // 삭제
        System.out.println(set.size());
        set.remove("삼겹살");
        System.out.println(set);

        System.out.println("----------- 구분선 ------------");

        // 전체 삭제
        set.clear();
        System.out.println(set);

        System.out.println("----------- 구분선 ------------");

        HashSet<Integer> intSet = new LinkedHashSet<>();
        intSet.add(1);
        intSet.add(13);
        intSet.add(2);

        System.out.println(intSet);
    }
}