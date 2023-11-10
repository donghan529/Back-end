package com.example.firstproject.service;

import com.example.firstproject.dto.CommentDto;
import com.example.firstproject.entity.Article;
import com.example.firstproject.entity.Comment;
import com.example.firstproject.repository.ArticleRepository;
import com.example.firstproject.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class CommentService {

    private final CommentRepository commentRepository;

    private final ArticleRepository articleRepository;
    @Transactional(readOnly = true)
    public List<CommentDto> comments(Long articleId) {
        //조회 목록 조회
        List<Comment> comments = commentRepository.findByArticleId(articleId);
        //변환: 엔티티 -> DTO
        List<CommentDto> dtos = new ArrayList<CommentDto>();
        for (int i=0;i<comments.size();i++){
            Comment comment = comments.get(i);
            CommentDto dto = CommentDto.createCommentDto(comment);
//            CommentDto dto = new CommentDto(comment.getId(), comment.getArticle().getId(), comment.getNickname(), comment.getBody());
            dtos.add(dto);
        }

        //결과 확인
//        for (CommentDto dto: dtos)
//            System.out.println(dto.toString());

        //stream 방식
//        List<CommentDto> dtos = comments.stream()
//                .map(CommentDto::createCommentDto)
//                .collect(Collectors.toList());
        //:: 클래스이름::정적메서드이름
//        return commentRepository.findByArticleId(articleId)
//                .stream()
//                .map(comment -> CommentDto.createCommentDto(comment))
//                .collect(Collectors.toList());
        //반환
        return dtos;
    }

    @Transactional //DB에 접급하므로 트랜잭션 어노테이션으로 문제가 발생하면 롤백되도록 해야함
    public CommentDto create(Long articleId, CommentDto dto) {
        //log.info("입력값 => {}", articleId);
        //log.info("입력값 => {}", dto);
       //게시글 조회 및 예외 발생
       Article article = articleRepository.findById(articleId)
               .orElseThrow(()-> new IllegalArgumentException("댓글생성실패!"));
       //댓글 엔티티 생성
       Comment comment = Comment.createComment(dto, article);

       //댓글 엔티티를 DB에 저장
       Comment created = commentRepository.save(comment);
       //Dto로 변경하여 반환
       CommentDto createdDto = CommentDto.createCommentDto(created);
       //log.info("반환값 => {}", createdDto);
       return createdDto;

    }
    @Transactional
    public CommentDto update(Long id, CommentDto dto) {
        Comment target = commentRepository.findById(id)
                .orElseThrow(()-> new IllegalArgumentException("댓글수정실패!"));
        //댓글수정
        target.patch(dto);

        //DB로 갱신
        Comment updated = commentRepository.save(target);

        //댓글 엔티티를 DTO로 변환 및 반환
        return CommentDto.createCommentDto(updated);

    }
    @Transactional
    public CommentDto delete(Long id) {
        //댓글조회 및 예외발생
        Comment target = commentRepository.findById(id)
                .orElseThrow(()-> new IllegalArgumentException("댓글삭제실패!"));
        //댓글삭제
        commentRepository.delete(target);

        //삭제된 댓글을 Dto로 변환
        return CommentDto.createCommentDto(target);
    }
}
