package org.example;

public class dualStack {
    private static final int MEMORY = 10;
    private static int[] stack = new int[MEMORY];
    private static int top1 = 0;
    private static int top2 = MEMORY - 1;

    public static void main(String[] args) {
        int result;

        add(1, 10);
        result = deleted(1);
        System.out.println("스택 1에서 빼낸 값: " + result);

        add(2, 20);
        result = deleted(2);
        System.out.println("스택 2에서 빼낸 값: " + result);
    }

    public static void add(int i, int item) {
        if (top1 == top2) {
            System.out.println("stack full");
            System.exit(1);
        }

        if (i == 1) {
            stack[top1++] = item;
        } else {
            stack[top2--] = item;
        }
    }

    public static int deleted(int i) {
        if (i == 1) {
            if (top1 <= 0) {
                System.out.println("stack empty");
                System.exit(1);
            }
            return stack[--top1];
        } else {
            if (top2 >= MEMORY - 1) {
                System.out.println("stack empty");
                System.exit(1);
            }
            return stack[++top2];
        }
    }
}

