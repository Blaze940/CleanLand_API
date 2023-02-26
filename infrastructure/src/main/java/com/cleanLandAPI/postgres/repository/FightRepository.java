package com.cleanLandAPI.postgres.repository;

import com.cleanLandAPI.postgres.entity.FightEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FightRepository extends JpaRepository<FightEntity, Long> {
}
