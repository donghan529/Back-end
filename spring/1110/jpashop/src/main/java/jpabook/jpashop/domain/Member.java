package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@ToString
public class Member {
    @Id
    @GeneratedValue
    private Long id;
    private String username;
}
