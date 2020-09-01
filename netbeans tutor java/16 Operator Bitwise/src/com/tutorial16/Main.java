/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial16;

/**
 *
 * @author Ganes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Operator Bitwise --> operator untuk melakukan operasi pad nilai bit
        byte a,b,c;         
        String a_bits,b_bits,c_bits;
        
        
        // Operator SHIFT LEFT 
        System.out.println("==== SHEFT LEFT (<<) ====");        
        a = 3;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d\n",a_bits,a);
        
        b = (byte) (a << 3);
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d\n",b_bits,b);
        
        // Operator SHIFT RIGHT 
        System.out.println("==== SHEFT RIGHT (>>) ====");
        a = 24;  
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d\n",a_bits,a);
        
        b = (byte) (a >> 3);
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d\n",b_bits,b);
        
        // Operator bitwise OR  
        System.out.println("==== BITWISE OR (|) ====");
        a = 24;  
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d\n",a_bits,a);
        
        b = 12;
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d\n",b_bits,b);
        System.out.println("---------------OR");
        c = (byte) (a|b);
        c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ','0');
        System.out.printf("%s = %d\n",c_bits,c);
        
        // Operator bitwise AND 
        System.out.println("==== BITWISE AND (&) ====");
        a = 24;  
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d\n",a_bits,a);
        
        b = 12;
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d\n",b_bits,b);
        System.out.println("---------------AND");

        c = (byte) (a&b);
        c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ','0');
        System.out.printf("%s = %d\n",c_bits,c);
        
        // Operator bitwise XOR (^) 
        System.out.println("==== BITWISE XOR (^) ====");
        a = 24;  
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d\n",a_bits,a);
        
        b = 12;
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d\n",b_bits,b);
        System.out.println("---------------XOR");

        c = (byte) (a^b);
        c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ','0');
        System.out.printf("%s = %d\n",c_bits,c);

        // Operator bitwise NEGASI/NOT (~) 
        System.out.println("==== BITWISE NEGASI (~) ====");
        a = 24; 
        b = (byte) (~a);
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d\n",a_bits,a);
        System.out.println("---------------NEGASI");
        b_bits = String.format("%8s",Integer.toBinaryString(b)).substring(24);
        System.out.printf("%s = %d\n",b_bits,b);

     
    }
    
}
