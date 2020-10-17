package com.tutorial;

// inheritance adalah hubungan is-a


public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.name = "HIU DEKAI";
        hero.display();

        HeroStrength hero2 = new HeroStrength();
        hero2.name = "JEJUN DEDE";
        hero2.display();

        HeroIntelligent hero3 = new HeroIntelligent();
        hero3.name = "SUPRA DEMAI";
        hero3.display();
    }
}
