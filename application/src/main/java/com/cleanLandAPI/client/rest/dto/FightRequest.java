package com.cleanLandAPI.client.rest.dto;

import com.cleanLandAPI.data.Hero;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.UUID;

public record FightRequest(
        @JsonProperty("fightDate") LocalDate fightDate,
        @JsonProperty("attacker") UUID attacker,
        @JsonProperty("defender") UUID defender) {



}
