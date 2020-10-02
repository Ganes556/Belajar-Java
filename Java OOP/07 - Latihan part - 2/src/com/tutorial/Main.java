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

    void attack(Player opponent){
        double attackPower = this.weapon.attackPower;
        String attack = this.name + " attacking " + opponent.name + " with power: " + attackPower;        
        System.out.println(attack);
        // defence untuk si player inputnya
        opponent.defence(attackPower);
    }
    void defence(double attackPower){
        double damage;
        if (attackPower > this.armor.defence){
            damage = attackPower - this.armor.defence;
        }else{
            damage = 0;
        }
        this.health -= damage;
        System.out.println(this.name + " gets damage: " + damage);
        System.out.printf("Sisa Health %s : %.1f\n",this.name,this.health);
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
    double attackPower;
    String weaponName;
    Weapon(String weaponName, double attackPower){
        this.attackPower = attackPower;
        this.weaponName = weaponName;
    }
    void display(){
        System.out.println("Weapon : " + this.weaponName + ", attackPower : " + this.attackPower);
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
                                             // jika tidak ya gk bsa di panggil baik mudah jadi gunakan command "java -cp <class path>"
        // membuat object player 
        Player player1 = new Player("MegaCUP",3000);
        Player player2 = new Player("Asadin'M",500);
        // membuat object weapon
        Weapon sword = new Weapon("Sword",20);
        Weapon knife = new Weapon("Knife",65);
        // membuat object armor
        Armor harness = new Armor("Harness",40);
        Armor assasinArmor = new Armor("assasinArmor",10);
        
        // player 1
        player1.equipWeapon(sword);
        player1.equipArmor(harness);
        // player1.display();

        // player2
        player2.equipWeapon(knife);
        player2.equipArmor(assasinArmor);

        System.out.println("\nPERTEMPURAN");
        System.out.println("===============\nTurn - 1\n");
        player1.attack(player2);         
        System.out.println("===============\nTurn - 2\n");
        player2.attack(player1);

        System.out.println("===============");
    }
}
