package com.cleanLandAPI.ports.client;

import com.cleanLandAPI.data.Hero;

import java.util.List;
import java.util.Optional;

public interface HeroApiFinderClient {

    List<Hero> findAllHeroes();

    Optional<Hero> findHeroById(int id);
}
