package com.shop.entity;

import com.shop.constant.ArticleType;
import com.shop.dto.ArticleDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "article")
@Getter
@Setter
public class Article extends BaseEntity {

    @Id
    @Column(name = "article_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GenericGenerator(name = "increment", strategy = "increment")
    private Long id;

    private String title;

    private String content;

    @Enumerated(EnumType.STRING)
    private ArticleType articleType;


    public static Article createArticle(ArticleDto articleDto) {
        Article article = new Article();
        article.setTitle(articleDto.getTitle());
        article.setContent(articleDto.getContent());
        article.setArticleType(articleDto.getArticleType());
        return article;
    }

    public void patch(Article article) {
        if(article.title != null)
        this.title = article.title;
        if(article.content != null)
        this.content = article.content;
        if(article.articleType != null)
        this.articleType = article.articleType;
    }
}
