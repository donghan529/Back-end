package com.shop.controller;

import com.shop.dto.ArticleSearchDto;
import com.shop.entity.Article;
import com.shop.repository.ArticleRepository;
import com.shop.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class ArticleController {

    private final ArticleService articleService;
    private final ArticleRepository articleRepository;

    @GetMapping(value = {"/csCenter/notices", "csCenter/notices/{page}"})
    public String notice(ArticleSearchDto articleSearchDto, @PathVariable("page")Optional<Integer> page, Model model) {
        model.addAttribute("headerImg", "images/header.jpg");
        Pageable pageable = PageRequest.of(page.isPresent() ? page.get() : 0, 10);
        Page<Article> articles = articleService.getArticlePage(articleSearchDto, pageable);
        model.addAttribute("headerImg", "/images/header.jpg");
        model.addAttribute("articleList", articles);
        model.addAttribute("articleSearchDto", articleSearchDto);
        model.addAttribute("maxPage", 5);
        return "article/notice";
    }
}
