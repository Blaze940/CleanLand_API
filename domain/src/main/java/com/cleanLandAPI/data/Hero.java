package com.cleanLandAPI.data;


import com.cleanLandAPI.data.enums.Rarity;
import com.cleanLandAPI.data.enums.Specialities;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.With;

import java.util.UUID;

@Builder
@Getter
@Setter
@With
final public class Hero {

    private UUID id;
    private String name;
    @Builder.Default
    private Long lifePoints ;

    @Builder.Default
    private Long experiencePoints = 0L ;
    private int power;
    private int armor ;
    @Builder.Default
    private int level = 1;
    private int powerBoost;
    private Specialities speciality;
    private Rarity rarity;

    public void updateLifePoints(Long lifePoints) {
        this.lifePoints = lifePoints;
    }


}
