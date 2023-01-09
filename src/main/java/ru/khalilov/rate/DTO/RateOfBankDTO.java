package ru.khalilov.rate.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RateOfBankDTO {

    private double purchasePrice;

    private double sellingPrice;

    private LocalDateTime measurementTime;

    private String currencyName;

    private String BankName;
}
