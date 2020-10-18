package com.tutorial;
// subclass
class HeroStrength extends Hero{
    // contructor
    HeroStrength(String name,double defancePower){
        super(name,defancePower);
    }
    // overloading from contructor subclass 
    HeroStrength(String name){
        super(name);
    }
}
public class Main{
    public static void main(String[] args) {
        Hero hero1 = new Hero("x-bork",11); // memakai contructor superclass
        hero1.display();

        HeroStrength hero2 = new HeroStrength("ees",10);
        hero2.display();

        HeroStrength hero3 = new HeroStrength("ucup");
        hero3.display();
    }
}