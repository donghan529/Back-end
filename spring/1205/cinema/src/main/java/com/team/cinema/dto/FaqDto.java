package com.team.cinema.dto;

import com.team.cinema.constant.FaqType;
import com.team.cinema.entity.Faq;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter @Setter
public class FaqDto {
    private long id;
    private FaqType faqType;
    @NotNull(message = "질문은 필수 입력값 입니다.")
    private String faqQuestion;
    @NotNull(message = "답변은 필수 입력값 입니다.")
    private String faqAnswer;


    public Faq toEntity() {
        Faq faq = new Faq();
        faq.setId(this.id);
        faq.setFaqType(this.faqType);
        faq.setFaqQuestion(this.faqQuestion);
        faq.setFaqAnswer(this.faqAnswer);
        return faq;
    }
}
