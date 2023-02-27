package com.cleanLandAPI.client.rest.dto;

import com.cleanLandAPI.data.Speciality;
import com.cleanLandAPI.data.enums.Rarity;
import com.cleanLandAPI.data.enums.Specialities;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.UUID;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;

@JsonAutoDetect(fieldVisibility = ANY)
public record HeroDto (UUID id, String name, Long lifePoints, Long experiencePoints, int powers, int level,int armor, int powerBoost, Specialities speciality, Rarity rarity){}
