package com.cleanLandAPI.client.rest.dto;

import com.cleanLandAPI.data.enums.Rarity;
import com.cleanLandAPI.data.enums.Specialities;
import com.fasterxml.jackson.annotation.JsonProperty;

public record HeroRequest(
        @JsonProperty("name") String name,
        @JsonProperty("speciality") Specialities speciality,
        @JsonProperty("rarity") Rarity rarity

) {
}
