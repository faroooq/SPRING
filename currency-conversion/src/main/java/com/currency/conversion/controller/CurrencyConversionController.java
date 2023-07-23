package com.currency.conversion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.math.BigDecimal;

@RestController
public class CurrencyConversionController {

    @Autowired
    private CurrencyExchangeProxy proxy;

    @GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversion getConversionValue(@PathVariable String from, @PathVariable String to,
            @PathVariable BigDecimal quantity) {

        CurrencyConversion currencyConversion = proxy.getConversionValue(from, to);

        return new CurrencyConversion(currencyConversion.getId(), from, to, BigDecimal.ONE, BigDecimal.ONE, quantity);

    }

}
