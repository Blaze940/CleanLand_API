package com.cleanLandAPI.ports.client;

import com.cleanLandAPI.data.Fight;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface FightApiInterface {

    Fight battle(Fight fight);

    void attack(UUID id, UUID heroId);

    List<Fight> findAllBattles();

    Optional<Fight> findById(UUID id);

}
