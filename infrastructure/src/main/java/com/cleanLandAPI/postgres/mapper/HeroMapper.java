package com.cleanLandAPI.postgres.mapper;

import com.cleanLandAPI.data.Hero;
import com.cleanLandAPI.postgres.entity.HeroEntity;


import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public interface HeroMapper {

    static Hero toDomain(HeroEntity heroEntity){
        return Hero.builder()
                .id(heroEntity.getId())
                .name(heroEntity.getName())
                .speciality(heroEntity.getSpeciality())
                .rarity(heroEntity.getRarity())
                .level(heroEntity.getLevel())
                .lifePoints(heroEntity.getLifePoints())
                .powerBoost(heroEntity.getPowerBoost())
                .armor(heroEntity.getArmor())
                .experiencePoints(heroEntity.getExperiencePoints())
                .power(heroEntity.getPower())
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
                .powerBoost(hero.getPowerBoost())
                .armor(hero.getArmor())
                .experiencePoints(hero.getExperiencePoints())
                .power(hero.getPower())
                .build();
    }


    static List<Hero> toDomainList(List<HeroEntity> heroList){
        return heroList.stream()
                .map(HeroMapper::toDomain)
                .collect(Collectors.toList());
    }

}
