package com.cleanLandAPI.postgres.adapter;

import com.cleanLandAPI.postgres.repository.HeroRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class HeroDatabaseTest {


    @InjectMocks
    private HeroDatabase heroDatabase;

    @Mock
    private HeroRepository heroRepository;

    @Test
    void should_create_hero() {
    }


}
