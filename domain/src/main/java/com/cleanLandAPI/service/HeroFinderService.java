package com.cleanLandAPI.service;

import com.cleanLandAPI.data.Hero;
import com.cleanLandAPI.exception.HeroException;
import com.cleanLandAPI.ports.client.HeroSpiInterface;
import com.cleanLandAPI.ports.server.HeroSpi;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class HeroFinderService implements HeroSpiInterface{

    private final HeroSpi heroSpi;

    public List<Hero> findAllHeroes(){
        return heroSpi.findAllHeroes();
    }

    public Hero findHeroById(int id){
        return heroSpi.findHeroById(id).orElseThrow(() -> {
            throw new HeroException("Hero not found");
        });
    }

}
