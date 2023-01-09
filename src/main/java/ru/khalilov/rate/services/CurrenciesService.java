package ru.khalilov.rate.services;

import ru.khalilov.rate.models.Currency;
import ru.khalilov.rate.models.Person;

import java.util.List;

public interface CurrenciesService {
    List<Currency> getAllCurrenciesOfPerson (Person person);
}
