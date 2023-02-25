package com.cleanLandAPI.postgres.adapter;

import com.cleanLandAPI.data.Hero;
import com.cleanLandAPI.ports.server.HeroSpi;
import com.cleanLandAPI.postgres.mapper.HeroMapper;
import com.cleanLandAPI.postgres.repository.HeroRepository;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class HeroDatabase implements HeroSpi {

    private final HeroRepository heroRepository;

    public Optional<Hero> findHeroById(int id){
        return Optional.empty();
    }

    @Override
    public List<Hero> findAllHeroes() {
        return null;
    }

    @Override
    public Hero save(Hero hero) {
        val heroEntity = HeroMapper.fromDomain(hero);
        heroRepository.save(heroEntity);
        return HeroMapper.toDomain(heroEntity);
    }

}
