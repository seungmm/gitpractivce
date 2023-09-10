package hello.core.order;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


public class OrderServiceTest {
    MemberService memberService = new MemberServiceImpl();
    OrderService orderService =  new OrderServiceImpl();
    @Test
    void creatOrder(){
        long memberId = 1L;
        Member member = new Member(memberId, "오승민", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId,"컵라면",10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}
