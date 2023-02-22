package com.cleanLandAPI.data;

import com.cleanLandAPI.service.SpecialityInterface;

abstract public class Speciality implements SpecialityInterface {

    public boolean isRare(Hero hero){
        return false;
    }


}
