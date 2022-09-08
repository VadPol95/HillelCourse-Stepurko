package com.template.service.impl;

import com.template.dto.TransferDto;
import com.template.dto.WalletDto;
import com.template.entity.Notification;
import com.template.entity.TypeEnum;
import com.template.entity.User;
import com.template.entity.Wallet;
import com.template.exceptions.AmountNotFoundException;
import com.template.exceptions.NotEnoughtMoneyException;
import com.template.exceptions.UserNotFoundException;
import com.template.mapper.MapperConfig;
import com.template.repository.NotificationRepository;
import com.template.repository.UserRepository;
import com.template.repository.WalletRepository;
import com.template.service.WalletService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class WalletServiceImpl implements WalletService {

    private final UserRepository userRepository;
    private final WalletRepository walletRepository;
    private final MapperConfig mapperConfig;
    private final NotificationRepository notificationRepository;

    @Override
    public List<Wallet> getWalletsByPhoneNumber(String phoneNumber) {
        User user = userRepository.findByPhoneNumber(phoneNumber);

        if (Objects.isNull(user)) {
            throw new UserNotFoundException();
        }

        return  walletRepository.findAllByUser(user);
    }

    @Override
    public void moneyOperation(String phoneNumber, TypeEnum operationEnum, BigDecimal amount) {

    }

    @Override
    public WalletDto getWalletById(Long id) {
        Optional<Wallet> walletOpt = walletRepository.findById(id);

        if (walletOpt.isPresent()) {
            return mapperConfig.map(walletOpt.get(), WalletDto.class);
        } else {
            throw new AmountNotFoundException();
        }
    }

    @Override
    public WalletDto moneyOperationTransaction(TypeEnum operationEnum, TransferDto transferInformation) {
        Optional<Wallet> walletOpt = walletRepository.findById(transferInformation.getId());

        if (walletOpt.isEmpty()) {
            throw new AmountNotFoundException();
        }

        Wallet wallet = walletOpt.get();
        BigDecimal currentAmount = wallet.getAmmount();
        if (TypeEnum.GET.equals(operationEnum)){
            if (currentAmount.compareTo(transferInformation.getAmount()) < 0) {
                throw new NotEnoughtMoneyException();
            }
            wallet.setAmmount(currentAmount.subtract(transferInformation.getAmount()));
        } else if (TypeEnum.PUT.equals(operationEnum)) {
           wallet.setAmmount(currentAmount.add(transferInformation.getAmount()));
        }
        walletRepository.save(wallet);

        notificationRepository.save(new Notification()
                .setType(operationEnum)
                .setId(wallet.getUser().getId())
                .setContent(transferInformation.getAmount().toPlainString()));

        return mapperConfig.map(wallet, WalletDto.class);
    }
}
