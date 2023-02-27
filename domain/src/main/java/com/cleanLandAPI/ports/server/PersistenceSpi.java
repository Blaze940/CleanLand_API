package com.cleanLandAPI.ports.server;

import java.util.Optional;

public interface PersistenceSpi <T,UUID>{
    T save(T o);

    Optional<T> findById(UUID id);

}
