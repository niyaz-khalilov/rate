package ru.khalilov.rate.services.impl;

import lombok.Data;
import org.springframework.stereotype.Service;
import ru.khalilov.rate.models.Bank;
import ru.khalilov.rate.models.Currency;
import ru.khalilov.rate.models.Person;
import ru.khalilov.rate.repositories.BanksRepository;
import ru.khalilov.rate.repositories.CurrenciesRepository;
import ru.khalilov.rate.services.BanksService;

import java.util.Collections;
import java.util.List;

@Data
@Service
public class BanksServiceImpl implements BanksService {

    private final BanksRepository banksRepository;

    public List<Bank> getAllBanksOfPerson (Person person) {
        return banksRepository.findAllByBankPeopleList(Collections.singletonList(person));
    }
}
