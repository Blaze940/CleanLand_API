package com.cleanLandAPI.postgres.mapper;

import com.cleanLandAPI.data.Hero;
import com.cleanLandAPI.postgres.entity.HeroEntity;

import java.util.List;
import java.util.stream.Collectors;

public interface HeroMapper {

    static Hero toDomain(HeroEntity hero){
        return Hero.builder()
                .id(hero.getId())
                .name(hero.getName())
                .speciality(hero.getSpeciality())
                .rarity(hero.getRarity())
                .level(hero.getLevel())
                .lifePoints(hero.getLifePoints())
                .build();
    }

    static HeroEntity fromDomain(Hero hero){
        return HeroEntity.builder()
                .id(hero.getId())
                .name(hero.getName())
                .speciality(hero.getSpeciality())
                .rarity(hero.getRarity())
                .level(hero.getLevel())
                .lifePoints(hero.getLifePoints())
                .build();
    }


    static List<Hero> toDomainList(List<HeroEntity> heroList){
        return heroList.stream()
                .map(HeroMapper::toDomain)
                .collect(Collectors.toList());
    }


}
