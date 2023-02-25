package com.cleanLandAPI.service;

import com.cleanLandAPI.data.Hero;
import com.cleanLandAPI.data.enums.Specialities;
import com.cleanLandAPI.ports.ApplicationError;
import com.cleanLandAPI.service.validation.HeroValidation;
import io.vavr.control.Either;

public class HeroService implements HeroInterface{

    @Override
    public void setLifePoints(Hero hero, int lifePoints) {
        hero.updateLifePoints((long) lifePoints);
    }

    @Override
    public Hero save(Hero hero){
        if (HeroValidation.validateHero(hero)){
            System.out.println("Hero saved");
        }
        System.out.println("Hero not saved for real");
        return hero;
    }

    @Override
    public void attack() {
        System.out.println("Hero attacked");
    }
}
