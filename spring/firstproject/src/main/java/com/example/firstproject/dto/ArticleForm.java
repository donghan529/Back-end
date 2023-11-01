package com.example.firstproject.dto;

import com.example.firstproject.entity.Article;

public class ArticleForm {
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    private String title;
    private String content;

    @Override
    public String toString() {
        return "ArticleForm{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' + '}';
    }

    public Article toEntity() {
        return new Article(null, title, content);
    }


}
