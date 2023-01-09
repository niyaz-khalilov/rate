package ru.khalilov.rate.services.impl;

import lombok.Data;
import org.springframework.stereotype.Service;
import ru.khalilov.rate.models.Currency;
import ru.khalilov.rate.models.Person;
import ru.khalilov.rate.repositories.CurrenciesRepository;
import ru.khalilov.rate.services.CurrenciesService;

import java.util.Collections;
import java.util.List;

@Data
@Service
public class CurrenciesServiceImpl implements CurrenciesService{

    private final CurrenciesRepository currenciesRepository;

    public List<Currency> getAllCurrenciesOfPerson (Person person) {
        return currenciesRepository.findAllByCurrencyPeopleList(Collections.singletonList(person));
    }

}
