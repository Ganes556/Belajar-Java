package com.tutorial;

class Player{
    String nama; // default, dia akan bisa di baca dan ditulis dari luar class
    public int exp; // public, dia akan bisa di baca dan ditulis dari luar class
    private int health; // private, dia akan bisa di baca dan ditulis dari dalam class saja
    Player(String nama, int exp, int health){
        this.nama = nama;
        this.exp = exp;
        this.health = health;
    }
    // default modifier access
    void display(){ 
        tambahExp(); // contoh mengakses si method private
        System.out.printf("\nNama = %s\n",this.nama);
        System.out.printf("exp = %s\n",this.exp);
        System.out.printf("health = %s\n",this.health); // membaca tapi di dalam class
    }
    // public
    public void ubahNama(String namaBaru){
        this.nama = namaBaru;
    }
    // private
    private void tambahExp(){
        this.exp += 100;
    }
}
public class Main{
    public static void main(String[] args) {
        Player player1 = new Player("ucup",0,10);

        // default 
        System.out.println(player1.nama); // membaca data
        player1.nama = "budi"; // menulis data
        System.out.println(player1.nama);

        // public
        System.out.println(player1.exp); // membaca data
        player1.exp = 100; // menulis data
        System.out.println(player1.exp);

        // private (tidak bisa di akses)
        // System.out.println(player1.health); // membaca data
        // player1.health = 100; // menulis data
        // System.out.println(player1.health);

        // method

        // default
        player1.display();
        
        // public
        player1.ubahNama("suteja");
        player1.display();
        
        //private (tidak bisa diakses)
        // player1.tambahExp();
        

    }
}