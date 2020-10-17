package com.tutorial;

// SuperClass, parent class, base class
class Hero{
    String name;
    static int bertambah;
    void display(){
        Hero.bertambah++;
        System.out.println("Hero " + bertambah + " adalah " + name);
    }
}