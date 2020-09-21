/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial51;
import java.util.Scanner;
import java.util.Formatter;
/**
 *
 * @author Ganes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nama = "Ucup";
        int umur = 18;
        // output : Nama saya adalah ucup, umur saya adalah 18
        System.out.println("Nama Saya Adalah = " + nama + ", umur saya adalah " + umur);
        
        // cara lainnya adalah dengan format string
        System.out.printf("Nama saya adalah = %s, umur saya adalah %d",nama,umur);
        
        // convertion : f=floating point, d= integer, c=character, s=string, b=boolean
        // struktur format = %[argumen_index$][flags][width][.precision]convertion
        
        // [argumen_index$]
        System.out.println("\n[argumen_index$]");
        System.out.printf("%1$s kemana saja engakau %1$s dari tadi mencari %1$s\n",nama);
        // umur ucup berapa ?, udin menjawab 18, wah masih muda kau ucup
        System.out.printf("umur %1$s berapa?, %1$s menjawab: %2$d, wah masih muda kau %1$s\n",nama,umur);
        
        // [flags]
        System.out.println("\n[flags]");
        
        int int1 = 5;
        int int2 = 8;
        int hasil = int1 + int2; 
        System.out.printf("%d + %d = %+d\n",int1,int2,hasil);
        
        // [width]
        System.out.println("\n[width]");
        int int3 = 1000;
        System.out.println("INTEGER");
        System.out.printf("%d\n",int3);
        System.out.printf("%8d\n",int3);
        System.out.printf("%-8d\n",int3); // flags (-) = rata kiri
        System.out.printf("%+8d\n",int3); // flags akan mengambil slot di dalam format
        System.out.printf("%+-6d\n",int3); // flags bisa digabungkan
        System.out.printf("%010d\n",int3); // flags == "0", itu artinya penambahan 0 di dalam format/width
        long int4 = 10000000;
        System.out.printf("%,15d\n",int4); // flags = "," menambahkan delimeter "," setiap seribu
        
        System.out.println("\nFLOATING POINT");
        float float1 = 1.50f;
        System.out.printf("%+9f\n",float1); // floating pint akan mengambil width dengan 6 decimal
        
        // [.precision]
        System.out.println("\n[.precision]");
        float float2 = 15.39f;
        System.out.printf("%.3f\n",float2); // precision itu untk menambahkan/mengurangin angka di blakang "."
        System.out.printf("%08.2f\n",float2); // gabungkan dengan width dan flag
        
        //contoh
        String nama2 = "Denis";
        double IPK = 3.865431;
        String info = "\nIPK %1$s berapa ?\n%1$s menjawab: %2$+.2f pak\n";

        System.out.printf("\nBiasa "+info,nama2,IPK);
        
        // kesimpulan 
        // save format ini kedalam variable string
        String info_format = String.format("\nString Format" + info,nama,IPK);
        System.out.println(info_format);
        
        // save format ini kedalam string builder
        StringBuilder builder_info = new StringBuilder();
        Formatter formatBuilder = new Formatter(builder_info);
        formatBuilder.format("\nString Builder"+info,nama,IPK);
    }   
    
    
}
