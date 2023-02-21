package com.cleanLandAPI.client.rest;

import com.cleanLandAPI.client.rest.dto.HeroDto;
import com.cleanLandAPI.client.rest.mapper.HeroDtoMapper;
import com.cleanLandAPI.data.Hero;
import com.cleanLandAPI.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import static com.cleanLandAPI.client.rest.mapper.HeroDtoMapper.toEntity;

@RestController
@RequestMapping("/hero")
public class HeroController {

    private final HeroService heroService;

    @Autowired
    public HeroController(HeroService heroService) {
        this.heroService = heroService;
    }

    @PostMapping("/createHero")
    public ResponseEntity<Object> createHero(@RequestBody HeroDto hero) {
       return heroService.createHero(toEntity(hero)).map(HeroDtoMapper::toDto).fold(ResponseEntity.badRequest()::body, ResponseEntity::ok);
    }


}
