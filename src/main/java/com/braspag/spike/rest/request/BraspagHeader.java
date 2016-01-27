package com.braspag.spike.rest.request;

import lombok.experimental.FieldDefaults;

@FieldDefaults(makeFinal = true)
public class BraspagHeader {
    public static String MERCHANT_ID = System.getenv("MERCHANT_ID");
    public static String MERCHANT_KEY = System.getenv("MERCHANT_KEY");
    public static String REQUEST_ID = System.getenv("REQUEST_ID");
}
