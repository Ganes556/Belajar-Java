package com.tutorial;
public class HeroStrength extends Hero{
    // String name = "SS2tu";

    void display(){
        
        // this.name akan mengakses attribut name kalau ada di kelas ini
        // jika tidak ada maka ia akan mengakses atribut name dari super classnya contoh :
        System.out.println("\nNama2-guna this : " + this.name);
        this.dummyMethod();
    }
    void displaySuper(){
        // super.name akan selalu mengakses atribut name dari super classnya
        System.out.println("\nNama2-guna super : " + super.name);
        super.dummyMethod();
    }

    void dummyMethod(){
        System.out.println("Method dummy yang ada di sub class ");
    }
}
