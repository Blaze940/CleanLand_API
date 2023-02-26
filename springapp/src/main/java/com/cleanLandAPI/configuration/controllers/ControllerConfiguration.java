package com.cleanLandAPI.configuration.controllers;

import com.cleanLandAPI.ports.client.HeroSpiCreatorInterface;
import com.cleanLandAPI.ports.client.HeroSpiFinderClient;
import com.cleanLandAPI.ports.server.HeroSpiCreatorHero;
import com.cleanLandAPI.ports.server.HeroSpiFinderServer;
import com.cleanLandAPI.service.HeroFinderService;
import com.cleanLandAPI.service.HeroService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ControllerConfiguration {

    @Bean
    public HeroSpiCreatorInterface heroSpiInterface(HeroSpiCreatorHero heroSpiCreatorHero){
        return new HeroService(heroSpiCreatorHero);
    }


    @Bean
    public HeroSpiFinderClient heroSpiFinder(HeroSpiFinderServer heroSpi){
        return new HeroFinderService(heroSpi);
    }


}
