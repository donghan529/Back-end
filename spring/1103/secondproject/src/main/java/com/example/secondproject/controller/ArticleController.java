package com.example.secondproject.controller;

import com.example.secondproject.dto.ArticleForm;
import com.example.secondproject.entity.Article;
import com.example.secondproject.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.lang.reflect.Member;
import java.util.List;

@Controller
@RequiredArgsConstructor
@Slf4j
public class ArticleController {

    private final ArticleRepository articleRepository;
    @GetMapping("/articles/new")
    public String newArticleForm() {
        return "articles/new";
    }

    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form) {
        log.info(form.toString());
        // 1. Dto를 Entity 변환
        Article article = form.toEntity();
        log.info(article.toString());
        // 2. Repository에게 Entity를 DB로 저장하게 함
        Article saved = articleRepository.save(article);
        log.info(saved.toString());
        return "redirect:/articles/" + saved.getId();
//        System.out.println(form.toString());
//        Article article = new Article();
//        article.setTitle(form.getTitle());
//        article.setContent(form.getContent());
//        System.out.println(article.toString());
//        Article save = articleRepository.save(article);
//        System.out.println(save.toString());
//        return "";
    }
    @GetMapping("/articles/{id}")
    public String show(@PathVariable long id, Model model) {
    log.info("id = " + id);
    //1: id로 데이터를 가져옴!
    Article articleEntity = articleRepository.findById(id).orElse(null);
    //2: 가져온 데이터를 모델에 등록!
    model.addAttribute("article", articleEntity);
    //3: 보여줄 페이지를 설정!
    return "articles/show";
    }
    @GetMapping("/articles")
    public String index(Model model) {
        //1. 모든 Article을 가져온다!
        List<Article> articleList = articleRepository.findAll();
        //2. 가져온 Article 묶음을 뷰로 전달!
        model.addAttribute("article", articleList);
        return "articles/index";
    }
    @GetMapping("/articles/{id}/edit")
    public String edit(@PathVariable Long id, Model model) {
        //수정할 데이터 가져오기
        Article articleEntity = articleRepository.findById(id).orElse(null);
        //모델에 데이터 등록
        model.addAttribute("article", articleEntity);
        //뷰 페이지 설정
        return "articles/edit";
    }
    @PostMapping("/articles/update")
    public String update(ArticleForm form) {
        // 1: DTO를 엔티티로 변환
        Article articleEntity = form.toEntity();
        // 2: 엔티티를 DB로 저장
        // 2-1: DB에서 기존 데이터를 가져옴
        Article target = articleRepository.findById(articleEntity.getId()).orElse(null);
        // 2-2: 기존 데이터가 있다면, 값을 갱신
        if(target != null) {
            articleRepository.save(articleEntity);
        }
        // 3: 수정 결과 페이지로 리다이렉트
        return "redirect:/articles/"+articleEntity.getId();
    }
    @GetMapping("/articles/{id}/delete")
    public String delete(@PathVariable Long id, RedirectAttributes rttr) {
        //리다이렉트 후 다른 컨트롤러나 뷰로 데이터를 전달할때 쓰임
        //1. 삭제 대상을 가져옴
        Article target = articleRepository.findById(id).orElse(null);
        //2. 대상을 삭제
        if(target != null) {
            articleRepository.delete(target);
            rttr.addFlashAttribute("msg", "삭제가 완료되었습니다.");
        }
        return "redirect:/articles";
    }
}
