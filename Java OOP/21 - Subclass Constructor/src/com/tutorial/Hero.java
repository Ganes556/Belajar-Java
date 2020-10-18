package com.tutorial;

public class Hero{
    // atribut
    String name;
    double defancePower;
    // contructor
    Hero(String name,double defancePower){
        this.name = name;
        this.defancePower = defancePower;
    }

    Hero(String name){
        this.name = name;
    }
    // method display
    void display(){
        System.out.println("Name = " + this.name);
        if(defancePower != 0){
            System.out.println("Defance power = " + this.defancePower);
        }
    }
}