package com.cleanLandAPI.client.rest.dto;

import com.cleanLandAPI.data.Speciality;
import com.cleanLandAPI.data.enums.Rarity;
import com.cleanLandAPI.data.enums.Specialities;
import com.fasterxml.jackson.annotation.JsonProperty;

public record HeroRequest(

        @JsonProperty("name") String name,
        @JsonProperty("lifePoints") Long lifePoints,
        @JsonProperty("experiencePoints") Long experiencePoints,
        @JsonProperty("powers") int powers,
        @JsonProperty("level") int level,
        @JsonProperty("armor") int armor,
        @JsonProperty("powerBoost") int powerBoost,
        @JsonProperty("speciality") Specialities speciality,
        @JsonProperty("rarity") Rarity rarity


) {
}
