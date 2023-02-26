package com.cleanLandAPI.client.rest;

import com.cleanLandAPI.ports.client.FightApiInterface;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class BattleControllerTest {


    @InjectMocks
    private BattleController battleController;

    @Mock
    private FightApiInterface fightApiInterface;

    @Test
    void createBattle() {
    }

    @Test
    void startBattle() {
    }

    @Test
    void attack() {
    }

    @Test
    void findBattleById() {
    }

    @Test
    void findAllBattles() {
    }
}
