package com.cleanLandAPI.service.hero;



import com.cleanLandAPI.data.Hero;
import com.cleanLandAPI.ports.server.HeroPersistenceSpi;
import com.cleanLandAPI.service.hero.HeroFinderService;
import lombok.val;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
class HeroFinderServiceTest {

    @InjectMocks
    private HeroFinderService heroFinderService;

    @Mock
    private HeroPersistenceSpi heroSpiFinderServer;

    @Test
    void should_find_player_with_id() {
        val given = UUID.randomUUID();
        val hero = Optional.of(Hero.builder().build());

        when(heroSpiFinderServer.findHeroById(given)).thenReturn(hero);

        final var actual = heroFinderService.findHeroById(given);

        assertThat(actual)
                .usingRecursiveComparison()
                .isEqualTo(hero);
        verify(heroSpiFinderServer).findHeroById(given);
        verifyNoMoreInteractions(heroSpiFinderServer);
    }

    @Test
    void should_not_find_player_with_id() {
        val given = UUID.randomUUID();

        when(heroSpiFinderServer.findHeroById(given)).thenReturn(Optional.empty());

        final var actual = heroFinderService.findHeroById(given);

        assertThat(actual).isEmpty();
        verify(heroSpiFinderServer).findHeroById(given);
        verifyNoMoreInteractions(heroSpiFinderServer);
    }
}