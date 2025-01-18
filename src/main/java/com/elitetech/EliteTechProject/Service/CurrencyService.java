package com.elitetech.EliteTechProject.Service;

import com.elitetech.EliteTechProject.Model.CurrencyConverter;
import org.springframework.stereotype.Service;

@Service
public class CurrencyService {
    private final CurrencyConverter converter;

    public CurrencyService() {
        this.converter = new CurrencyConverter();
    }

    public double convert(String from, String to, double amount) {
        return converter.convert(from, to, amount);
    }
}