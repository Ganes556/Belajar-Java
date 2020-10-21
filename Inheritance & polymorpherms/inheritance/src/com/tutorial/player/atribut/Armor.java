package com.tutorial.player.atribut;


public class Armor {
    // armor harus int tidak ada armor bernilai koma
    private  int defance;
    
    // name armor 
    private  String armorName;

    // checking menggunakan armor
    public Armor(String nameArmor,int defance){
        this.defance = defance;
        this.armorName = nameArmor;
        
    }
    // checking tidak punya armor 
    // armor default
    public Armor(){
        this.defance = 0;
        this.armorName = "Kaos Wibu";
    }

    public String getArmorName(){
        return this.armorName;
    }

    public int getDefance(){
        return this.defance;
    }
    
    
}
