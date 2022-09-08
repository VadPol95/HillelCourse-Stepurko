package com.template.service;

import com.template.dto.TransferDto;
import com.template.dto.WalletDto;
import com.template.entity.TypeEnum;
import com.template.entity.Wallet;

import java.math.BigDecimal;
import java.util.List;

public interface WalletService {
    List<Wallet> getWalletsByPhoneNumber(String phoneNumber);

    WalletDto getWalletById(Long id);

    void moneyOperation(String phoneNumber, TypeEnum operationEnum, BigDecimal amount);

    WalletDto moneyOperationTransaction(TypeEnum operationEnum, TransferDto transferInformation);

}
