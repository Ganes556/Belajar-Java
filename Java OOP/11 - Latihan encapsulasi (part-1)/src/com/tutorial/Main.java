package com.tutorial;

class Player{
    private String name;
    private int baseHealth;
    private int baseDamage;
    private Armor armor;
    private Weapon weapon;
    private int level;
    private int incrementHealth;
    private int incrementDamage;
    Player(String name){
        this.name = name;
        this.baseHealth = 100;
        this.baseDamage = 50;
        this.level = 1;
        this.incrementHealth = 20;
        this.incrementDamage = 20;
    }

    public void display(){
        System.out.println("Nama : " + this.name);        
        System.out.println("Level : " + this.level);
        System.out.println("Max Health : " + this.maxHealth());     
        System.out.println("Attack Power : " + this.attackPower() + "\n");   
    }

    private void levelUp(){
        this.level++;
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
    public int attackPower(){
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
        return  this.attack * 5 + this.baseAttack; // 1 damage = 5 attack power 
    }
}
// PR BUAT SEBUAH PLAYERNYA BISA SALING SERANG DAN SI PLAYER AKAN LEVEL UP BILA SI PLAYER MENYERANG 
// TAMBAHAN KELUARANNYA ISI DAMAGE YANG DITERIMA, HEALTH ACTUALNYA/ HEALTH SAAT INI
public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Axe");
        Armor armor1 = new Armor("Baju Keras",5,100);
        Weapon weapon1 = new Weapon("Kriss Sakti",5,100);
        // men set armor ke write only
        player1.setArmor(armor1);
        player1.setWeapon(weapon1);

        Player player2 = new Player("Cristal Maiden");
        Armor armor2 = new Armor("Gaun",5,50);
        Weapon weapon2 = new Weapon("Kriss Sakti",5,10);
        // men set armor ke write only
        player2.setArmor(armor2);
        player2.setWeapon(weapon2);

        player1.display();
        player2.display();
        
    }
}