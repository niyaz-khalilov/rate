package ru.khalilov.rate.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.khalilov.rate.DTO.RatesDTO;

@RestController
@RequestMapping("/rurate")
public class rateController {

    @GetMapping("/rates")
    public ResponseEntity<RatesDTO> getRates () {
        return null;
    }

    @PostMapping("/rates")
    public ResponseEntity<HttpStatus> addCurrency () {
        return null;
    }

    @DeleteMapping("/rates")
    public ResponseEntity<HttpStatus> removeCurrency () {
        return null;
    }

    
}
