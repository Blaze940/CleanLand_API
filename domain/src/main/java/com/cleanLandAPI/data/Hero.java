package com.cleanLandAPI.data;


import lombok.Builder;

@Builder
public class Hero {

    private String name;
    private Long lifePoints;
    private Long experiencePoints;
    private int powers;
    private int level;

    public Hero(String name, Long lifePoints, Long experiencePoints, int powers, int level) {
        this.name = name;
        this.lifePoints = lifePoints;
        this.experiencePoints = experiencePoints;
        this.powers = powers;
        this.level = level;
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

    public void updateLifePoints(Long lifePoints) {
        this.lifePoints = lifePoints;
    }

}
