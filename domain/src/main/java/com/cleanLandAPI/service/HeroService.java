package com.cleanLandAPI.service;

import com.cleanLandAPI.data.Hero;
import com.cleanLandAPI.data.enums.Specialities;
import com.cleanLandAPI.exception.HeroException;
import com.cleanLandAPI.ports.ApplicationError;
import com.cleanLandAPI.ports.server.HeroSpi;
import com.cleanLandAPI.service.validation.HeroValidation;
import io.vavr.control.Either;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class HeroService implements HeroInterface{

    private final HeroSpi heroSpi;

    @Override
    public void setLifePoints(Hero hero, int lifePoints) {
        hero.updateLifePoints((long) lifePoints);
    }

    @Override
    public Hero save(Hero hero){
        if (!HeroValidation.validateHero(hero)){
            throw new HeroException("Impossible de sauvegarder le héros");
        }
        return heroSpi.save(hero);
    }

    @Override
    public void attack() {
        System.out.println("Hero attacked");
    }
}
