package hello.core.member;

public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    // MemberRepository는 인터페이스, MemoryMemberRepsitory는 구현체
    // MemberServiceImpl은 인터페이스와 구현체 둘 다에 의존하고 있는 형태
    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findBy(memberId);
    }
}
