package org.example.ch04;

public class _07_do_while {
    public static void main(String[] args) {
        // 반복문 do while

        // 작은 레일에 키가 큰 사람이 수영을 한 상황으로 키와 레일의 크기가 같은 경우
        int distance = 2; // 한 레일의 거리
        int move = 0; // 현재의 이동 거리
        int height = 2; // 손을 뻗었을 때 거리 = 2m
        int cnt = 0; // 발차기 수

        System.out.println("수영을 시작합니다.");
        do {
            System.out.println((cnt+1)+"번째 발차기를 진행합니다.");
            cnt += 1;
            move += height;
        } while (move + height < distance);
        System.out.println("수영을 마쳤습니다. 발차기 횟수는 " + cnt + "번" );
    }
}
