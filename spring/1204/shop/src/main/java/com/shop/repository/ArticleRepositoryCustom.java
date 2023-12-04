package com.shop.repository;

import com.shop.dto.ArticleSearchDto;
import com.shop.entity.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ArticleRepositoryCustom {

    Page<Article> getArticlePage(ArticleSearchDto articleSearchDto, Pageable pageable);
}
