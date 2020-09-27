package com.tutorial60;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class debug {
    public static void main(String[] args) throws IOException {
        FileReader fileRead = new FileReader("database.txt");
        FileInputStream test = new FileInputStream("database.txt");
        BufferedReader bufferedReader = new BufferedReader(fileRead);
        bufferedReader.mark(200);
        Scanner pharse = new Scanner(bufferedReader);
        pharse.useDelimiter(",");
        System.out.println(pharse.next());
    }
}
