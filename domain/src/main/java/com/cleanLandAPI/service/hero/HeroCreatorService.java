package com.cleanLandAPI.service.hero;

import com.cleanLandAPI.data.Hero;
import com.cleanLandAPI.ports.client.HeroApiCreator;
import com.cleanLandAPI.ports.server.HeroPersistenceSpi;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;
@AllArgsConstructor
public class HeroCreatorService implements HeroApiCreator {

        private final HeroPersistenceSpi heroPersistenceSpi;
        @Override
        public Optional<Hero> findHeroById(String id) {
                return Optional.empty();
        }

        @Override
        public List<Hero> createBasicHeroes() {
                return saveBasicHeroes(HeroStatBuilderService.createInitialHeroes());
        }

        @Override
        public List<Hero> saveBasicHeroes(List<Hero> basicHeroes) {
                for (Hero hero : basicHeroes) {
                        heroPersistenceSpi.save(hero);
                }
                return basicHeroes;
        }
        @Override
        public Hero save(Hero hero) {
                return heroPersistenceSpi.save(hero);
        }
        @Override
        public Hero createOne(Hero hero) {
                Hero heroToReturn = HeroStatBuilderService.createHero(hero.getName(),  hero.getSpeciality(), hero.getRarity());
                return heroPersistenceSpi.save(heroToReturn);
        }

}
