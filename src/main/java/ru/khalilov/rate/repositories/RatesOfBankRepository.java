package ru.khalilov.rate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.khalilov.rate.models.Bank;
import ru.khalilov.rate.models.Currency;
import ru.khalilov.rate.models.RateOfBank;

import java.util.Collection;
import java.util.List;

@Repository
public interface RatesOfBankRepository extends JpaRepository<RateOfBank, Integer> {
    List<RateOfBank> findAllByCurrencyInAndBankIn(Collection<Currency> currencies, Collection<Bank> banks);
}