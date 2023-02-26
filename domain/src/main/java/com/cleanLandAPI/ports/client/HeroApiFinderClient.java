package com.cleanLandAPI.ports.client;

import com.cleanLandAPI.data.Hero;

import java.util.List;

public interface HeroApiFinderClient {

    List<Hero> findAllHeroes();

    Hero findHeroById(int id);
}
