package ru.khalilov.rate.controllers;

import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import ru.khalilov.rate.DTO.CurrenciesDTO;
import ru.khalilov.rate.DTO.RateOfBankDTO;
import ru.khalilov.rate.DTO.RatesOfBanksDTO;
import ru.khalilov.rate.models.Bank;
import ru.khalilov.rate.models.Currency;
import ru.khalilov.rate.models.Person;
import ru.khalilov.rate.models.RateOfBank;
import ru.khalilov.rate.services.BanksService;
import ru.khalilov.rate.services.CurrenciesService;
import ru.khalilov.rate.services.PersonService;
import ru.khalilov.rate.services.RatesService;
import java.util.List;
import java.util.stream.Collectors;


@Data
@RestController
@RequestMapping("/ruRate")
public class rateController {

    private final RatesService ratesServiceImpl;
    private final BanksService banksService;
    private final CurrenciesService currenciesService;
    private final PersonService personService;
    private final ModelMapper modelMapper;

    @GetMapping("/{id}/rates")
    public ResponseEntity<RatesOfBanksDTO> getRates (@PathVariable("id") int id) {
        Person person = personService.getAllCurrenciesOfPerson(id);
        List<Bank> allBanksOfPerson = person.getBanks();
        List<Currency> allCurrenciesOfPerson = currenciesService.getAllCurrenciesOfPerson(person); // TODO
        List<RateOfBank> allRates = ratesServiceImpl.getAllRates(allCurrenciesOfPerson, allBanksOfPerson);
        List<RateOfBankDTO> collect = allRates.stream().map(this::convertToRatesOfBanksDTO).collect(Collectors.toList());
        RatesOfBanksDTO ratesOfBanksDTO = new RatesOfBanksDTO();
        ratesOfBanksDTO.setRateOfBanks(collect);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity<RatesOfBanksDTO>(ratesOfBanksDTO, httpHeaders, HttpStatus.ACCEPTED);
    }

    @GetMapping("/{id}/currencies")
    public ResponseEntity<CurrenciesDTO> getCurrencies() {
        return null;
    }

    @PostMapping("/{id}/currencies")
    public ResponseEntity<HttpStatus> addCurrencies() {
        return null;
    }

    @DeleteMapping("/{id}/currencies")
    public ResponseEntity<HttpStatus> removeCurrencies () {
        return null;
    }

    @GetMapping("/{id}/currencies")
    public ResponseEntity<CurrenciesDTO> getBanks() {
        return null;
    }

    @PostMapping("/{id}/currencies")
    public ResponseEntity<HttpStatus> addBanks() {
        return null;
    }

    @DeleteMapping("/{id}/currencies")
    public ResponseEntity<HttpStatus> removeBanks() {
        return null;
    }

    private RateOfBankDTO convertToRatesOfBanksDTO (RateOfBank rateOfBank) {
        RateOfBankDTO map = modelMapper.map(rateOfBank, RateOfBankDTO.class);
        map.setBankName(rateOfBank.getBank().getName());
        map.setCurrencyName(rateOfBank.getCurrency().getName());
        return map;
    }


}
