package ru.khalilov.rate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.khalilov.rate.models.Person;

public interface PersonRepository extends JpaRepository <Person, Integer> {

}
