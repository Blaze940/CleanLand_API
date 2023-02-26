package com.cleanLandAPI.service;

import com.cleanLandAPI.data.Hero;
import com.cleanLandAPI.exception.HeroException;
import com.cleanLandAPI.ports.client.HeroSpiCreatorInterface;
import com.cleanLandAPI.ports.server.HeroSpiCreatorHero;
import com.cleanLandAPI.service.validation.HeroValidation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class HeroService implements HeroSpiCreatorInterface, HeroInterface{

    private final HeroSpiCreatorHero heroSpi;

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
