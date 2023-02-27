package com.cleanLandAPI.data;

import com.cleanLandAPI.data.enums.Rarity;
import com.cleanLandAPI.data.enums.Specialities;
import com.cleanLandAPI.service.hero.SpecialityInterface;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Builder
@Getter
@Setter
@AllArgsConstructor
public final class Speciality implements SpecialityInterface {

    private UUID id;
    private int armor;
    private int powerAdd;
    private int pvInit;
    private Specialities classSpeciality;



    @Override
    public boolean isRare(Rarity rarity){
        return switch (rarity) {
            case RARE, LEGENDARY -> true;
            default -> false;
        };
    }


}
