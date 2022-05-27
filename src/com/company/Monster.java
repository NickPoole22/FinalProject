package com.company;
import java.util.Random;
public class Monster {
    private String name;
    private int health;
    private int defense;
    private int attackPower;

    public Monster(String name, int health, int defense, int attackPower){
        this.name = name;
        this.health = health;
        this.defense = defense;
        this.attackPower = attackPower;
    }
    public String monsterStats(){
        return ("The " + getName() + " has " + getHealth() + " Health, " + getDefense() + " Defense, and " + getAttackPower() + " Attack power.");
    }

    public String handle(String command) {
        if(command.equals("a")) {
            setHealth(getHealth() - (getAttackPower() - getDefense()));
            return "You cut the " + getName() + "! The " + getName() + " has " + getHealth() + " health left.";
        }
        else if(command.equals("b")){
            return "You used your sword to parry the " + getName() + "'s attack!";
        }
        else if(command.equals("d")){
            return "You dodged the " + getName() + "'s attack!";
        }
        else if(command.equals("f")){
            return "";
        }
        else {
            return "Not an option.";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
