package org.example.ch10;

import org.example.ch10.converter.ConvertibalWithNoParams;
import org.example.ch10.converter.Convertible;
import org.example.ch10.converter.ConvertibleWithReturn;
import org.example.ch10.converter.ConvertibleWithTwoParams;
import org.example.ch10.converter.KRWConverter;

public class _04_FunctionalInterface {
    public static void main(String[] args) {
        KRWConverter converter = new KRWConverter();
        // converter.convert(2);

        // convertUSD((USD) -> System.out.println(USD + " 달러 = " + (USD * 1400) + " 원"), 1);
        Convertible convertible = (USD) -> System.out.println(USD + " 달러 = " + (USD * 1400) + " 원");
        convertUSD(convertible, 2);

        // 전달 값이 하나도 없다면?
        ConvertibalWithNoParams c1 = () -> System.out.println("1 달러 = 1400 원");
        c1.convert();

        // 두 줄 이상의 코드가 있다면?
        c1 = () -> {
            int USD = 5;
            int KRW = 1400;
            System.out.println(USD + " 달러 = " + (USD * KRW) + " 원");
        };
        c1.convert();

        // 전달 값이 2개인 경우?
        ConvertibleWithTwoParams c2 = (d, w) -> System.out.println(d + " 달러 = " + (d * w) + " 원");
        c2.convert(10, 1400);

        // 반환값이 있는 경우?
        ConvertibleWithReturn c3 = (d, w) ->  d * w;
        int result = c3.convert(20, 1400);
        System.out.println("20 달러 = " + result + " 원" );
    }

    public static void convertUSD(Convertible converter, int USD) {
        converter.convert(USD);
    }
}
