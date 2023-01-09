package ru.khalilov.rate.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Table(name = "currencies")
@NoArgsConstructor
public class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    @Size(min = 2, max = 8)
    @NotNull
    private String name;

    @ManyToMany
    @JoinTable(
            name = "currenciesOfPeople",
            joinColumns = @JoinColumn(name = "personId"),
            inverseJoinColumns = @JoinColumn(name = "currencyId")
    )
    private List<Person> CurrencyPeopleList;

    @OneToMany(mappedBy = "currency")
    List <RateOfBank> rateOfBanks;
}
