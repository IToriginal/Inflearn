package hello.core.discount.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import hello.core.member.entity.Grade;
import hello.core.member.entity.Member;

@Component
public class FixDiscountPolicy implements DiscountPolicy {

    private int discountFixAmount = 1000; // 1000원 할인

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) return discountFixAmount;
        else return 0;
    }
}
