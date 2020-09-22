package com.tutorial60;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner terminalInput  = new Scanner(System.in);


//        Scanner sentenceRead = new Scanner(bufferedReader);
//        sentenceRead.useDelimiter(",");
//
//        while(sentenceRead.hasNext()) {
//            System.out.println(sentenceRead.next());
//        }
//
        int pilihanUser;
        boolean isLanjutkan = true;
        while(isLanjutkan) {
            clearScreen();
            dekorasiMenu();
            pilihanUser = terminalInput.nextInt();

            switch (pilihanUser) {
                case 1:
                    dekorasiCase("LIST SELURUH GAMES");
                    // Tampilkan data
                    tampilkanData();
                    break;
                case 2:
                    dekorasiCase("CARI DATA GAMES");
                    // Cari data
                    break;
                case 3:
                    dekorasiCase("TAMBAH DATA GAMES");
                    // Tambah data
                    break;
                case 4:
                    dekorasiCase("UBAH DATA GAMES");
                    // Ubah data
                    break;
                case 5:
                    dekorasiCase("HAPUS DATA GAMES");
                    // Hapus data
                    break;
                default:
                    System.err.println("[-] Pilihan anda tidak ada di options !\n\tTolong input angka 1-5");
            }

            isLanjutkan = yesOrNo("apakah anda ingin melanjutkan ?");

        }


    }
    private static void tampilkanData() throws IOException{

    }
    private static void dekorasiMenu(){
        System.out.println("================ Database List Games ================");
        System.out.println("[+] Option yang bisa di pilih: ");
        System.out.println("\t1. Lihat seluruh list Game");
        System.out.println("\t2. Cari data game");
        System.out.println("\t3. Tambah data game");
        System.out.println("\t4. Ubah data game");
        System.out.println("\t5. Hapus data game");

        System.out.print("\n\n Pilih >> ");
    }
    private static void dekorasiCase(String message){
        System.out.println("|========================|");
        System.out.println("\t"+message);
        System.out.println("|========================|\n");

    }

    private static void clearScreen(){
        try{
            if(System.getProperty("os.name").contains("Windows")){
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            }else{
                System.out.print("\033\143");
            }
        }catch(Exception e){
            System.err.println("Os mu tidak mendukung clear screen !");
        }

    }
    private static boolean yesOrNo(String message){
        Scanner terminalInput  = new Scanner(System.in);
        System.out.print("[+] "+ message +" (y/n)? ");
        String pilihanAnda = terminalInput.next();
        while(!pilihanAnda.equalsIgnoreCase("y") && !pilihanAnda.equalsIgnoreCase("n")){
            System.err.println("[-] Pilihan anda bukan y atau n");
            System.out.print("\n[+] "+ message +" (y/n)? ");
            pilihanAnda = terminalInput.next();
        }
        Pattern pattern = Pattern.compile("[1-9]");
        return pilihanAnda.equalsIgnoreCase("y"); // jika y akan melanjutkan looping
    }

}
