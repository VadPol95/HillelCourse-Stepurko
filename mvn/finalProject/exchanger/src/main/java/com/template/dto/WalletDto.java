package com.template.dto;

import com.template.entity.CurrencyEnum;
import com.template.entity.User;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
@Accessors(chain = true)
public class WalletDto {
    private Long id;
    private CurrencyEnum currency;
    private Timestamp lastUpdate;
    private BigDecimal ammount;
}
