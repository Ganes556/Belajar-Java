package com.tutorial;

// Player
class Player{
    String name;
    double health;
    int level;

    // object member 
    Weapon weapon;
    Armor armor;

    Player(String name, double health){
        this.name = name;
        this.health = health;
    }

    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    void equipArmor(Armor armor){
        this.armor = armor;
    }

    void display(){
        System.out.println("================================");
        System.out.println("Name : " + this.name);
        System.out.println("Health : " + this.health + " hp");
        this.weapon.display();
        this.armor.display();
        
    }
}
// Senjata
class Weapon{
    double damage;
    String weaponName;
    Weapon(String weaponName, double damage){
        this.damage = damage;
        this.weaponName = weaponName;
    }
    void display(){
        System.out.println("Weapon : " + this.weaponName + ", damage : " + this.damage);
    }
}
// Armor
class Armor{
    double defence;
    String armorName;
    Armor(String armorName, double defence){
        this.defence = defence;
        this.armorName = armorName;
    }
    void display(){
        System.out.println("Armor : " + this.armorName + ", defence : " + this.defence);
    }
}


public class Main {
    public static void main(String[] args) { // jika berisi String[] args baru bisa di panggil dengan "java Main.java"
                                             // jika tidak ya gk bsa di panggil baik mudah jadi gunakan IDE anjk
        // membuat object player 
        Player player1 = new Player("MegaCUP",3000);
        Player player2 = new Player("Asadin'M",500);
        // membuat object weapon
        Weapon sword = new Weapon("Sword",10);
        Weapon knife = new Weapon("Knife",65);
        // membuat object armor
        Armor harness = new Armor("Harness",40);
        Armor assasinArmor = new Armor("assasinArmor",10);
        
        // player 1
        player1.equipWeapon(sword);
        player1.equipArmor(harness);
        player1.display();

        // player2
        player2.equipWeapon(knife);
        player2.equipArmor(assasinArmor);
        player2.display();
        System.out.println("================================");
    }
}
