package com.tutorial;
import com.terminal.Console;
class Player {
    private String name;
    Player(String name){
        this.name = name;
    }
    public void show(){
        // System.out.println(this.name);
        Console.log(this.name);
    }
    String getName(){
        return this.name;
    }
}
