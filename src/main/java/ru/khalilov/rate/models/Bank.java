package ru.khalilov.rate.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "banks")
@Data
@NoArgsConstructor
public class Bank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    @Size(min = 2, max = 30)
    @NotNull
    private String name;

    @ManyToMany
    @JoinTable(
            name = "banksOfPeople",
            joinColumns = @JoinColumn(name = "personId"),
            inverseJoinColumns = @JoinColumn(name = "bankId")
    )
    private List <Person> BankPeopleList;

    @OneToMany(mappedBy = "bank")
    List <RateOfBank> rateOfBanks;
}
