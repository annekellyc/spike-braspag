package com.braspag.spike.rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.Wither;

import static lombok.AccessLevel.PRIVATE;

@Data
@Wither
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = PRIVATE)
public class CreditCard {

    @JsonProperty("CardNumber")
    String cardNumber;

    @JsonProperty("Brand")
    String brand;

    @JsonProperty("ExpirationDate")
    String expirationDate;

    @JsonProperty("SaveCard")
    Boolean saveCard;

    @JsonProperty("Holder")
    String holder;

    @JsonProperty("SecurityCode")
    String securityCode;

    public static CreditCard creditCardExample() {
        return new CreditCard()
                .withCardNumber("1234123412341231")
                .withHolder("Teste Holder")
                .withExpirationDate("12/2021")
                .withBrand("Visa")
                .withSecurityCode("123");
    }
}
