package com.braspag.spike;

import com.braspag.spike.config.UnirestConfiguration;
import com.braspag.spike.rest.CaptureSale;
import com.braspag.spike.rest.SimplifiedSale;
import com.braspag.spike.rest.model.Payment;
import com.braspag.spike.rest.response.CaptureSaleResponse;
import com.braspag.spike.rest.response.SimplifiedSaleResponse;
import com.mashape.unirest.http.HttpResponse;

public class Application {

    public static void main(String[] args) throws Exception {
        UnirestConfiguration.objectMapperWrapper();

        HttpResponse<SimplifiedSaleResponse> simplifiedSaleResponse =
                executeSimplifiedSaleExample();

        HttpResponse<CaptureSaleResponse> captureSaleResponse =
                executeCaptureSaleExample(simplifiedSaleResponse);

        System.out.println("====> Capture Sale Example - Credit Card");
        System.out.println(captureSaleResponse.getBody());
    }

    private static HttpResponse<CaptureSaleResponse> executeCaptureSaleExample(HttpResponse<SimplifiedSaleResponse> simplifiedSaleResponse) throws Exception {
        CaptureSale captureSale = new CaptureSale();
        Payment payment = simplifiedSaleResponse.getBody().getPayment();
        String paymentId = payment.getPaymentId();
        Integer amount = payment.getAmount();
        Integer serviceTaxAmount = payment.getServiceTaxAmount();
        return captureSale.process(paymentId, amount, serviceTaxAmount);
    }

    private static HttpResponse<SimplifiedSaleResponse> executeSimplifiedSaleExample() throws Exception {
        SimplifiedSale simplifiedSale = new SimplifiedSale();
        return simplifiedSale.process();
    }
}
