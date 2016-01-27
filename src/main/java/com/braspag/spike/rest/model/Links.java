package com.braspag.spike.rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import static lombok.AccessLevel.PRIVATE;

@Data
@FieldDefaults(level = PRIVATE)
public class Links {

    @JsonProperty("Rel")
    String rel;

    @JsonProperty("Href")
    String href;

    @JsonProperty("Method")
    String method;
}
