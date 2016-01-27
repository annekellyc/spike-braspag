package com.braspag.spike.rest.response;

import com.braspag.spike.rest.model.Customer;
import com.braspag.spike.rest.model.Payment;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import static lombok.AccessLevel.PRIVATE;

@Data
@FieldDefaults(level = PRIVATE)
public class SimplifiedSaleResponse {

    @JsonProperty("Payment")
    Payment payment;

    @JsonProperty("Customer")
    Customer customer;

    @JsonProperty("MerchantOrderId")
    String merchantOrderId;
}
