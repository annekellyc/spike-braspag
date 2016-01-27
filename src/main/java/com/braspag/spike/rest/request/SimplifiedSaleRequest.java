package com.braspag.spike.rest.request;

import com.braspag.spike.rest.model.Customer;
import com.braspag.spike.rest.model.Payment;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.Wither;

import static com.braspag.spike.rest.model.Customer.customerExample;
import static com.braspag.spike.rest.model.Payment.paymentExample;
import static lombok.AccessLevel.PRIVATE;

@Data
@Wither
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = PRIVATE)
public class SimplifiedSaleRequest {

    @JsonProperty("MerchantOrderId")
    String merchantOrderId;

    @JsonProperty("Customer")
    Customer customer;

    @JsonProperty("Payment")
    Payment payment;

    public static SimplifiedSaleRequest simplifiedSaleRequestExample() {
        return new SimplifiedSaleRequest()
                .withMerchantOrderId("2014111703")
                .withCustomer(customerExample())
                .withPayment(paymentExample());
    }
}
