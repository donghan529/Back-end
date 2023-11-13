package jpabook.jpashop.service;

import jpabook.jpashop.domain.Member;
import jpabook.jpashop.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(SpringExtension.class)
@SpringBootTest
@Transactional
class MemberServiceTest {
    @Autowired
    MemberService memberService;
    @Autowired
    MemberRepository memberRepository;

    @Test
    void 회원가입() throws Exception {
        //Given
        Member member = new Member();
        member.setName("kim");
        //When
        Long saveId = memberService.join(member);
        //Then
        assertEquals(member, memberRepository.findOne(saveId));
        System.out.println("기대 하는 값: " + member);
        System.out.println("셀제 나온 값: " + memberRepository.findOne(saveId));
    }

    //Junit5 -> https://jinioh88.tistory.com/57

    @Test
    public void 중복_회원_예외() throws Exception {
        //Given
        Member member1 = new Member();
        member1.setName("kim");

        Member member2 = new Member();
        member2.setName("kim");
        //When
        memberService.join(member2);
        //Then
        //assertThrows(IllegalStateException.class, () -> memberService.join(member2));
        IllegalStateException thrown = assertThrows(IllegalStateException.class, () -> memberService.join(member2));
        //예외를 메시지 검증
        assertEquals("이미 존해하는 회원입니다.", thrown.getMessage());
        System.out.println(thrown.getMessage());
    }

}