package com.tutorial;
// keyword import untuk package external
import com.terminal.Console;

public class Main {
    public static void main(String[] args) throws Exception {
        Player player1 = new Player("Saitama");
        Player player2 = new Player("Suit Mask");
        
        player1.show();
        player2.show();
        Console.log("Hallo man teman");

    }
}
