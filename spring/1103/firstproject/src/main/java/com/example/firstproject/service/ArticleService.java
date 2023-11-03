package com.example.firstproject.service;

import com.example.firstproject.entity.Article;
import com.example.firstproject.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArticleService {
    private final ArticleRepository articleRepository;

    public List<Article> index() {
        return articleRepository.findAll();
    }

    public Article show(@PathVariable Long id) {
        return articleRepository.findById(id).orElse(null);
    }
}
