package com.tutorial;
// akan mengimport class Console
import com.terminal.Console;
// mengimport static method dari class Console
import static com.terminal.Console.log;


// tidak bisa menggunakan private untuk class method 
// class method hanya ada keyword --> abstrack, public, default, final
    // private class test{

    // }


public class Main {
    public static void main(String[] args){
        Player player1 = new Player("Saitama");

        player1.show();
        
        Console.log("menampilkan data dengan Console.log");
        Console.log(player1.getName());

        log("menampilkan data dengan log");
        log(player1.getName());
    }
}
