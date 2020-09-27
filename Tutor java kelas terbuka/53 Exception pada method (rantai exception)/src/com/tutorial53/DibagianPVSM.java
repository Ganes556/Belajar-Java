/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial53;
import java.io.FileInputStream;
/**
 *
 * @author Ganes
 */
public class DibagianPVSM {
    public static void main(String[] args) throws Exception{ // kekurangannya program tidak jalan jika terjadi error
        FileInputStream inputFile = new FileInputStream("input2.txt");
        System.out.println((char)inputFile.read());
        System.out.println("akhir program");
    }
}
