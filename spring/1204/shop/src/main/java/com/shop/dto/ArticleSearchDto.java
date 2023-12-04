package com.shop.dto;

import com.shop.constant.ArticleType;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ArticleSearchDto {

    private String searchDateType;

    private ArticleType searchArticleType;

    private String searchBy;

    private String searchQuery="";
}
