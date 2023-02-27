package com.cleanLandAPI.postgres.adapter;

import com.cleanLandAPI.postgres.repository.FightRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class FightDatabaseTest {

    @InjectMocks
    private FightDatabase fightDatabase;

    @Mock
    private FightRepository fightRepository;


    @Test
    void should_save_Battle() {
    }

    @Test
    void should_start_battle() {
    }

    @Test
    void should_attack() {
    }

    @Test
    void should_find_All_Battles() {
    }

    @Test
    void should_find_battle_By_Id() {
    }
}
