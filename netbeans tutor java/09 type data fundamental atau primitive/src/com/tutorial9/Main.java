  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial9;

/**
 *
 * @author Ganes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // integer, byte, long, short, double, float, char, boolean
   // type data primitive karna sizenya tetap     
        //integer (satuan)
        int i = 10;
        System.out.println("=====INTEGER=====");
        System.out.println("Nilai Integer i = " + i);
        System.out.println("Nilai max = " + Integer.MAX_VALUE);
        System.out.println("Nilai min = " + Integer.MIN_VALUE);
        System.out.println("Besar integer = " + Integer.BYTES + " bytes");
        System.out.println("Besar integer = " + Integer.SIZE + " bit");        
        // NOTE: cara hitung min,max = (2^n-1) dengan n = bitnya
        //byte (satuan)
        byte b = 11;
        System.out.println("=====BYTE=====");
        System.out.println("Nilai Byte b = " + i);
        System.out.println("Nilai max = " + Byte.MAX_VALUE);
        System.out.println("Nilai min = " + Byte.MIN_VALUE);
        System.out.println("Besar Byte = " + Byte.BYTES + " bytes");
        System.out.println("Besar Byte = " + Byte.SIZE + " bit");
        //long (satuan)
        long l = 12L;
        System.out.println("=====LONG=====");
        System.out.println("Nilai Long l = " + i);
        System.out.println("Nilai max = " + Long.MAX_VALUE);
        System.out.println("Nilai min = " + Long.MIN_VALUE);
        System.out.println("Besar Byte = " + Long.BYTES + " bytes");
        System.out.println("Besar Byte = " + Long.SIZE + " bit");
        //short(satuan)
        short s = 13;
        System.out.println("=====SHORT=====");
        System.out.println("Nilai Short s = " + s);
        System.out.println("Nilai max = " + Short.MAX_VALUE);
        System.out.println("Nilai min = " + Short.MIN_VALUE);
        System.out.println("Besar Byte = " + Short.BYTES + " bytes");
        System.out.println("Besar Byte = " + Short.SIZE + " bit");
        //double (koma)
        double d = 14.5d;
        System.out.println("=====DOUBLE=====");
        System.out.println("Nilai Double d = " + d);
        System.out.println("Nilai max = " + Double.MAX_VALUE);
        System.out.println("Nilai min = " + Double.MIN_VALUE);
        System.out.println("Besar Byte = " + Double.BYTES + " bytes");
        System.out.println("Besar Byte = " + Double.SIZE + " bit");
        //float (koma)
        float f = 15.5f;
        System.out.println("=====FLOAT=====");
        System.out.println("Nilai Float f = " + f);
        System.out.println("Nilai max = " + Float.MAX_VALUE);
        System.out.println("Nilai min = " + Float.MIN_VALUE);
        System.out.println("Besar Byte = " + Float.BYTES + " bytes");
        System.out.println("Besar Byte = " + Float.SIZE + " bit");
        //char berdasarkan ASCII
        char c = 'c';
        System.out.println("=====CHAR=====");
        System.out.println("Nilai Char i = " + c);
        System.out.println("Nilai max = " + Character.MAX_VALUE);
        System.out.println("Nilai min = " + Character.MIN_VALUE);
        System.out.println("Besar Byte = " + Character.BYTES + " bytes");
        System.out.println("Besar Byte = " + Character.SIZE + " bit");
        //boolean bernilai true dan false 
        boolean val = true;
        System.out.println("=====BOOLEAN=====");
        System.out.println("Nilai Char i = " + val);
        System.out.println("Nilai max = " + Boolean.TRUE);
        System.out.println("Nilai min = " + Boolean.FALSE);
    }
    
}
