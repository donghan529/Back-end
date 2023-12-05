package com.team.cinema.service;

import com.team.cinema.dto.FaqDto;
import com.team.cinema.entity.Faq;
import com.team.cinema.repository.FaqRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class FaqService {
    private final FaqRepository faqRepository;

    public Faq saveFaq(FaqDto faqFormDto) {
        Faq faq = faqFormDto.toEntity();
        return faqRepository.save(faq);
    }

    @Transactional(readOnly = true)
    public List<Faq> getAllFaq() {
        return faqRepository.findAll();
    }
}
