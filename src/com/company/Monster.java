package com.company;

public class Monster {
    private int health;
    private int defense;
    private int attackPower;

    public Monster(int health, int defense, int attackPower){
        this.health = health;
        this.defense = defense;
        this.attackPower = attackPower;
    }


    public String handle(String command) {
        if(command == "a") {
            Player.setHealth(getHealth() - getAttackPower());
            return "ouch";
        } else {
            return "I know what you want.";
        }
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
