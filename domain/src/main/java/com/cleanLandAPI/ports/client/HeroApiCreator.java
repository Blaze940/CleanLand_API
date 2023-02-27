package com.cleanLandAPI.ports.client;

import com.cleanLandAPI.data.Hero;
import com.cleanLandAPI.data.enums.Rarity;
import com.cleanLandAPI.data.enums.Specialities;

import java.util.List;
import java.util.Optional;

public interface HeroApiCreator {
    Optional<Hero> findHeroById(String id);
    List<Hero> createBasicHeroes();
    Hero save(Hero hero);

    Hero createOne(Hero hero) ;

    List<Hero> saveBasicHeroes(List<Hero> basicHeroes);

}
