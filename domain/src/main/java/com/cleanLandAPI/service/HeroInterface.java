package com.cleanLandAPI.service;

import com.cleanLandAPI.data.Hero;
import com.cleanLandAPI.ports.ApplicationError;
import io.vavr.control.Either;

public interface HeroInterface {

    void setLifePoints(Hero hero, int lifePoints);
    Hero save(Hero hero);
    void attack();

}
