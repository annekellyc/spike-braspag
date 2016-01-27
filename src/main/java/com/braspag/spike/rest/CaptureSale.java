package com.braspag.spike.rest;

import com.braspag.spike.rest.response.CaptureSaleResponse;
import com.mashape.unirest.http.HttpResponse;

import static com.braspag.spike.rest.request.BraspagHeader.*;
import static com.mashape.unirest.http.Unirest.put;

public class CaptureSale {

    public static final String URL = "https://apisandbox.braspag.com.br/v2/sales/%s/capture?amount=%s&serviceTaxAmount=%s";

    public HttpResponse<CaptureSaleResponse> process(String paymentId, Integer amount, Integer serviceTaxAmount) throws Exception {
        String url = String.format(URL, paymentId, amount, serviceTaxAmount);
        return put(url)
                .header("Content-Type", "application/json")
                .header("MerchantId", MERCHANT_ID)
                .header("MerchantKey", MERCHANT_KEY)
                .header("RequestId", REQUEST_ID)
                .asObject(CaptureSaleResponse.class);
    }
}
