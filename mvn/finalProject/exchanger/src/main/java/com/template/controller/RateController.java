package com.template.controller;

import com.template.dto.TransferDto;
import com.template.dto.WalletDto;
import com.template.entity.Rate;
import com.template.entity.TypeEnum;
import com.template.entity.Wallet;
import com.template.service.RateService;
import com.template.service.WalletService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @version 0.0.1
 */
@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
@Slf4j
public class RateController {

    private final RateService rateService;

    @GetMapping("rate")
    public Rate getCurrentRate(){
        return rateService.getCurrentRate();
    }

}
