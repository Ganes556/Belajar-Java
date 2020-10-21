package com.tutorial.player;
import com.tutorial.player.atribut.Armor;
import com.tutorial.player.atribut.Weapon;

public class PlayerAssasins extends Player{
    
    public PlayerAssasins (String name){
        // mengambil constructor dari superclass
        super(name);
        // perubahannya
        super.health = 100;
        super.attack = 250;        
    }

    // overloading player with default player
    public PlayerAssasins(){
        // mengambil constructor default/kosong dari superclass
        super(); 
    }

    // override fungsi setArmor 
    @Override 
    public void setArmor(Armor armor){
        super.nameArmor = armor.getArmorName();
        super.defance = armor.getDefance();
        // perubahan dalam hitungan penambahan darah
        super.maxHealth = super.health + (100*super.defance/10);
        super.health = super.maxHealth;
    }

    // override fungsi setWeapon
    @Override
    public void setWeapon(Weapon weapon){
        super.nameWeapon = weapon.getNameWeapon();
        super.attack += 10 * (weapon.getDamage()/10);
        
        
    }

    
    

    // overide fungsi show 
    // ingat jika menggunakan "this." didalam fungsi lokal 
    // ia akan mencari ke super fungsinya lain jika menggunakan "super." 
    // ia akan selalu mencari di class super
    @Override
    public void show(){
        System.out.printf("\nName Default   : %s\n",super.name);
        System.out.println("Type           : Assasins");
        System.out.printf("Health Player  : %.1f/%.1f\n",super.health,super.maxHealth);        
        System.out.printf("Armor          : %d Dps\n",super.defance);
        System.out.printf("Attack         : %.1f Atk\n",super.attack);
        System.out.println("Status         : " + super.status);

    }

    
    
} 
