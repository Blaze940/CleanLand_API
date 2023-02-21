package com.cleanLandAPI.service;

import com.cleanLandAPI.data.Hero;
import com.cleanLandAPI.ports.ApplicationError;
import io.vavr.control.Either;

public class HeroService implements HeroInterface{

    @Override
    public void setLifePoints(int lifePoints) {

    }

    @Override
    public Either<ApplicationError, Hero> createHero(Hero hero) {
        return null;
    }

    @Override
    public void attack() {

    }
}
