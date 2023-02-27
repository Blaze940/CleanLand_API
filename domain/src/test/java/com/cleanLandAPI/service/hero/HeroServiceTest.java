package com.cleanLandAPI.service.hero;

import com.cleanLandAPI.ports.server.HeroPersistenceSpi;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class HeroServiceTest {

    @InjectMocks
    private HeroBattleService service;

    @Mock
    private HeroPersistenceSpi heroPersistenceSpi;


    @Test
    public void should_create_hero() {
        // TODO
    }

    @Test
    public void should_not_create_hero() {
        // TODO
    }


}
