package com.cleanLandAPI.service;

import com.cleanLandAPI.data.Hero;
import com.cleanLandAPI.exception.HeroException;
import com.cleanLandAPI.ports.client.HeroApiFinderClient;
import com.cleanLandAPI.ports.server.HeroSpiFinderServer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Slf4j
public class HeroFinderService implements HeroApiFinderClient {

    private final HeroSpiFinderServer heroSpi;

    public List<Hero> findAllHeroes(){
        return heroSpi.findAllHeroes();
    }

    public Optional<Hero> findHeroById(int id){
        return heroSpi.findHeroById(id);
    }

}
