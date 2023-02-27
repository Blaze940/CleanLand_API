package com.cleanLandAPI.service.hero;

import com.cleanLandAPI.data.Hero;
import com.cleanLandAPI.ports.client.HeroApiFinderClient;
import com.cleanLandAPI.ports.server.HeroPersistenceSpi;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RequiredArgsConstructor
@Slf4j
public class HeroFinderService implements HeroApiFinderClient {

    private final HeroPersistenceSpi heroSpi;

    public List<Hero> findAllHeroes(){
        return heroSpi.findAllHeroes();
    }

    public Optional<Hero> findHeroById(UUID id){
        return heroSpi.findHeroById(id);
    }

}
