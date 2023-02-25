package com.cleanLandAPI.domain.service;


import com.cleanLandAPI.ports.server.HeroSpi;
import com.cleanLandAPI.service.HeroFinderService;
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
    private HeroSpi spi;

    @Test
    public void test() {
        // TODO
    }


}
