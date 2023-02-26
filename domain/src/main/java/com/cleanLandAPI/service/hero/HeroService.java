package com.cleanLandAPI.service.hero;

import com.cleanLandAPI.data.Hero;
import com.cleanLandAPI.exception.HeroException;
import com.cleanLandAPI.ports.client.HeroApiCreatorInterface;
import com.cleanLandAPI.ports.server.HeroSpiCreatorHero;
import com.cleanLandAPI.service.hero.validation.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class HeroService implements HeroApiCreatorInterface, HeroInterface{

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
