package com.cleanLandAPI.client.rest;

import com.cleanLandAPI.client.rest.dto.HeroDto;
import com.cleanLandAPI.client.rest.dto.HeroRequest;
import com.cleanLandAPI.client.rest.mapper.HeroDtoMapper;
import com.cleanLandAPI.ports.client.HeroApiCreator;
import com.cleanLandAPI.ports.client.HeroApiFinderClient;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.cleanLandAPI.client.rest.mapper.HeroDtoMapper.toEntity;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/hero")
public class HeroController {


    private final HeroApiFinderClient heroFinderService;
    private final HeroApiCreator heroCreatorService;


    @PostMapping("/createHero")
    public ResponseEntity<Object> createHero(@RequestBody HeroRequest hero) {
        HeroDto heroDto = HeroDtoMapper.toDto(heroCreatorService.save(toEntity(hero)));
        return ResponseEntity.ok().body(heroDto);
    }

    @GetMapping("/createBasicHeroes")
    public ResponseEntity<List<HeroDto>> createBasicHeroes() {
        List<HeroDto> heroes = HeroDtoMapper.toDtoList(heroCreatorService.createBasicHeroes());
        return ResponseEntity.ok().body(heroes);
    }

    @GetMapping("/findAllHeroes")
    public ResponseEntity<List<HeroDto>> findAllHeroes() {
        List<HeroDto> heroes = HeroDtoMapper.toDtoList(heroFinderService.findAllHeroes());
        return ResponseEntity.ok().body(heroes);
    }

    /*@GetMapping("/findHeroById/{id}")
    public ResponseEntity<HeroDto> findHeroById(@PathVariable int id) {
        HeroDto hero = HeroDtoMapper.toDto(heroFinderService.findHeroById(id));
        return ResponseEntity.ok().body(hero);
    }*/

//    @GetMapping("/findHeroByName/{name}")
//    public ResponseEntity<HeroDto> findHeroByName(@PathVariable String name) {
//        HeroDto hero = HeroDtoMapper.toDto(heroFinderService.findHeroByName(name));
//        return ResponseEntity.ok().body(hero);
//    }

//    @GetMapping("/findAllBattles/{hero_id}")
//    public ResponseEntity<List<HeroDto>> findAllBattles(@PathVariable int hero_id) {
//          List<HeroDto> heroes = HeroDtoMapper.toDtoList(heroFinderService.findAllBattles(hero_id));
//          return ResponseEntity.ok().body(heroes);
//    }


}
