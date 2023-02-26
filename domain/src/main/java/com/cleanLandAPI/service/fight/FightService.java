package com.cleanLandAPI.service.fight;

import com.cleanLandAPI.data.Fight;
import com.cleanLandAPI.data.Hero;
import com.cleanLandAPI.ports.client.FightApiInterface;
import com.cleanLandAPI.ports.server.FightSpiInterface;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Slf4j
@RequiredArgsConstructor
public class FightService implements FightApiInterface {

    private final FightSpiInterface fightSpi;

    @Override
    public Fight createBattle(Fight fight) {
        return null;
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
