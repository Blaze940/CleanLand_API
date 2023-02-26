package com.cleanLandAPI.postgres.mapper;

import com.cleanLandAPI.data.Fight;
import com.cleanLandAPI.data.Hero;
import com.cleanLandAPI.postgres.entity.FightEntity;
import com.cleanLandAPI.postgres.entity.HeroEntity;

import java.util.List;
import java.util.stream.Collectors;

public interface FightMapper {
    static Fight toDomain(FightEntity fight){
        return Fight.builder().
                fightId(fight.getFightId()).
                fightDate(fight.getFightDate()).
                attacker(fight.getAttacker()).
                defender(fight.getDefender()).
                winner(fight.getWinner()).build();
    }

    static FightEntity fromDomain(Fight fight){
        return FightEntity.builder()
                .attacker(fight.getAttacker())
                .defender(fight.getDefender()).
                fightDate(fight.getFightDate())
                .build();
    }


    static List<Fight> toDomainList(List<FightEntity> fightEntities){
        return fightEntities.stream()
                .map(FightMapper::toDomain)
                .collect(Collectors.toList());
    }


}
