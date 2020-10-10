package com.tutorial;



class Player{
    // string variable
    private String name;
    // boolean variable
    private boolean isAlive;
    // int variable
    private int baseHealth;
    private int baseDamage;
    private int level;    
    private int incrementHealth;
    private int incrementDamage;
    private int totalDamage;
    // static variable for all in class / bisa terseting bareng-bareng 
    private static int turn;
    // object member
    private Armor armor;
    private Weapon weapon;
    
    Player(String name){
        this.name = name;
        this.baseHealth = 100;
        this.baseDamage = 50;
        this.turn = 1;
        this.level = 1;
        this.incrementHealth = 20;
        this.incrementDamage = 20;      
        this.isAlive = true;
    }
    private String getName(){
        return this.name;
    }
 
    private int getHealth(){
        return this.maxHealth() - this.totalDamage;        
    }
    // display method
    public void display(){
        
        System.out.printf("\nNama          : %s \n" ,this.name);        
        System.out.printf("Level         : %s \n" ,this.level);
        System.out.printf("Health        : %d/%d \n",this.getHealth(),this.maxHealth());
        System.out.printf("Attack Power  : %s \n",this.attackPower()); 
        // checking live or not using ternary 'if' operator
        String status = (this.isAlive == true ? "Alive" : "Died\n" + "****" + this.name + " Lose ****");
        System.out.printf("Player Status : %s \n",status);         
        
    }
    
    public void attack(Player opponent){
        System.out.println("Pertempuran dimulai Turn " + this.turn);
        this.display();
        opponent.display();
        // hitung damage
        int damage = this.attackPower(); 
        // display info about launch attack
        System.out.println(this.name + " is attacking " + opponent.getName() + " with damage " + damage);
        
        // musuh bertahan dengan darah dan armornya
        opponent.defence(damage);
        // player attacking will to level up 
        this.levelUp();
        // turn uping in 2 player 
        Player.nextTurn();
        
    }

    private void defence(int damage){   
    // recieve damage            
        // create variable total damage 
        int deltaDamage;
        int defancePower = armor.getDefencePower();
        System.out.println(this.name + " Defance Power = " + defancePower);
        if (damage > defancePower){
            deltaDamage = damage - defancePower;    
        }else{ 
            deltaDamage = 0;
        }
        // display information total damage yg dihasilkan
        System.out.println("damage earned = " + deltaDamage);

        // addding damage to be total damage
        this.totalDamage += deltaDamage;

    // checking player isAlive or not
        if (getHealth() <= 0){
            this.isAlive = false;           
            // make the health to be zero couse is player died
            this.totalDamage = this.maxHealth();
        }
        // display information about enemy after player attacking
        this.display();    
        System.out.print("\n");

        
    }
    
    private void levelUp(){
        this.level++;
    }

    // turn up
    private static int nextTurn(){
        return Player.turn++;
    }

    // setter
    public void setArmor(Armor armor){     
        this.armor = armor;
    }
    public void setWeapon(Weapon attack){
        this.weapon = attack;
    }

    public int maxHealth(){        
        return this.baseHealth + this.incrementHealth*this.level + this.armor.getAddHealth();
    }
    private int attackPower(){
        return this.baseDamage + this.incrementDamage*this.level + this.weapon.getAddAttack();
    }
    
}

class Armor{
    private String name;
    private int strength;
    private int baseHealth;
    Armor(String name, int strength, int baseHealth){
        this.name = name;
        this.strength = strength;
        this.baseHealth = baseHealth;
    }
    // getter
    public int getAddHealth(){    
        return this.baseHealth + this.strength * 10;
    }
    public int getDefencePower(){
        return this.strength*5;
    }
}
class Weapon{
    private String name;
    private int attack; 
    private int baseAttack;
    Weapon(String name, int attack,int baseAttack){
        this.name = name;
        this.attack = attack;
        this.baseAttack = baseAttack;
    }
    // getter
    public int getAddAttack(){        
        return  this.attack * 2 + this.baseAttack; // 1 damage = 5 attack power 
    }
    
}



public class Main {
    public static void main(String[] args) {
        // create player1 object 
        Player player1 = new Player("Axe");
        Armor armor1 = new Armor("Baju Keras",5,100);
        Weapon weapon1 = new Weapon("Kriss Sakti",2,100);
        // men set armor ke write only
        player1.setArmor(armor1);
        player1.setWeapon(weapon1);
        // create player2 object 
        Player player2 = new Player("Cristal Maiden");
        Armor armor2 = new Armor("Gaun",5,50);
        Weapon weapon2 = new Weapon("Pecut Sakti",2,10);
        // men set armor ke write only

        player2.setArmor(armor2);
        player2.setWeapon(weapon2);
        
        player1.attack(player2);
        player2.attack(player1);
        player1.attack(player2);        
        
    }
    
}