package com.template.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.template.dto.WalletDto;
import com.template.entity.CurrencyEnum;
import com.template.entity.Wallet;
import liquibase.pro.packaged.S;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface ExchangeService {
    void getRates() throws JsonProcessingException;

    void exchange(String phoneNumber, CurrencyEnum currency, BigDecimal amount);
}
