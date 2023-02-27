package com.cleanLandAPI.client.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/player")
public class PlayerController {

    @PostMapping("/createPlayer")
    public void createPlayer() {
    }


    @GetMapping("/getPlayer")
    public void getPlayer() {
    }

    @PostMapping("/updatePlayer")
    public void updatePlayer() {
    }

    @GetMapping("/searchPlayer")
    public void searchPlayer() {
    }



}
