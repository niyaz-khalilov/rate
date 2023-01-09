package ru.khalilov.rate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.khalilov.rate.models.Currency;
import ru.khalilov.rate.models.Person;
import java.util.List;

@Repository
public interface CurrenciesRepository extends JpaRepository <Currency, Integer> {
    List<Currency> findAllByCurrencyPeopleList(List <Person> list);
}
