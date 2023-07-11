package org.example.ch09;

/**
 * 제네릭스:
 * 다양한 Type의 객체를 지원하는 클래스나 인터페이스 또는 메서드를 정의하는 방법.
 * 그래서 똑같은 동작을 하는 클래스나 메서드를 여러번 만들 필요 없이 한번만 정의하고 타입에 관계없이 사용할 수 있게 해준다.
 * 즉, 불필요한 코드의 중복을 줄일 수 있다.
 */
public class _01_Generics {
    public static void main(String[] args) {
        Integer[] iArray = {1, 2, 3, 4, 5};
        Double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        String[] sArray = {"A", "B", "C", "D", "E"};

        printIntArray(iArray);
        printDoubleArray(dArray);
        printStringArray(sArray);

        System.out.println("---------- 구분선 ----------");

        printAnyArray(iArray);
        printAnyArray(dArray);
        printAnyArray(sArray);
    }

    /**
     * T: Type (일반적인 상황이며 커스텀이 가능함)
     * K: Key
     * V: Value
     * E: Element
     */
    private static <T> void printAnyArray(T[] array) {
        for (T t : array) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    private static void printStringArray(String[] sArray) {
        for (String s : sArray) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    private static void printDoubleArray(Double[] dArray) {
        for (double d : dArray) {
            System.out.print(d + " ");
        }
        System.out.println();
    }

    private static void printIntArray(Integer[] iArray) {
        for (int i : iArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
