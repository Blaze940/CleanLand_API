package com.cleanLandAPI.data;

import com.cleanLandAPI.data.enums.Rarity;
import com.cleanLandAPI.data.enums.Specialities;
import com.cleanLandAPI.service.SpecialityInterface;
import lombok.Builder;

@Builder
public final class Speciality implements SpecialityInterface {


    private int lifePoints;
    private int armor;
    private int power;
    private int powerMages;
    private Specialities classSpeciality;


    public Speciality(int lifePoints, int armor, int power, int powerMages, Specialities classSpeciality) {
        this.lifePoints = lifePoints;
        this.armor = armor;
        this.power = power;
        this.powerMages = powerMages;
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
