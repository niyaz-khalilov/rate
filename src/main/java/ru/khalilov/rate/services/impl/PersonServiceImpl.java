package ru.khalilov.rate.services.impl;
import lombok.Data;
import org.springframework.stereotype.Service;
import ru.khalilov.rate.models.Person;
import ru.khalilov.rate.repositories.PersonRepository;
import ru.khalilov.rate.services.PersonService;

import java.util.Collections;

@Service
@Data
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    public Person getAllCurrenciesOfPerson (int id) {
        return personRepository.getReferenceById(id);
    }
}
