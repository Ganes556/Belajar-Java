 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial54;
import java.io.FileInputStream;
/**
 *
 * @author Ganes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        FileInputStream contoh = new FileInputStream("input.txt");
        System.out.println((char)contoh.read());
        System.out.println((char)contoh.read());
        System.out.println((char)contoh.read());
        System.out.println((char)contoh.read());
        System.out.println((char)contoh.read());
        System.out.println((char)contoh.read());
        
        // tempat textnya harus selevel dengan letak file tersebut
    }
    
}
