package org.example.ch09;

import java.util.Collections;
import java.util.LinkedList;

public class _05_LinkedList {
    public static void main(String[] args) {
        // 링크드 리스트 (Linked List)
        LinkedList<String> list = new LinkedList<>();

        // Data 추가
        list.add("마이콜");
        list.add("티구안");
        list.add("피치");
        list.add("람보");
        list.add("카티치");

        // Data 조회
        System.out.println(list.get(0)); // 마이콜
        System.out.println(list.get(1)); // 티구안
        System.out.println(list.getFirst()); // 마이콜
        System.out.println(list.getLast()); // 카티치

        System.out.println("---------- 구분선 ----------");

        // 추가
        list.addFirst("마르티스");
        System.out.println(list);

        System.out.println("---------- 구분선 ----------");

        list.addLast("야콥");
        System.out.println(list);

        System.out.println("---------- 구분선 ----------");

        list.add(1, "진저");
        System.out.println(list);

        System.out.println("---------- 구분선 ----------");

        // 삭제
        list.remove(list.size() - 1);
        System.out.println(list);

        System.out.println("---------- 구분선 ----------");

        // 0번과 마지막 인덱스 삭제
        list.removeFirst();
        list.removeLast();
        System.out.println(list);

        System.out.println("---------- 구분선 ----------");

        // 변경
        list.set(0, "클롭");
        System.out.println(list);

        System.out.println("---------- 구분선 ----------");

        // 조회
        System.out.println(list.indexOf("피치"));
        System.out.println(list.contains("피치"));

        // 전체 삭제
        list.clear();
        System.out.println(list);

        System.out.println("---------- 구분선 ----------");

        // Data 추가
        list.add("마이콜");
        list.add("티구안");
        list.add("피치");
        list.add("람보");
        list.add("카티치");

        // 정렬
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
