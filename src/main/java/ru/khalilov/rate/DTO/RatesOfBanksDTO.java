package ru.khalilov.rate.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RatesOfBanksDTO {
    List <RateOfBankDTO> rateOfBanks;
}
