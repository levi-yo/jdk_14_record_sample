package com.levi.yoon.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Address(
    @JsonProperty("si") String si,
    @JsonProperty("gu") String gu,
    @JsonProperty("dong") String dong
) {}
