package com.cleanLandAPI.ports.client;

import com.cleanLandAPI.data.Fight;
import com.cleanLandAPI.data.Hero;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface FightApiInterface {

    Fight createBattle(Fight fight);
    void startBattle(UUID id);
    void attack(UUID id, UUID heroId);
    List<Fight> findAllBattles();
    Optional<Fight> findById(UUID id);

}
