package com.kata.tamagotchi;

public class Tamagotchi {

    public static final String Mood = null;
    int mood = 4;
    int hunger = 8;
    int energy = 4;

    public Tamagotchi() {
    }

    public Tamagotchi(int mood, int hunger, int energy) {
        this.mood = mood;
        this.hunger = hunger;
        this.energy = energy;
    }

    public int getMood() {
        return mood;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void eat() {
        if (this.getHunger() >= 0) {
            this.setHunger(this.getHunger() - 2);
        }
        if (this.getEnergy() <= 10) {
            this.setEnergy(this.getEnergy() + 1);
        }
    }

    public void sleep() {
        if (this.getEnergy() <= 10) {
            this.setEnergy(this.getEnergy() + 2);
        }
    }

    public void play() {
        if (this.getHunger() <= 10 && this.getEnergy() <= 10 && this.getMood() <= 10) {
            this.setHunger(this.getHunger() + 1);
            this.setEnergy(this.getEnergy() - 1);
            this.setMood(this.getMood() + 1);
        };
    }

    public String myEnergyIs() {
        if (energy == 0)
            return "(-_-) zZZ";
        if (energy < 3)
            return "(-_-)";
        if (energy >= 3)
            return "(:-|)";
        return "normal";
    }

    public String myMoodIs() {
        if (energy < 2)
            return "(ఠ_ఠ)";
        if (energy > 8)
            return ":-)";
        if (energy <= 8 && energy >= 2)
            return "(:-|)";
        return null;
    }

    public String state() {
        String state = "";
        state = myEnergyIs();
        return state;
    }

    public void setHappy(int i) {
    }

    public Object getEating() {
        return null;
    }

}