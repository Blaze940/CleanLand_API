package com.cleanLandAPI.data;

import com.cleanLandAPI.data.enums.Specialities;

public class Assasin extends Speciality{

    public Assasin() {
        super(800, 20, 200, 20, Specialities.ASSASSIN);
    }

    @Override
    public void rarity(Hero hero) {

    }
}
