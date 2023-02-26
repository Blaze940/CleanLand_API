package com.cleanLandAPI.postgres.adapter;

import com.cleanLandAPI.data.Fight;
import com.cleanLandAPI.ports.server.FightSpiInterface;
import com.cleanLandAPI.postgres.mapper.FightMapper;
import com.cleanLandAPI.postgres.repository.FightRepository;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class FightDatabase implements FightSpiInterface {

    private final FightRepository fightRepository;


    @Override
    public Fight createBattle(Fight fight) {
        val fightEntity = FightMapper.fromDomain(fight);
        fightRepository.save(fightEntity);
        return FightMapper.toDomain(fightEntity);
    }

    @Override
    public void startBattle(UUID id) {

    }

    @Override
    public void attack(UUID id, UUID heroId) {

    }

    @Override
    public List<Fight> findAllBattles() {
        return null;
    }

    @Override
    public Optional<Fight> findById(UUID id) {
        return Optional.empty();
    }
}
