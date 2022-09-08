package com.template.dto;

import com.template.entity.CurrencyEnum;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ExchangeDto {
    private String phoneNumber;
    private CurrencyEnum currency;
    private BigDecimal amount;
}
