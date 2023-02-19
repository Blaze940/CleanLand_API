package com.cleanLandAPI.service;

import com.cleanLandAPI.data.Hero;

public interface HeroInterface {

    void setLifePoints(int lifePoints);
    void createHero(Hero hero);
    void attack();

}
