package com.cleanLandAPI.ports.server;

import com.cleanLandAPI.data.Hero;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface HeroPersistenceSpi extends PersistenceSpi<Hero,UUID> {
    Optional<Hero> findHeroById(UUID id);

    List<Hero> findAllHeroes();

}
