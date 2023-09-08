package hello.core.order.service;

import org.junit.jupiter.api.BeforeEach;

import hello.core.AppConfig;
import hello.core.member.service.MemberService;

public class OrderServiceTest {

    MemberService memberService;
    OrderService orderService;

    @BeforeEach
    public void beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
        orderService = appConfig.orderService();
    }

    // @Test
    // void createOrder() {
    //     // given
    //     Long memberId = 1L;
    //     Member member = new Member(memberId, "memberA", Grade.VIP);
    //     Order order = orderService.createOrder(memberId, "itemA", 10000);
    //
    //     // when
    //     memberService.join(member);
    //
    //     // then
    //     assertThat(order.getDiscountPrice()).isEqualTo(1000);
    // }
}