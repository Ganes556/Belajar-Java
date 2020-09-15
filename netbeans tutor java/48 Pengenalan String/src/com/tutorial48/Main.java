/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial48;
import java.util.Arrays;
/**
 *
 * @author Ganes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // fungsi Operasi String 
        // membuat String
        String kataString = "halo";
        char[] kataChar = {'h','a','l','l','o'};
        
        // menampilkan String
        
        System.out.println(kataString);
        System.out.println(Arrays.toString(kataChar));
        
        // mengakses komponen dari string
        System.out.println("komponen pertama = "+ kataChar[0]);
        System.out.println("komponen pertama = " + kataString.charAt(0));
        
        // merubah komponen dari String
        // itu tidak bisa... karena string di java itu immutable
        kataChar[0] = 'c';
        // kataString[0] = 'c' --> tidak bisa 
        // kataString.charAt[0] = 'c' --> tidak bisa 
        
        System.out.println(Arrays.toString(kataChar));
        printAddress("Kata String 1",kataString);
        
        //kita bisa merubah komponen secara tidak langsung 
        kataString = "c" + kataString.substring(1,4);
        System.out.println(kataString);
        
        printAddress("Kata String 2", kataString);
        // memory dari string (String Pool) --+ artinya mengambil address yang sama bila string sama 
        // memory di java  --> heap,        stack,                string pool
        //                      |             |                        |
        //                    object, method & variable fundamental,          string
        String str_1 = "halo";
        String str_2 = "test";
        String str_3 = "halo test";
        
        printAddress("str 1 = ",str_1);
        printAddress("str 2 = ",str_2);
        printAddress("str 3 = ", str_3);
        
        str_3 = str_3.substring(1,6);
        printAddress("str 3 = ", str_3);
        String str_4 = "calo";
        printAddress("str 4 = ",str_4);
        kataString =  "calo";
        printAddress("Kata String",kataString);
        
        // 1. string di java bersifat immutable
        // 2. string yang berada di memory java akan reuseable(dpt digunakan kembali)/
        // memorynya lebih efisien
        // 3. membuat string dengan method baru maka akan ditaruh di memory lain 
        // bukan di string pool
        
        // liat lebih dalam 
        String a = new String("calo");
        printAddress("a",a); // --> address berbeda karna menggunakan momory heap
    }
    private static void printAddress(String nama , String data){
        int address = System.identityHashCode(data);
        System.out.println(nama + " = " + data + " || address = " + Integer.toHexString(address));
    }
    
    
}
