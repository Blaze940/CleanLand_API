package com.cleanLandAPI.client.rest;

import com.cleanLandAPI.ports.client.HeroApiCreatorInterface;
import com.cleanLandAPI.ports.client.HeroApiFinderClient;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

public class HeroControllerTest {

    @InjectMocks
    private HeroController heroController;

    @Mock
    private HeroApiFinderClient heroFinderService;

    @Mock
    private HeroApiCreatorInterface heroService;

    @Test
    void createHero() {
    }

    @Test
    void findAllHeroes() {
    }
}
