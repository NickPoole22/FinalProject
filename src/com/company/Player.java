package com.company;
import java.util.Random;
import java.util.Scanner;

public class Player {
    private int health;
    private int defense;
    private int attackPower;
    private int healthPotions;
    private int monstersKilled;

    public Player(int health, int defense, int attackPower){
        this.attackPower = attackPower;
        this.defense = defense;
        this.health = health;
    }

    public String showStats(){
        return ("You have " + getHealth() + " Health left, " + getDefense() + " Defense, and " + getAttackPower() + " Attack power, and you have " + getHealthPotions() + " Health Potions left.");
    }
    public String usePotion(){
        if(getHealthPotions() > 0){
            setHealth(getHealth() + 50);
            setHealthPotions(getHealthPotions() - 1);
            return ("You restored 50 health!");
        }return ("You have no health potions left");
    }
    public String victory(){
        setHealth(getHealth() + 5);
        setDefense(getDefense() + 2);
        setMonstersKilled(+1);
        return "Your stats increased!";


    }
    public String Reward(){
        Random reward = new Random();
        int upperbound = 5;
        int rewardpick = reward.nextInt(upperbound);
        if(rewardpick == 1){
            setHealthPotions( +1);
            return "You found a health potion!";
        }
        return "You found nothing";

    }



    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getHealthPotions() {
        return healthPotions;
    }

    public void setHealthPotions(int healthPotions) {
        this.healthPotions = healthPotions;
    }

    public int getMonstersKilled() {
        return monstersKilled;
    }

    public void setMonstersKilled(int monstersKilled) {
        this.monstersKilled = monstersKilled;
    }
}
