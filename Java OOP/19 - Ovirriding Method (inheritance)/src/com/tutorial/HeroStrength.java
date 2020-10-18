package com.tutorial;

public class HeroStrength extends Hero{
    double defencePower;
    
    // boleh isi @Override agar lebih mudah mengenali 
    // mana yang merupakan Overriding atau tidak 
    @Override // --> hanya komentar / anotasi
    void display(){
        System.out.println("\nHero strength");
        System.out.println("Name: " + super.name);
        System.out.println("Defence power: " + this.defencePower);

    }
}
