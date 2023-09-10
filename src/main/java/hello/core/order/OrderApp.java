package hello.core.order;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId, "오승민", Grade.VIP); // 회원 정보 등록
        memberService.join(member); // 회원 가입

        Order order = orderService.createOrder(memberId,"컵라면",10000);

        System.out.println("주문 =" + order);
    }
}
