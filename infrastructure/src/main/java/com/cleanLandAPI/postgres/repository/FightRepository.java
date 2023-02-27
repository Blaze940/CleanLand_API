package com.cleanLandAPI.postgres.repository;

import com.cleanLandAPI.postgres.entity.FightEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface FightRepository extends JpaRepository<FightEntity, Long> {
    Optional<FightEntity> findById(UUID id);
}
