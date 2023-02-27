package com.cleanLandAPI.ports.server;

import com.cleanLandAPI.data.Fight;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface FightPersistenceSpi extends PersistenceSpi<Fight,UUID> {

//    @Override
//    Optional<Fight> findById(UUID uuid);

    List<Fight> findAllBattles();



}
