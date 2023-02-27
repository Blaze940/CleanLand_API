package com.cleanLandAPI.data;


import com.cleanLandAPI.data.enums.Rarity;
import lombok.Builder;
import lombok.Setter;

@Builder
@Setter
final public class Hero {

    private int id;
    private String name;
    private Long lifePoints;
    private Long experiencePoints;
    private int powers;
    private int level;
    private Speciality speciality;
    private Rarity rarity;
    private int armor;

    public int getId() {
        return id;
    }

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

    public int getArmor() {
        return armor;
    }

    public void updateLifePoints(Long lifePoints) {
        this.lifePoints = lifePoints;
    }

}
