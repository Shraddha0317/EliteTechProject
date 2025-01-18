package com.elitetech.EliteTechProject.Model;

import java.util.HashMap;
import java.util.Map;

public class CurrencyConverter {
    private Map<String, Double> exchangeRates;

    public CurrencyConverter() {
        exchangeRates = new HashMap<>();
        exchangeRates.put("USD_INR", 82.50);
        exchangeRates.put("EUR_INR", 90.00);
        exchangeRates.put("GBP_INR", 101.25);
    }

    public double convert(String from, String to, double amount) {
        String key = from + "_" + to;
        if (exchangeRates.containsKey(key)) {
            return amount * exchangeRates.get(key);
        } else {
            throw new IllegalArgumentException("Exchange rate not found for " + key);
        }
    }
}
