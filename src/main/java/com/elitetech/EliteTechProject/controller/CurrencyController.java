package com.elitetech.EliteTechProject.controller;

import com.elitetech.EliteTechProject.Service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/currency")
public class CurrencyController {

    @Autowired
    private CurrencyService currencyService;

    @GetMapping("/convert")
    public double convertCurrency(
            @RequestParam String from,
            @RequestParam String to,
            @RequestParam double amount) {
        return currencyService.convert(from, to, amount);
    }
}