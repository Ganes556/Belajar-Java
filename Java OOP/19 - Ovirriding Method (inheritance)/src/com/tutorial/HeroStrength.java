package com.tutorial;

public class HeroStrength extends Hero{
    double defencePower;
    @Override
    void display(){
        System.out.println("\nHero strength");
        System.out.println("Name: " + super.name);
        System.out.println("Defence power: " + this.defencePower);

    }
}
