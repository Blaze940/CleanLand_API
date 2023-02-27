package com.cleanLandAPI.configuration.controllers;

import com.cleanLandAPI.ports.client.FightApiInterface;
import com.cleanLandAPI.ports.client.HeroApiCreator;
import com.cleanLandAPI.ports.client.HeroApiFinderClient;
import com.cleanLandAPI.ports.server.FightPersistenceSpi;
import com.cleanLandAPI.ports.server.HeroPersistenceSpi;
import com.cleanLandAPI.service.fight.FightService;
import com.cleanLandAPI.service.hero.HeroCreatorService;
import com.cleanLandAPI.service.hero.HeroFinderService;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EntityScan("com.cleanLandAPI.postgres.entity")
public class ControllerConfiguration {

    @Bean
    public HeroApiFinderClient heroFinderService(HeroPersistenceSpi heroSpiFinderServer){
        return new HeroFinderService(heroSpiFinderServer);
    }

    @Bean
    public HeroApiCreator heroCreatorService(HeroPersistenceSpi heroSpiCreatorHero){
        return new HeroCreatorService(heroSpiCreatorHero) ;
    }

    @Bean
    public FightApiInterface fightService(FightPersistenceSpi fightPersistenceSpi){
        return new FightService(fightPersistenceSpi);
    }

}
