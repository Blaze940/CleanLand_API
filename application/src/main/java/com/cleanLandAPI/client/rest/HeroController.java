package com.cleanLandAPI.client.rest;

import com.cleanLandAPI.client.rest.dto.HeroDto;
import com.cleanLandAPI.client.rest.dto.HeroRequest;
import com.cleanLandAPI.client.rest.mapper.HeroDtoMapper;
import com.cleanLandAPI.data.Hero;
import com.cleanLandAPI.service.HeroFinderService;
import com.cleanLandAPI.service.HeroService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.cleanLandAPI.client.rest.mapper.HeroDtoMapper.toEntity;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/hero")
public class HeroController {

    private final HeroService heroService;
    private final HeroFinderService heroFinderService;


    @PostMapping("/createHero")
    public ResponseEntity<Object> createHero(@RequestBody HeroRequest hero) {
        HeroDto heroDto = HeroDtoMapper.toDto(heroService.save(toEntity(hero)));
        return ResponseEntity.ok().body(heroDto);
    }

    @GetMapping("/findAllHeroes")
    public ResponseEntity<List<HeroDto>> findAllHeroes() {
        List<HeroDto> heroes = HeroDtoMapper.toDtoList(heroFinderService.findAllHeroes());
        return ResponseEntity.ok().body(heroes);
    }

    @GetMapping("/findHeroById/{id}")
    public ResponseEntity<HeroDto> findHeroById(@PathVariable int id) {
        HeroDto hero = HeroDtoMapper.toDto(heroFinderService.findHeroById(id));
        return ResponseEntity.ok().body(hero);
    }


}
