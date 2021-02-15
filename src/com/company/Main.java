package com.company;

public class Main {

    public static void main(String[] args) {
        Magic magic = new Magic();
        Medic med = new Medic();
        Warrior war = new Warrior();
        Hero[] hero ={magic,med,war,magic,war,med};
        for (int i = 0; i < hero.length; i++) {
            hero[i].applySuperAbility();
        }
    }
}