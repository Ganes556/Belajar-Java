package com.tutorial;

public class Main {
    public static void main(String[] args) {
        // without overriding
        Hero hero1 = new Hero();
        hero1.name = "ini contoh";
        hero1.display();

        // with overriding
        HeroStrength hero2 = new HeroStrength();
        hero2.name = "Saitamakun";
        hero2.defencePower = 10;
        hero2.display();
    }
}
