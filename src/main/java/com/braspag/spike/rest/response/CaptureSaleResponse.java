package com.braspag.spike.rest.response;

import com.braspag.spike.rest.model.Links;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

import static lombok.AccessLevel.PRIVATE;

@Data
@FieldDefaults(level = PRIVATE)
public class CaptureSaleResponse {

    @JsonProperty("Status")
    Integer status;

    @JsonProperty("ReasonCode")
    Integer reasonCode;

    @JsonProperty("ReasonMessage")
    String reasonMessage;

    @JsonProperty("ProviderReturnCode")
    String providerReturnCode;

    @JsonProperty("ProviderReturnMessage")
    String providerReturnMessage;

    @JsonProperty("Links")
    List<Links> links;
}
