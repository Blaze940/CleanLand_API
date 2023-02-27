package com.cleanLandAPI.postgres.adapter;

import com.cleanLandAPI.data.Hero;
import com.cleanLandAPI.exception.HeroException;
import com.cleanLandAPI.ports.server.HeroPersistenceSpi;
import com.cleanLandAPI.postgres.mapper.HeroMapper;
import com.cleanLandAPI.postgres.repository.HeroRepository;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class HeroDatabase implements HeroPersistenceSpi{

    private final HeroRepository heroRepository;

    @Override
    public Optional<Hero> findHeroById(UUID id){
        return Optional.ofNullable(HeroMapper.toDomain(heroRepository.findById(id)
                .orElseThrow(
                        () -> new HeroException("Le héros avec l'id : " + id + " n'a pas été trouvé !"))
        ));
    }

    @Override
    public List<Hero> findAllHeroes() {
        return HeroMapper.toDomainList(heroRepository.findAll());
    }


    @Override
    public Hero save(Hero hero) {

        val heroEntity = HeroMapper.fromDomain(hero);
        heroRepository.save(heroEntity);
        return HeroMapper.toDomain(heroEntity);
    }

    @Override
    public Optional<Hero> findById(UUID id) {
        return Optional.empty();
    }

}
