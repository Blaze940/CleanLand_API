package com.cleanLandAPI.client.rest;

import com.cleanLandAPI.data.Hero;
import com.cleanLandAPI.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hero")
public class HeroController {

    private final HeroService heroService;

    @Autowired
    public HeroController(HeroService heroService) {
        this.heroService = heroService;
    }

    @PostMapping("/createHero")
    public void createHero(@RequestBody Hero hero) {
        heroService.createHero(hero);
    }


}
