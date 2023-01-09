package ru.khalilov.rate.services;

import ru.khalilov.rate.models.Bank;
import ru.khalilov.rate.models.Person;

import java.util.List;

public interface BanksService {
    public List<Bank> getAllBanksOfPerson (Person person);
}
