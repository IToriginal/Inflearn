package org.example.thisjava.self;

import java.util.Scanner;

public class BankApplication {
    private static final Account[] accountArray = new Account[100];
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        while (true) {
            System.out.println("-------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("-------------------------------------------");
            System.out.print(">선택: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> { createAccount(); }
                case 2 -> { accountList(); }
                case 3 -> { deposit(); }
                case 4 -> { withdraw(); }
                case 5 -> { exitSystem(); }
                default -> System.out.println("잘못된 입력 방식입니다. 1~5번 중 선택하십시오.");
            }
        }
    }

    public static void createAccount() {
        System.out.println("----------");
        System.out.println("계좌생성");
        System.out.println("----------");
        System.out.print("계좌번호: ");
        String ano = scanner.nextLine();
        System.out.print("계좌주: ");
        String ownner = scanner.nextLine();
        System.out.print("초기입금액: ");
        int balance = scanner.nextInt();

        Account account = new Account(ano, ownner, balance);

        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] == null) {
                accountArray[i] = account;
                System.out.println("결과: 계좌가 생성되었습니다.");
                break;
            }
        }
    }

    public static void accountList() {
        System.out.println("----------");
        System.out.println("계좌목록");
        System.out.println("----------");

        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] != null) {
                System.out.println(accountArray[i].getAno() + "\t"
                    + accountArray[i].getOwnner() + "\t"
                    + accountArray[i].getBalance());
            } else {
                break;
            }
        }
    }

    public static void deposit() {
        System.out.println("----------");
        System.out.println("예금");
        System.out.println("----------");
        System.out.print("계좌번호: ");
        String ano = scanner.nextLine();
        System.out.print("예금액: ");
        int balance = scanner.nextInt();

        Account account = findAccount(ano);

        if (account == null) {
            System.out.println("결과: 계좌가 존재하지 않습니다.");
            return;
        }
        account.setBalance(account.getBalance() + balance);
        System.out.println("결과: 예금이 성공되었습니다.");
    }

    public static Account findAccount(String ano) {
        Account account = null;
        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] != null && accountArray[i].getAno().equals(ano)) {
                account = accountArray[i];
                break;
            }
        }
        return account;
    }

    public static void withdraw() {
        System.out.println("----------");
        System.out.println("출금");
        System.out.println("----------");
        System.out.print("계좌번호: ");
        String ano = scanner.nextLine();
        System.out.print("출금액: ");
        int balance = scanner.nextInt();

        Account account = findAccount(ano);

        if (account == null) {
            System.out.println("결과: 계좌가 존재하지 않습니다.");
            return;
        }
        if (account.getBalance() < balance) {
            System.out.println("예금액보다 많은 금액을 출금할 수 없습니다.");
            return;
        }
        account.setBalance(account.getBalance() - balance);
        System.out.println("결과: 출금이 성공되었습니다.");
    }

    public static void exitSystem() {
        System.out.println("프로그램 종료");
        scanner.close();
        System.exit(0);
    }
}