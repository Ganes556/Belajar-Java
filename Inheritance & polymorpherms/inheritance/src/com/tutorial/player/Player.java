package com.tutorial.player;
import com.tutorial.player.atribut.Armor;
import com.tutorial.player.atribut.Weapon;


// class blueprint
public class Player {
    // static variable
    protected static int tambahPlayer;

    // deklarasi string
    
    protected String name;
    protected String nameArmor;
    protected String nameWeapon;
    // buat status hidup mati
    protected String status = "Alive";

    // deklarasi double
    protected double health;
    protected double maxHealth;
    protected double attack;
        
    

    // deklarasi int
    protected int defance;

    
    

    // deklarasi player default
    public Player(String name){
        Player.tambahPlayer++;
        this.name = name;
    }
    // overloading constructor jika kosong
    public Player(){
        Player.tambahPlayer++;
        this.name = "Player " + Player.tambahPlayer;
        this.health = 200;
        this.attack = 10;
    }

    // set armor default
    public void setArmor(Armor armor){
        this.nameArmor = armor.getArmorName();
        this.defance = armor.getDefance();
        this.maxHealth = this.health + (100*this.defance/5);
        this.health = this.maxHealth;
    }
    
    // set weapon
    public void setWeapon(Weapon weapon){
        this.nameWeapon = weapon.getNameWeapon();
        // logic perhitungan penambahan attack
        this.attack += 10 * (weapon.getDamage()/15);
    }

    // player attack
    public void attack(Player opponent){ 
        // capture damage yg masuk
        double damage = damagePure(opponent.defance);

        // check jika damage penyerang >= musuh
        if (damage >= opponent.health){
            opponent.health = 0;
            opponent.status = "Die";
            System.out.println("\n===============" + this.name + " Wins !" + "===============");           
            opponent.show();
            show();
        }else{
            // decrease health opponent/ musuh
            opponent.health -= damage;
             // output status 
            System.out.println("\n" + this.name + " Attacking " + opponent.name);
            System.out.printf("%s Gets Damage %.1f , Sisa Health : %.1f\n\n",opponent.name, damage,opponent.health);
            
        }
    }

    // get pure damage
    protected double damagePure(double defance){
        return this.attack - defance;
    }
    
    // displayed
    public void show(){
        System.out.printf("\nName Default   : %s\n",this.name);
        System.out.println("Type           : Default");
        System.out.printf("Health Player  : %.1f/%.1f\n",this.health,this.maxHealth);        
        System.out.printf("Armor          : %d Dps\n",this.defance);
        System.out.printf("Attack         : %.1f Atk\n",this.attack);
        System.out.println("Status         : " + this.status);

    }

}
