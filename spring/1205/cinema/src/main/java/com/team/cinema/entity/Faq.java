package com.team.cinema.entity;

import com.team.cinema.constant.FaqType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "faq")
@Getter @Setter
public class Faq {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "faq_id")
    private long id;

    @Enumerated(EnumType.STRING)
    private FaqType faqType;

    @Column(length = 1000)
    private String faqQuestion;

    @Column(length = 5000)
    private String faqAnswer;

    public Faq toDto() {
        Faq faq = new Faq();
        faq.setId(this.id);
        faq.setFaqType(this.faqType);
        faq.setFaqQuestion(this.faqQuestion);
        faq.setFaqAnswer(this.faqAnswer);
        return faq;
    }



}
