package ru.khalilov.rate.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Table(name = "people")
@NoArgsConstructor
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column (name = "name")
    @Size(min = 2, max = 30)
    @NotNull
    private String name;

    @Column (name = "surname")
    @Size(min = 2, max = 30)
    @NotNull
    private String surname;

    @Column (name = "password")
    @NotNull
    private String password;

    @Column (name = "email")
    @NotNull
    @Email
    private String email;

    @ManyToMany (mappedBy = "bankPeopleList")
    private List <Bank> banks;

    @ManyToMany (mappedBy = "currencyPeopleList")
    private List <Currency> currencies;
}
