package org.example.ch09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class _04_ArrayList {
    public static void main(String[] args) {
        // 컬랙션 프레임워크: 많은 데이터를 효과적으로 관리하기 위한 클래스들의 모음
        // List, Set, Map
        ArrayList<String> list = new ArrayList<>();

        // 데이터 추가
        list.add("마이콜");
        list.add("티구안");
        list.add("피치");
        list.add("람보");
        list.add("카티치");

        // 데이터 조회(index)
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));

        System.out.println("---------- 구분선 ----------");

        // 삭제 (람보 이사)
        System.out.println("신청 학생 수 (이사 전): " + list.size()); // 5
        list.remove("람보");
        System.out.println("신청 학생 수 (이사 후): " + list.size()); // 4
        System.out.println(list.get(3));

        System.out.println("---------- 구분선 ----------");

        System.out.println("남은 학생 수 (제외 전): " + list.size()); // 4
        list.remove(list.size() - 1); // 마지막 데이터를 삭제
        System.out.println("남은 학생 수 (제외 후): " + list.size()); // 3

        System.out.println("---------- 구분선 ----------");

        // 순회
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("---------- 구분선 ----------");

        // 데이터 변경
        System.out.println("인덱스 0 변경 전: " + list.get(0));
        list.set(0, "디미트리");
        System.out.println("인덱스 0 변경 후: " + list.get(0));

        System.out.println("---------- 구분선 ----------");

        // 데이터 조회
        System.out.println(list.indexOf("티구안")); // 1

        System.out.println("---------- 구분선 ----------");

        // 리스트에 포함되어 있는지?
        if (list.contains("티구안")) {
            System.out.println("선착순 성공");
        } else {
            System.out.println("선착순 실패");
        }

        System.out.println("---------- 구분선 ----------");

        // 전체 삭제
        list.clear();
        if (list.isEmpty()) {
            System.out.println("데이터를 비웠습니다.");
            System.out.println("list 내의 데이터는 "+ list.size());
        }

        System.out.println("---------- 구분선 ----------");

        // 데이터 다시 추가
        list.add("마이콜");
        list.add("티구안");
        list.add("피치");
        list.add("람보");
        list.add("카티치");

        System.out.println(list);

        // 정렬
        Collections.sort(list);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
