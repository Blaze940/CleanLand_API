package com.cleanLandAPI.configuration.controllers;

import com.cleanLandAPI.ports.client.FightApiInterface;
import com.cleanLandAPI.ports.client.HeroApiCreatorInterface;
import com.cleanLandAPI.ports.client.HeroApiFinderClient;
import com.cleanLandAPI.ports.server.FightSpiInterface;
import com.cleanLandAPI.ports.server.HeroSpiCreatorHero;
import com.cleanLandAPI.ports.server.HeroSpiFinderServer;
import com.cleanLandAPI.service.fight.FightService;
import com.cleanLandAPI.service.hero.HeroFinderService;
import com.cleanLandAPI.service.hero.HeroService;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EntityScan("com.cleanLandAPI.postgres.entity")
public class ControllerConfiguration {

    @Bean
    public HeroApiCreatorInterface heroSpiInterface(HeroSpiCreatorHero heroSpiCreatorHero){
        return new HeroService(heroSpiCreatorHero);
    }


    @Bean
    public HeroApiFinderClient heroSpiFinder(HeroSpiFinderServer heroSpi){
        return new HeroFinderService(heroSpi);
    }


    @Bean
    public FightApiInterface fightApiInterface(FightSpiInterface fightSpiInterface){
        return new FightService(fightSpiInterface);
    }

}
