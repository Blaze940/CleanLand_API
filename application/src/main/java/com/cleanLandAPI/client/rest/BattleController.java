package com.cleanLandAPI.client.rest;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/battle")
@RequiredArgsConstructor
@RestController
public class BattleController {

    @PostMapping("/createBattle")
    public void createBattle() {
        //TODO
    }

    @PostMapping("/attack")
    public void attack() {
        //TODO
    }

    @GetMapping("/findAllBattles")
    public void findAllBattles() {
        //TODO
    }

}
