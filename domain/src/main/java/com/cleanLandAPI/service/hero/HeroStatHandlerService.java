package com.cleanLandAPI.service.hero;

import com.cleanLandAPI.data.Hero;
import com.cleanLandAPI.data.enums.Rarity;
import com.cleanLandAPI.data.enums.Specialities;

import java.util.List;

public class HeroStatHandlerService {


    public static List<Hero> createInitialHeroes(){
        List<Hero> heroes = List.of(
                setHeroStat("Titank", Specialities.TANK, Rarity.COMMON),
                setHeroStat("Assassinge", Specialities.ASSASSIN, Rarity.COMMON),
                setHeroStat("Charlatan", Specialities.MAGE, Rarity.COMMON),
                setHeroStat("Tankou", Specialities.TANK, Rarity.RARE),
                setHeroStat("Dahmmer", Specialities.ASSASSIN, Rarity.RARE),
                setHeroStat("Magichien", Specialities.MAGE, Rarity.RARE),
                setHeroStat("Tortank", Specialities.TANK, Rarity.LEGENDARY),
                setHeroStat("Hitler", Specialities.ASSASSIN, Rarity.LEGENDARY),
                setHeroStat("RoiMage", Specialities.MAGE, Rarity.LEGENDARY)
        );
        return heroes;
    }

    private static Hero setHeroStat(String name, Specialities speciality, Rarity rarity){
        Hero basicHero = Hero.builder()
                        .name(name)
                        .speciality(speciality)
                        .rarity(rarity)
                        .build();
        Hero heroWithSpecialityStat = presetHeroSpecialityStat(basicHero);
        Hero completeBasicHero = presetHeroRarityStat(heroWithSpecialityStat);

        return completeBasicHero;
    }

    private static Hero presetHeroSpecialityStat(Hero hero){
        Hero heroToReturn = hero;
        switch (hero.getSpeciality()){
            case TANK:
                heroToReturn.setLifePoints(1000L);
                heroToReturn.setPower(100);
                heroToReturn.setArmor(20);
                heroToReturn.setPowerBoost(20);
                break;
            case ASSASSIN:
                heroToReturn.setLifePoints(800L);
                heroToReturn.setPower(200);
                heroToReturn.setArmor(5);
                heroToReturn.setPowerBoost(30);
                break;
            case MAGE:
                heroToReturn.setLifePoints(700L);
                heroToReturn.setPower(150);
                heroToReturn.setArmor(10);
                heroToReturn.setPowerBoost(25);
                break;
        }
        return heroToReturn;
    }

    private static Hero presetHeroRarityStat(Hero hero){
        Hero heroToReturn = hero;
        switch (hero.getRarity()){
            case COMMON:
                heroToReturn.setLifePoints((long) (heroToReturn.getLifePoints() + heroToReturn.getLifePoints() * 0.1));
                heroToReturn.setPower((int) (heroToReturn.getPower() + heroToReturn.getPower() * 0.1));
                heroToReturn.setArmor((int) (heroToReturn.getArmor() + heroToReturn.getArmor() * 0.1));
                break;
            case RARE:
                heroToReturn.setLifePoints((long) (heroToReturn.getLifePoints() + heroToReturn.getLifePoints() * 0.2));
                heroToReturn.setPower((int) (heroToReturn.getPower() + heroToReturn.getPower() * 0.2));
                heroToReturn.setArmor((int) (heroToReturn.getArmor() + heroToReturn.getArmor() * 0.2));
                break;
            case LEGENDARY:
                heroToReturn.setLifePoints((long) (heroToReturn.getLifePoints() + heroToReturn.getLifePoints() * 0.3));
                heroToReturn.setPower((int) (heroToReturn.getPower() + heroToReturn.getPower() * 0.3));
                heroToReturn.setArmor((int) (heroToReturn.getArmor() + heroToReturn.getArmor() * 0.3));
                break;
        }
        return heroToReturn;
    }


}
