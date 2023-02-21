package com.cleanLandAPI.data;

public class Assasin extends Speciality{

    private int lifePoints;
    private int armor;
    private int power;
    private int powerMages;

    public Assasin(int lifePoints, int armor, int power, int powerMages) {
        this.lifePoints = lifePoints;
        this.armor = armor;
        this.power = power;
        this.powerMages = powerMages;
    }

    private void createAssasin(){
    }

    @Override
    public void rarity(Hero hero) {

    }
}
