package org.example.ch09;

public class _03_WrapperClass {
    public static void main(String[] args) {
        // Wrapper Class
        // int double float char

        Integer i = 123; // int i = 123
        Double d = 1.0; // double d = 1.0
        Character c = 'a'; // char c = 'a'

        System.out.println(i);
        System.out.println(d);
        System.out.println(c);

        System.out.println("---------- 구분선 ----------");

        System.out.println(i.doubleValue());
        System.out.println(d.intValue());
        System.out.println(c.charValue());

        System.out.println("---------- 구분선 ----------");

        String s = i.toString();
        System.out.println(s);
    }
}
