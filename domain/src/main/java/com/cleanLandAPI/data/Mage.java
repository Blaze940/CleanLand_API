package com.cleanLandAPI.data;

public class Mage extends Speciality{

    private int lifePoints;
    private int armor;
    private int power;
    private int powerMages;

    public Mage(int lifePoints, int armor, int power, int powerMages) {
        this.lifePoints = lifePoints;
        this.armor = armor;
        this.power = power;
        this.powerMages = powerMages;
    }

    @Override
    public void rarity(Hero hero) {

    }
}
