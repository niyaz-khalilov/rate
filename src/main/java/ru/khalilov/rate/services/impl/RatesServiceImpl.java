package ru.khalilov.rate.services.impl;

import lombok.Data;
import org.springframework.stereotype.Service;
import ru.khalilov.rate.models.Bank;
import ru.khalilov.rate.models.Currency;
import ru.khalilov.rate.models.RateOfBank;
import ru.khalilov.rate.repositories.BanksRepository;
import ru.khalilov.rate.repositories.CurrenciesRepository;
import ru.khalilov.rate.repositories.RatesOfBankRepository;
import ru.khalilov.rate.services.RatesService;

import java.util.List;

@Data
@Service
public class RatesServiceImpl implements RatesService {

    private final RatesOfBankRepository ratesOfBankRepository;

    public List<RateOfBank> getAllRates (List<Currency> currencyList, List<Bank> bankList) {
        return ratesOfBankRepository.findAllByCurrencyInAndBankIn(currencyList, bankList);
    }

}
