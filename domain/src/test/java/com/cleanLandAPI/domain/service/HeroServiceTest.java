package com.cleanLandAPI.domain.service;

import com.cleanLandAPI.ports.server.HeroSpi;
import com.cleanLandAPI.service.HeroService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class HeroServiceTest {

    @InjectMocks
    private HeroService service;

    @Mock
    private HeroSpi spi;


    @Test
    public void should_create_hero() {
        // TODO
    }

    @Test
    public void should_not_create_hero() {
        // TODO
    }


}
