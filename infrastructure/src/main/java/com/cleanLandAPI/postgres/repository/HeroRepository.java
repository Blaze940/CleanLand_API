package com.cleanLandAPI.postgres.repository;

import com.cleanLandAPI.postgres.entity.HeroEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeroRepository extends JpaRepository<HeroEntity, Integer> {}
