package com.cleanLandAPI.data;

import com.cleanLandAPI.data.enums.Rarity;
import com.cleanLandAPI.data.enums.Specialities;
import com.cleanLandAPI.service.SpecialityInterface;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public final class Speciality implements SpecialityInterface {


    private int armor;
    private int powerAdd;
    private int pvInit;
    private Specialities classSpeciality;


    public Speciality(int armor, int powerAdd, int pvInit, Specialities classSpeciality) {
        this.armor = armor;
        this.powerAdd = powerAdd;
        this.pvInit = pvInit;
        this.classSpeciality = classSpeciality;
    }

    @Override
    public boolean isRare(Rarity rarity){
        return switch (rarity) {
            case RARE, LEGENDARY -> true;
            default -> false;
        };
    }


}
