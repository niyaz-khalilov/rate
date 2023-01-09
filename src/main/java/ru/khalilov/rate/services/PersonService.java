package ru.khalilov.rate.services;

import org.springframework.stereotype.Repository;
import ru.khalilov.rate.models.Person;

public interface PersonService {
    Person getAllCurrenciesOfPerson (int id);
}
