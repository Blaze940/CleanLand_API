package com.cleanLandAPI.data;

import com.cleanLandAPI.data.enums.Specialities;

public class Mage extends Speciality{

    public Mage() {
        super(700, 10, 150, 25, Specialities.MAGE);
    }

    @Override
    public void rarity(Hero hero) {

    }
}
