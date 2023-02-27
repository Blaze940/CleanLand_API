package com.cleanLandAPI.client.rest;

import com.cleanLandAPI.client.rest.dto.HeroDto;
import com.cleanLandAPI.client.rest.dto.HeroRequest;
import com.cleanLandAPI.client.rest.mapper.HeroDtoMapper;
import com.cleanLandAPI.data.Hero;
import com.cleanLandAPI.ports.client.HeroApiCreatorInterface;
import com.cleanLandAPI.ports.client.HeroApiFinderClient;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static com.cleanLandAPI.client.rest.mapper.HeroDtoMapper.toEntity;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/hero")
public class HeroController {


    private final HeroApiFinderClient heroApiFinderClient;
    private final HeroApiCreatorInterface heroApiCreatorInterface;


    @PostMapping("/createHero")
    public ResponseEntity<Object> createHero(@RequestBody HeroRequest hero) {
        HeroDto heroDto = HeroDtoMapper.toDto(heroApiCreatorInterface.save(toEntity(hero)));
        return ResponseEntity.ok().body(heroDto);
    }

    @GetMapping("/findAllHeroes")
    public ResponseEntity<List<HeroDto>> findAllHeroes() {
        List<HeroDto> heroes = HeroDtoMapper.toDtoList(heroApiFinderClient.findAllHeroes());
        return ResponseEntity.ok().body(heroes);
    }

    @GetMapping("/findHeroById/{id}")
    public ResponseEntity<HeroDto> findHeroById(@PathVariable int heroId) {
        Optional<Hero> hero = heroApiFinderClient.findHeroById(heroId);
        return hero.map(HeroDtoMapper::toDto)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.badRequest().build());
    }

}
