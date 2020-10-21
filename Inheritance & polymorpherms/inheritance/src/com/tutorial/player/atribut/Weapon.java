package com.tutorial.player.atribut;

public class Weapon {
    
    private  double damage;
    
    // name weapon 
    private  String nameWeapon;

    // no default
    public Weapon(String nameWeapon,double damage){
        this.damage = damage;
        this.nameWeapon = nameWeapon;
        
    }
    // weapon default
    public Weapon(){
        this.damage = 15;
        this.nameWeapon = "Cangkul";
    }

    public String getNameWeapon(){
        return this.nameWeapon;
    }

    public double getDamage(){
        return this.damage;
    }
}