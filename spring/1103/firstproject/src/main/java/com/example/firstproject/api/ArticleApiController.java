package com.example.firstproject.api;

import com.example.firstproject.dto.ArticleForm;
import com.example.firstproject.entity.Article;
import com.example.firstproject.repository.ArticleRepository;
import com.example.firstproject.service.ArticleService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@Slf4j
@RequiredArgsConstructor
public class ArticleApiController {
    private final ArticleService articleService;
//    public ArticleApiController(ArticleRepository articleRepository) {
//        this.articleRepository = articleRepository;
//    }
    @Autowired
    private ArticleRepository articleRepository;

    //Get
    @GetMapping("/api/articles")
    public List<Article> index() {
        return articleService.index();
    }

    @GetMapping("/api/articles/{id}")
    public Article show(@PathVariable Long id) {
        return articleService.show(id);
    }

    //Post
    @PostMapping("/api/articles")
    public Article create(@RequestBody ArticleForm dto){
        Article article = dto.toEntity();
        return articleRepository.save(article);
    }

    //Patch(update)
    @RequestMapping("/api/articles/{id}")
    public ResponseEntity<Article> update(@PathVariable Long id, @RequestBody ArticleForm dto) {
        //1.DTO -> Entity
        Article article = dto.toEntity(); //수정한데이터
        log.info("id: {}", id, article.toString());
        //2. 타겟조회 - 수정전데이터
        Article target = articleRepository.findById(id).orElse(null);
        //3. 잘못된 요청처리
        if(target == null || id != article.getId()) {
            //400 잘못된 요청 응답
            log.info("잘못된 요청! id: {}, article: {}", id, article.toString());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
        //4. 업데이트 및 정상응답(200)
        target.patch(article);
        Article updated = articleRepository.save(target);
        return ResponseEntity.status(HttpStatus.OK).body(updated);
    }
    //Delete
    @DeleteMapping("/api/articles/{id}")
    public ResponseEntity<Article> delete(@PathVariable Long id) {
        //대상찾기
        Article target = articleRepository.findById(id).orElse(null);
        //잘못된 요청 처리
        if(target == null) {
            log.info("잘못된 요청! id: {}", id);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
        //대상 삭제후 HttpStatus.Ok 상태코드 받기
        articleRepository.delete(target);
        return ResponseEntity.status(HttpStatus.OK).build();
        //.build() 빈응답을 생성
    }

}
