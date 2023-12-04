package com.shop.entity;

import com.shop.constant.ArticleType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
@AllArgsConstructor
@Entity
@Table(name = "article")
@Getter
@Setter
public class Article {
    @Id
    @Column(name = "article_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GenericGenerator(name = "increment", strategy = "increment")
    private Long id;

    private String title;

    private String content;

    @Enumerated(EnumType.STRING)
    private ArticleType articleType;


}
