package ru.khalilov.rate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.khalilov.rate.models.Bank;
import ru.khalilov.rate.models.Person;

import java.util.List;

@Repository
public interface BanksRepository extends JpaRepository <Bank, Integer> {
    List<Bank> findAllByBankPeopleList (List <Person> list);
}
