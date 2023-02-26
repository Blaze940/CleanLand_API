package com.cleanLandAPI.client.rest.dto;

import com.cleanLandAPI.data.Hero;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.time.LocalDate;
import java.util.UUID;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;

@JsonAutoDetect(fieldVisibility = ANY)
public record FightDto(UUID fightId, LocalDate fightDate, UUID attacker, UUID defender, UUID winner
) {
}
