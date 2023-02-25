package com.cleanLandAPI.data;


import com.cleanLandAPI.data.enums.Rarity;
import lombok.Builder;

@Builder
final public class Hero {

    private String name;
    private Long lifePoints;
    private Long experiencePoints;
    private int powers;
    private int level;
    private Speciality speciality;
    private Rarity rarity;

    public String getName() {
        return name;
    }

    public Long getLifePoints() {
        return lifePoints;
    }

    public Long getExperiencePoints() {
        return experiencePoints;
    }

    public int getPowers() {
        return powers;
    }

    public int getLevel() {
        return level;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public void updateLifePoints(Long lifePoints) {
        this.lifePoints = lifePoints;
    }

}
