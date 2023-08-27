package org.example;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] scores = null;
        int studentCnt = 0;

        while(true) {
            System.out.println("----------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("----------------------------------------------");
            System.out.print("선택> ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("학생수> ");
                    studentCnt = Integer.parseInt(scanner.nextLine());
                    scores = new int[studentCnt];
                    break;

                case 2:
                    for (int i = 0; i < studentCnt; i++) {
                        System.out.print("scores[" + i + "]> ");
                        scores[i] = Integer.parseInt(scanner.nextLine());
                    }
                    break;

                case 3:
                    for (int i = 0; i < studentCnt; i++) {
                        System.out.print("scores[" + i + "]> " + scores[i]);
                        System.out.println();
                    }
                    break;

                case 4:
                    int maxScore = Integer.MIN_VALUE;
                    int totalScore = 0;

                    for (int i = 0; i < studentCnt; i++) {
                        if (scores[i] > maxScore) {
                            maxScore = scores[i];
                        }
                        totalScore += scores[i];
                    }

                    double averageScore = (double) totalScore / studentCnt;

                    System.out.println("최고 점수> " + maxScore);
                    System.out.println("평균 점수> " + averageScore);
                    break;

                case 5:
                    System.out.println("프로그램 종료");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("잘못된 입력 방식입니다. 1~5번 중 선택하십시오.");
                    break;
            }
        }
    }
}
