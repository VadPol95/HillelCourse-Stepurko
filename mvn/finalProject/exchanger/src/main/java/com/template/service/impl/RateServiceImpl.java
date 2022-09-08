package com.template.service.impl;

import com.template.entity.Rate;
import com.template.repository.RateRepository;
import com.template.service.RateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.LinkedList;

@Service
@RequiredArgsConstructor
public class RateServiceImpl implements RateService {
    public final RateRepository rateRepository;

    public Rate getCurrentRate() {
        LinkedList<Rate> rates = new LinkedList<>(rateRepository.findAll());
        return rates.getLast();
    };
}
