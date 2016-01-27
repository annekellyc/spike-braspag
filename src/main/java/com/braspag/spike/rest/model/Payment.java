package com.braspag.spike.rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.Wither;

import java.util.List;

import static com.braspag.spike.rest.model.CreditCard.creditCardExample;
import static lombok.AccessLevel.PRIVATE;

@Data
@Wither
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = PRIVATE)
public class Payment {

    @JsonProperty("Status")
    Integer status;

    @JsonProperty("Installments")
    Integer installments;

    @JsonProperty("AuthorizationCode")
    String authorizationCode;

    @JsonProperty("ProviderReturnCode")
    String providerReturnCode;

    @JsonProperty("AcquirerTransactionId")
    String acquirerTransactionId;

    @JsonProperty("Amount")
    Integer amount;

    @JsonProperty("ReasonMessage")
    String reasonMessage;

    @JsonProperty("PaymentId")
    String paymentId;

    @JsonProperty("Recurrent")
    Boolean recurrent;

    @JsonProperty("ProofOfSale")
    String proofOfSale;

    @JsonProperty("ReasonCode")
    Integer reasonCode;

    @JsonProperty("Capture")
    Boolean capture;

    @JsonProperty("CreditCard")
    CreditCard creditCard;

    @JsonProperty("Provider")
    String provider;

    @JsonProperty("Interest")
    String interest;

    @JsonProperty("ProviderReturnMessage")
    String providerReturnMessage;

    @JsonProperty("Type")
    String type;

    @JsonProperty("ReceivedDate")
    String receivedDate;

    @JsonProperty("ServiceTaxAmount")
    Integer serviceTaxAmount;

    @JsonProperty("Authenticate")
    Boolean authenticate;

    @JsonProperty("Currency")
    String currency;

    @JsonProperty("Country")
    String country;

    @JsonProperty("Links")
    List<Links> links;

    public static Payment paymentExample() {
        return new Payment()
                .withType("CreditCard")
                .withAmount(15700)
                .withProvider("Simulado")
                .withInstallments(1)
                .withCreditCard(creditCardExample());
    }
}
