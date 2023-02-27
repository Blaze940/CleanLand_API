package com.cleanLandAPI.postgres.adapter;

import com.cleanLandAPI.data.Fight;
import com.cleanLandAPI.ports.server.FightPersistenceSpi;
import com.cleanLandAPI.postgres.mapper.FightMapper;
import com.cleanLandAPI.postgres.repository.FightRepository;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class FightDatabase implements FightPersistenceSpi {

        private final FightRepository fightRepository;

        public Fight createBattle(Fight fight) {
            val fightEntity = FightMapper.fromDomain(fight);
            fightRepository.save(fightEntity);
            return FightMapper.toDomain(fightEntity);
        }


        public void startBattle(UUID id) {

        }

        public void attack(UUID id, UUID heroId) {

        }

    @Override
    public Optional<Fight> findById(UUID uuid) {
        return Optional.empty();
    }

    @Override
        public List<Fight> findAllBattles() {
            return FightMapper.toDomainList(fightRepository.findAll());
        }

        @Override
        public Fight save(Fight o) {
            return null;
        }
//        @Override
//        public Optional<Fight> findById(UUID id) {
//            return Optional.empty();
//        }

}
