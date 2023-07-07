package org.example.ch04;

public class _06_while {
    public static void main(String[] args) {
        // 반복문 while: 명확한 반복수가 없을 때 주로 사용

        // 수영장에서 수영을 하는 상황에서 레일의 끝까지 가려 합니다. 발차기를 1번할 때 3m 씩 이동이 가능하다.
        // 끝까지 가기 위해서 발차기를 몇번 해야하는가?
        int distance = 25; // 전체 거리 = 25 m
        int move = 0; // 현재 이동 거리 = 0 m
        int kick = 3;
        int kickCnt = 0;

        // 현재 이동 거리가 전체 거리보다 작다는 조건이 참인 동안 반복을 수행
        System.out.println("수영을 시작합니다.");
        while (move < distance) {
            move += kick;
            System.out.println("발차기를 진행합니다. 현재 이동 거리는 " + move);
            kickCnt += 1;
        }
        System.out.println("수영을 마쳤습니다. 발차기의 총 횟수는 " + kickCnt +"번 입니다.");
    }
}
