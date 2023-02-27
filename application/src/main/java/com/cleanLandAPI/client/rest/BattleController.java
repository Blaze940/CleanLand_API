package com.cleanLandAPI.client.rest;


import com.cleanLandAPI.client.rest.dto.FightDto;
import com.cleanLandAPI.client.rest.dto.FightRequest;
import com.cleanLandAPI.client.rest.mapper.FightDtoMapper;
import com.cleanLandAPI.ports.client.FightApiInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

import static com.cleanLandAPI.client.rest.mapper.FightDtoMapper.toEntity;

@RequestMapping(path = "/battle")
@RequiredArgsConstructor
@RestController
public class BattleController {


    private final FightApiInterface fightApiInterface;

    @PostMapping("/createBattle")
    public ResponseEntity<Object> createBattle(@RequestBody FightRequest fight) {
        FightDto fightDto = FightDtoMapper.toDto(fightApiInterface.createBattle(toEntity(fight)));
        return ResponseEntity.ok().body(fightDto);
    }

    @GetMapping("/startBattle/{id}")
    public void startBattle(@PathVariable UUID id) {
        fightApiInterface.startBattle(id);
    }

    @PostMapping("/attack")
    public void attack(@PathVariable UUID id, @PathVariable UUID heroId) {
        fightApiInterface.attack(id, heroId);
    }

    @GetMapping("/findBattleById/{id}")
    public ResponseEntity<FightDto> findBattleById(@PathVariable UUID id) {
        FightDto fight = FightDtoMapper.toDto(fightApiInterface.findById(id).get());
        return ResponseEntity.ok().body(fight);
    }

    @GetMapping("/findAllBattles")
    public ResponseEntity<List<FightDto>> findAllBattles() {
        List<FightDto> fights = FightDtoMapper.toDtoList(fightApiInterface.findAllBattles());
        return ResponseEntity.ok().body(fights);
    }

    //find all battles of a hero

}
