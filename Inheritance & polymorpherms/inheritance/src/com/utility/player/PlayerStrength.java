package com.utility.player;





public class PlayerStrength extends Player{ // cannot extends if the super class has a parameter in contructor
    
    public PlayerStrength (String name,String nameArmor){
        
        super.name = name;
        super.health = 300;
        super.attack = 8;
        // check default armor 
        checkDeafultArmor(nameArmor);
    }
    private void checkDeafultArmor(String nameArmor){
        if(nameArmor != null){
            super.nameArmor= nameArmor;
        }else{
            super.nameArmor = "Default Armor";
        }
    }
    
    // @Override
    // protected void setArmor(Armor1 test){

    // }
    
   
}
