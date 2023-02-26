package com.cleanLandAPI.service;

import com.cleanLandAPI.data.Hero;
import com.cleanLandAPI.exception.HeroException;
import com.cleanLandAPI.ports.client.HeroSpiCreatorInterface;
import com.cleanLandAPI.ports.client.HeroSpiFinderClient;
import com.cleanLandAPI.ports.server.HeroSpiCreatorHero;
import com.cleanLandAPI.ports.server.HeroSpiFinderServer;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class HeroFinderService implements HeroSpiFinderClient {

    private final HeroSpiFinderServer heroSpi;

    public List<Hero> findAllHeroes(){
        return heroSpi.findAllHeroes();
    }

    public Hero findHeroById(int id){
        return heroSpi.findHeroById(id).orElseThrow(() -> {
            throw new HeroException("Hero not found");
        });
    }

}
