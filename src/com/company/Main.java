package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealht(700);
        boss.setDamage(200);
        boss.setTypeOfProtect("Invisble");
        boss.PrintInfo ();
    }
    public static Hero[] createHeroes() {
        Hero tor = new Hero(400,120);
        Hero captainAmerica = new Hero(500,180);
        Hero ironMan = new Hero(800,250);
        return new Hero[]{tor, captainAmerica, ironMan};

    }


}
