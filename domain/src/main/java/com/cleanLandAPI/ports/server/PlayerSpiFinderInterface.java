package com.cleanLandAPI.ports.server;

import com.cleanLandAPI.data.Player;

import java.util.Optional;
import java.util.UUID;

public interface PlayerSpiFinderInterface {

    Optional<Player> findPlayerById(UUID playerId);

}
