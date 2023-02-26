package com.cleanLandAPI.service;


import com.cleanLandAPI.ports.server.HeroSpiFinderServer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class HeroFinderServiceTest {

    @InjectMocks
    private HeroFinderService service;

    @Mock
    private HeroSpiFinderServer spi;

    @Test
    public void should_find_hero() {
        // TODO
    }

    @Test
    public void should_not_find_hero() {
        // TODO
    }


}
