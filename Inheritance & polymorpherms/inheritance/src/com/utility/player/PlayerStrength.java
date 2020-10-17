package com.utility.player;
import com.utility.atribut.Armor;

public class PlayerStrength extends Player{ // cannot extends if the super class has a parameter in contructor
    
    public PlayerStrength (String name){
        Player.tambahPlayer++;
        super.name = name;
        super.health = 300;
        super.attack = 8;
        
        // check default armor 
        super.nameArmor = nameArmor;
        
    }

    // overloading player with default player
    public PlayerStrength(){
        super.defaultPlayer();       
    }
    
    @Override
    public void setArmor(Armor armor){
        
    }
    
   
}
