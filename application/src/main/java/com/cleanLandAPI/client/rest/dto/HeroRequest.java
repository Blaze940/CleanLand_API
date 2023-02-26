package com.cleanLandAPI.client.rest.dto;

import com.cleanLandAPI.data.Speciality;
import com.cleanLandAPI.data.enums.Rarity;
import com.fasterxml.jackson.annotation.JsonProperty;

public record HeroRequest(

        @JsonProperty("name") String name,
        @JsonProperty("lifePoints") Long lifePoints,
        @JsonProperty("experiencePoints") Long experiencePoints,
        @JsonProperty("powers") int powers,
        @JsonProperty("level") int level,
        @JsonProperty("speciality") Speciality speciality,
        @JsonProperty("rarity") Rarity rarity


) {
}
