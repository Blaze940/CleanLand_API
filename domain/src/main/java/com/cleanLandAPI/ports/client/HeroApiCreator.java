package com.cleanLandAPI.ports.client;

import com.cleanLandAPI.data.Hero;

import java.util.List;
import java.util.Optional;

public interface HeroApiCreator {
    Optional<Hero> findHeroById(String id);
    List<Hero> createBasicHeroes();
    Hero save(Hero hero);

    List<Hero> saveBasicHeroes(List<Hero> basicHeroes);

}
