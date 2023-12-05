package com.team.cinema.controller;

import com.team.cinema.dto.FaqDto;
import com.team.cinema.entity.Faq;
import com.team.cinema.repository.FaqRepository;
import com.team.cinema.service.FaqService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequiredArgsConstructor
@Slf4j
public class FaqController {

    //private final MemberRepository memberRepository;

    private final FaqRepository faqRepository;

    private final FaqService faqService;

    private static final int PAGE_SIZE = 10; //

    @GetMapping({"/faq/faq", "/faq/faq/{page}"})
    public String faq(@RequestParam(name = "page", defaultValue = "1") int page, Model model) {
        List<Faq> faqs = faqRepository.findAll();
        Page<Faq> faqPage = faqRepository.findAll(PageRequest.of(page - 1, PAGE_SIZE));
        int totalPages = faqPage.getTotalPages();
        List<Integer> pageNumbers = new ArrayList<>();
        for (int i = 1; i <= totalPages; i++) {
            pageNumbers.add(i);
        }
        model.addAttribute("currentPage", page);
        model.addAttribute("pageNumbers", pageNumbers);
        model.addAttribute("faqs", faqs);
        return "faq/faq";
    }
    @GetMapping(value = "/admin/faq/new")
    public String faqForm(Model model) {
        model.addAttribute("faq", new FaqDto());
        return "faq/faqForm";
    }
    @PostMapping(value = "/admin/faq/new")
    public String faqNew(@Valid FaqDto faqDto, Model model, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return "faq/faq";
        }
        if(faqDto.getFaqAnswer().isEmpty() || faqDto.getFaqQuestion().isEmpty()) {
            model.addAttribute("errorMessage", "질문과 답변을 모두 입력해주세요.");
            return "/faq/faq";
        }
        try {
            faqService.saveFaq(faqDto);
        } catch (Exception e) {
            model.addAttribute("errorMessage", "FAQ 등록 중 에러가 발생하였습니다.");
        }
        return "redirect:/faq/faq";
    }

}
