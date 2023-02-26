package com.cleanLandAPI.postgres.repository;

import com.cleanLandAPI.data.Hero;
import com.cleanLandAPI.exception.HeroException;
import com.cleanLandAPI.postgres.entity.HeroEntity;
import com.cleanLandAPI.postgres.mapper.HeroMapper;
import lombok.Builder;
import lombok.val;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import static org.springframework.transaction.annotation.Propagation.MANDATORY;

@Transactional(propagation = MANDATORY)
@Repository
public interface HeroRepository extends JpaRepository<HeroEntity, Integer> { }
