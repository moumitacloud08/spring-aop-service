package com.spring.service.bls;

import org.springframework.stereotype.Component;

import com.spring.service.annotations.InTransaction;
import com.spring.service.annotations.Secured;
import com.spring.service.ds.CurrencyId;

@Component("currency_service")
@Secured
public class CurrencyService {
    @InTransaction
    public float getExchangeRate(String from, String to) {
        return 0f;
    }

    public float getExchangeRate(String from, String to, int multiplier) {
        return 0f;
    }

    public String getCurrencyLongName(CurrencyId currencyId) {
        return null;
    }

    public String getCurrencyCountryName(CurrencyId currencyId) {
        if (currencyId == CurrencyId.USD)
            return "USA";
        else
            throw new IllegalArgumentException("test");
    }
}
