package com.cleanLandAPI.ports.client;

import com.cleanLandAPI.data.Hero;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface HeroApiFinderClient {

    List<Hero> findAllHeroes();

    Optional<Hero> findHeroById(UUID id);
}
