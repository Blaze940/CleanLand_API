package com.cleanLandAPI.ports.server;

import com.cleanLandAPI.data.Hero;

import java.util.List;
import java.util.Optional;

public interface HeroSpi {

    Optional<Hero> findHeroById(int id);

    List<Hero> findAllHeroes();


}
