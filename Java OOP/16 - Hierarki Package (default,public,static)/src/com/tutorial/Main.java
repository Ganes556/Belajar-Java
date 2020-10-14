package com.tutorial;
import com.terminal.Console;
// import com.terminal.Console;

// tidak bisa menggunakan private untuk class method 
// class method hanya ada keyword --> abstrack, public, default, final
    // private class test{

    // }


public class Main {
    public static void main(String[] args){
        Player player1 = new Player("Saitama");
        player1.show();
        Console.iniContoh(player1.getName());
    }
}
