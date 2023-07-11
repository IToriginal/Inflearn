package org.example.ch09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class _08_Iterator {
    public static void main(String[] args) {
        // 이터레이터
        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("error");
        list.add("b");
        list.add("error");
        list.add("c");
        list.add("error");
        list.add("d");
        list.add("error");
        list.add("e");
        list.add("error");

        System.out.println(list);
        System.out.println("-------------------- 구분선 ---------------------");

        Iterator<String> it = list.iterator();
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());

        System.out.println("-------------------- 구분선 ---------------------");
        it = list.iterator(); // 커서를 처음 위치로 이동
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("-------------------- 구분선 ---------------------");
        it = list.iterator(); // 커서를 처음 위치로 이동
        while (it.hasNext()) {
            String s = it.next();
            if (s.contains("error")) { // error를 만나면
                it.remove(); // 삭제
            }
        }
        System.out.println(list);

        System.out.println("-------------------- 구분선 ---------------------");
        HashSet<String> set = new HashSet<>();
        set.add("a");
        set.add("b");

        Iterator<String> itSet = set.iterator();
        while (itSet.hasNext()) {
            System.out.println(itSet.next());
        }
        System.out.println("-------------------- 구분선 ---------------------");
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 10);
        map.put("b", 5);

        // map.iterator(); // 제공되지 않음
        Iterator<String> itMapKey = map.keySet().iterator();
        while (itMapKey.hasNext()) {
            System.out.println(itMapKey.next());
        }
        System.out.println("-------------------- 구분선 ---------------------");
        Iterator<Integer> itMapValue = map.values().iterator();
        while (itMapValue.hasNext()) {
            System.out.println(itMapValue.next());
        }

        System.out.println("-------------------- 구분선 ---------------------");
        Iterator<Map.Entry<String, Integer>> itMap = map.entrySet().iterator();
        while (itMap.hasNext()) {
            System.out.println(itMap.next());
        }

    }
}
