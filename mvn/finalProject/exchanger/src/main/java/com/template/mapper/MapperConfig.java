package com.template.mapper;

import com.template.dto.UserDto;
import com.template.dto.WalletDto;
import com.template.entity.User;
import com.template.entity.Wallet;
import lombok.extern.slf4j.Slf4j;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class MapperConfig extends ConfigurableMapper {

    @Override
    protected void configure(MapperFactory factory) {
        factory.classMap(User.class, UserDto.class)
                .mapNulls(false)
                .byDefault()
                .register();
        factory.classMap(UserDto.class, User.class)
                .mapNulls(false)
                .byDefault()
                .register();

        factory.classMap(Wallet.class, WalletDto.class)
                .mapNulls(false)
                .byDefault()
                .register();
        factory.classMap(WalletDto.class, Wallet.class)
                .mapNulls(false)
                .byDefault()
                .register();

    }
}
