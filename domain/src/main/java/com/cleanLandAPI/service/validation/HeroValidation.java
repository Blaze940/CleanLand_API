package com.cleanLandAPI.service.validation;

import com.cleanLandAPI.data.Hero;

public interface HeroValidation {

    static boolean validateHero(Hero hero){
        return hero.getName() != null
                && hero.getSpeciality() != null
                && hero.getRarity() != null
                && hero.getLevel() >= 1
                && hero.getLevel() < 100;
    }

}
