package com.company;

public class Boss {
    private int healht;
    private int damage;
    private String typeOfProtect;

    public int getHealht() {
        return healht;
    }

    public void setHealht(int healht) {
        this.healht = healht;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getTypeOfProtect() {
        return typeOfProtect;
    }

    public void setTypeOfProtect(String typeOfProtect) {
        this.typeOfProtect = typeOfProtect;
    }
    public void PrintInfo() {
        System.out.println(healht + " - health." + damage + "damage." + typeOfProtect + " - typeOfProtect.");
    }
}