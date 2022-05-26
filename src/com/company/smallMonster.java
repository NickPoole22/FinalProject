package com.company;

public class smallMonster {
    private int health;
    private int defense;
    private int attackPower;

    public smallMonster(int health, int defense, int attackPower){
        this.health = health;
        this.defense = defense;
        this.attackPower = attackPower;
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
}
