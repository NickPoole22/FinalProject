package com.company;

public class largeMonster {
    private int health;
    private int defense;
    private int attackPower;

    public largeMonster(int health, int defense, int attackPower){
        this.health = health;
        this.defense = defense;
        this.attackPower = attackPower;
    }

    public int getPlayerHealth() {
        return health;
    }

    public void setPlayerHealth(int health) {
        this.health = health;
    }

    public int getPlayerDefense() {
        return defense;
    }

    public void setPlayerDefense(int defense) {
        this.defense = defense;
    }

    public int getPlayerAttackPower() {
        return attackPower;
    }

    public void setPlayerAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
}
