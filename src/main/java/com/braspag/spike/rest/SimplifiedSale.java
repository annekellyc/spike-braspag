package com.braspag.spike.rest;

import com.braspag.spike.rest.response.SimplifiedSaleResponse;
import com.mashape.unirest.http.HttpResponse;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;

import static com.braspag.spike.rest.request.BraspagHeader.*;
import static com.braspag.spike.rest.request.SimplifiedSaleRequest.simplifiedSaleRequestExample;
import static com.mashape.unirest.http.Unirest.post;
import static lombok.AccessLevel.PRIVATE;

@Component
@FieldDefaults(level = PRIVATE)
public class SimplifiedSale {

    public HttpResponse<SimplifiedSaleResponse> process() throws Exception {
        return post("https://apisandbox.braspag.com.br/v2/sales/")
                .header("Content-Type", "application/json")
                .header("MerchantId", MERCHANT_ID)
                .header("MerchantKey", MERCHANT_KEY)
                .header("RequestId", REQUEST_ID)
                .body(simplifiedSaleRequestExample())
                .asObject(SimplifiedSaleResponse.class);
    }
}
