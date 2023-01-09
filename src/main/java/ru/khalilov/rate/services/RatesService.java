package ru.khalilov.rate.services;

import ru.khalilov.rate.models.Bank;
import ru.khalilov.rate.models.Currency;
import ru.khalilov.rate.models.RateOfBank;

import java.util.List;

public interface RatesService {
    public List<RateOfBank> getAllRates (List<Currency> currencyList, List<Bank> bankList);
}
