package com.example.firstproject.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
//Java Persistence API(JPA)와 관련된 어노테이션입니다.
//주로 관계형 데이터베이스(RDBMS)와 연동되는 경우에 사용됩니다. 예를 들어, Hibernate, EclipseLink, 등의 JPA 구현체와 함께 사용됩니다.
//JPA의 표준 스펙에 정의된 어노테이션으로, 엔티티 클래스의 기본 키를 정의하고 JPA를 사용하여 데이터베이스 액세스 작업을 처리합니다.

//import org.springframework.data.annotation.Id;
//스프링 데이터 프로젝트(Spring Data)와 관련된 어노테이션입니다.
//주로 NoSQL 데이터베이스와 연동되는 경우에 사용됩니다. 예를 들어, MongoDB와 같은 NoSQL 데이터베이스에서 사용될 수 있습니다.
@Getter
@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;

    @Column
    private String nickname;

    @Column
    private String body;
}
