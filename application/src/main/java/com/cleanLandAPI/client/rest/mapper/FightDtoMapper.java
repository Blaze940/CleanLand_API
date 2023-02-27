package com.cleanLandAPI.client.rest.mapper;

import com.cleanLandAPI.client.rest.dto.FightDto;
import com.cleanLandAPI.client.rest.dto.FightRequest;
import com.cleanLandAPI.data.Fight;

import java.util.List;
import java.util.stream.Collectors;

public interface FightDtoMapper {

    static FightDto toDto(Fight fight) {
        return new FightDto(
                fight.getFightId(),
                fight.getFightDate(),
                fight.getAttacker(),
                fight.getDefender(),
                fight.getWinner());
    }

    static Fight entityToDomain(FightRequest fightDto) {
        return Fight.builder()
                .fightDate(fightDto.fightDate())
                .attacker(fightDto.attacker())
                .defender(fightDto.defender())
                .build();
    }

    static List<FightDto> toDtoList(List<Fight> allBattles) {
        return allBattles.stream()
                .map(FightDtoMapper::toDto)
                .collect(Collectors.toList());
    }
}
