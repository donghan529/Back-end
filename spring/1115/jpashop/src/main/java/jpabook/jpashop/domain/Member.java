package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
public class Member {
    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String name;

    @Embedded //값 타입을 사용하는 곳에 표시, 기본 생성자 필수(코드의 재사용, 높은 응집도)
    private Address address;

    @OneToMany(mappedBy = "member") //member가 하인 연관관계의 주인은 order
    private List<Order> orders = new ArrayList<>();
}
