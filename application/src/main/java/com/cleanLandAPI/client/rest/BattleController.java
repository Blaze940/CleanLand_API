package com.cleanLandAPI.client.rest;


import com.cleanLandAPI.client.rest.dto.FightDto;
import com.cleanLandAPI.client.rest.dto.FightRequest;
import com.cleanLandAPI.client.rest.mapper.FightDtoMapper;
import com.cleanLandAPI.ports.client.FightApiInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

import static com.cleanLandAPI.client.rest.mapper.FightDtoMapper.entityToDomain;

@RequestMapping(path = "/battle")
@RequiredArgsConstructor
@RestController
public class BattleController {


    private final FightApiInterface fightApiInterface;

    @PostMapping("/createBattle")
    public ResponseEntity<FightDto> battle(@RequestBody FightRequest fight) {
        FightDto fightDto = FightDtoMapper.toDto(fightApiInterface.battle(entityToDomain(fight)));
        return ResponseEntity.ok().body(fightDto);
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

}
