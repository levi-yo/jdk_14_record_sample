package com.levi.yoon.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public record SampleRecord(
   @JsonProperty("name") String name,
   @JsonProperty("age") Integer age,
   @JsonProperty("address") Address address
) {

   static String STATIC_VARIABLE = "static variable";

   @JsonIgnore
   public String getInfo() {
      return this.name + " " + this.age;
   }

   public static String get() {
      return STATIC_VARIABLE;
   }
}
