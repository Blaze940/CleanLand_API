package com.cleanLandAPI.client.rest.mapper;

import com.cleanLandAPI.client.rest.dto.HeroDto;
import com.cleanLandAPI.client.rest.dto.HeroRequest;
import com.cleanLandAPI.data.Hero;

import java.util.List;
import java.util.stream.Collectors;

public interface HeroDtoMapper {

    static HeroDto toDto(Hero hero) {
        return new HeroDto(
                hero.getId(),
                hero.getName(),
                hero.getLifePoints(),
                hero.getExperiencePoints(),
                hero.getPower(),
                hero.getLevel(),
                hero.getArmor(),
                hero.getPowerBoost(),
                hero.getSpeciality(),
                hero.getRarity());
    }

    static Hero toEntity(HeroRequest heroDto) {
        return Hero.builder()
                .name(heroDto.name())
                .speciality(heroDto.speciality())
                .rarity(heroDto.rarity())
                .build();
    }

    static List<HeroDto> toDtoList(List<Hero> heroes) {
        return heroes.stream()
                .map(HeroDtoMapper::toDto)
                .collect(Collectors.toList());
    }

}
