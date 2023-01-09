package ru.khalilov.rate.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "ratesOfBanks")
@Data
@NoArgsConstructor
public class RateOfBank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    private double purchasePrice;

    private double sellingPrice;

    @Column(name = "measurementTime")
    private LocalDateTime measurementTime;

    @ManyToOne()
    @JoinColumn(name = "currencyId")
    private Currency currency;

    @ManyToOne()
    @JoinColumn(name = "currencyId")
    private Bank bank;
}
