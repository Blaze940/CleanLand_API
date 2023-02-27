package com.cleanLandAPI.postgres.repository;

import com.cleanLandAPI.postgres.entity.HeroEntity;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface HeroRepository extends JpaRepository<HeroEntity, UUID> {
}
