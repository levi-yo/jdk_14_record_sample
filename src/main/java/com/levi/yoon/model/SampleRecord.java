package com.levi.yoon.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record SampleRecord(
   @JsonProperty("name") String name,
   @JsonProperty("age") Integer age,
   @JsonProperty("address") Address address
) {}
