package com.cleanLandAPI.data;

import com.cleanLandAPI.data.enums.Rarity;
import com.cleanLandAPI.data.enums.Specialities;
import com.cleanLandAPI.service.SpecialityInterface;
import lombok.Builder;
import lombok.Setter;

@Builder
@Setter
public final class Speciality implements SpecialityInterface {


    private int armor;
    private int powerAdd;
    private int pvInit;
    private Specialities classSpeciality;


    public Speciality(int armor, int powerAdd, Specialities classSpeciality) {
        this.armor = armor;
        this.powerAdd = powerAdd;
        this.classSpeciality = classSpeciality;
    }

    public int getArmor() {
        return armor;
    }

    @Override
    public boolean isRare(Rarity rarity){
        return switch (rarity) {
            case RARE, LEGENDARY -> true;
            default -> false;
        };
    }


}
