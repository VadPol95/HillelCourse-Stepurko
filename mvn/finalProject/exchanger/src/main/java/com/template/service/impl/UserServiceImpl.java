package com.template.service.impl;

import com.template.dto.UserDto;
import com.template.entity.CurrencyEnum;
import com.template.entity.User;
import com.template.entity.Wallet;
import com.template.exceptions.NonUniqueUser;
import com.template.mapper.MapperConfig;
import com.template.repository.UserRepository;
import com.template.repository.WalletRepository;
import com.template.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final WalletRepository walletRepository;
    private final MapperConfig mapperConfig;

    @Override
    public Long createUser(UserDto user) {

        User u = userRepository.findByPhoneNumber(user.getPhoneNumber());

        if (Objects.nonNull(u)){
            throw new NonUniqueUser();
        }

        User userSave = userRepository.save(mapperConfig.map(user, User.class));

        Wallet walletUSD = new Wallet()
                .setCurrency(CurrencyEnum.USD)
                .setUser(u)
                .setAmmount(BigDecimal.ZERO)
                .setLastUpdate(new Timestamp(System.currentTimeMillis()));

        Wallet walletUAH = new Wallet()
                .setCurrency(CurrencyEnum.UAH)
                .setUser(u)
                .setAmmount(BigDecimal.ZERO)
                .setLastUpdate(new Timestamp(System.currentTimeMillis()));

        walletRepository.save(walletUAH);
        walletRepository.save(walletUSD);



        return userSave.getId();
    }

    @Override
    public UserDto getUserById(Long id) {
        return mapperConfig.map(userRepository.getOne(id), UserDto.class);
    }

    @Override
    public List<UserDto> getUsers() {
        return mapperConfig.mapAsList(userRepository.findAll(), UserDto.class);
    }
}
