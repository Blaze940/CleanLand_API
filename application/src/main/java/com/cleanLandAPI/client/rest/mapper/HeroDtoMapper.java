package com.cleanLandAPI.client.rest.mapper;

import com.cleanLandAPI.client.rest.dto.HeroDto;
import com.cleanLandAPI.data.Hero;

public interface HeroDtoMapper {

    static HeroDto toDto(Hero hero) {
        return new HeroDto(
            hero.getName(),
            hero.getLifePoints(),
            hero.getExperiencePoints(),
            hero.getPowers(),
            hero.getLevel());
    }

}