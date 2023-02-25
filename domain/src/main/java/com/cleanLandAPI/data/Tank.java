package com.cleanLandAPI.data;

import com.cleanLandAPI.data.enums.Specialities;

public class Tank extends Speciality{

    public Tank() {
        super(1000, 20, 100, 20, Specialities.TANK);
    }


    @Override
    public void rarity(Hero hero) {

    }
}
