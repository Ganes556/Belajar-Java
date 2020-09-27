package com.tutorial62;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner terminalInput  = new Scanner(System.in);

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
                    cariData();
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
                case 0:
                    System.exit(0);
                default:
                    System.err.println("[-] Pilihan anda tidak ada di options !\n\tTolong input angka 0-5");
            }

            isLanjutkan = yesOrNo("apakah anda ingin melanjutkan ?");

        }


    }
    private static void tampilkanData() throws IOException{
        FileReader fileRead;
        BufferedReader bufferedReader;
        try{
            fileRead = new FileReader("database.txt");
            bufferedReader = new BufferedReader(fileRead);
        }catch (IOException e){
            System.err.println("[-] File tidak ada !");
            System.err.println("    Silakan tambahkan data terlebih dahulu");
            return;
        }
        String data = bufferedReader.readLine();

        System.out.println(" ----------------------------------------------------------------------------------------------------------------");
        System.out.println(" |  No |\tNama Games\t\t|\tTahun Terbit  \t|\t Asal Terbit\t |\tPenerbit\t|");
        System.out.println(" ----------------------------------------------------------------------------------------------------------------");

        int nomorData = 0;
        while (data != null){
            StringTokenizer stringToken = new StringTokenizer(data,",");
            nomorData++;
            System.out.printf(" |  %d  ",nomorData); // nomer
            System.out.printf("| %-25s\t",stringToken.nextToken()); // nama games
            System.out.printf("| %s\t\t",stringToken.nextToken()); // tahun terbit
            System.out.printf("| %-20s\t ",stringToken.nextToken()); // asal terbit
            System.out.printf("| %-21s|\n",stringToken.nextToken());// penerbit

            data = bufferedReader.readLine();
        }
        System.out.println(" ----------------------------------------------------------------------------------------------------------------");



        System.out.println("Akhir dari database");

    }
    private  static void cariData() throws IOException{
        // check data bases ada atau tidak
        try{
            File file = new File("database.txt");
        }catch (Exception e){
            System.err.println("[-] File tidak ada !");
            System.err.println("    Silakan tambahkan data terlebih dahulu");
            return;
        }

        // ambil keyword dari user
        Scanner terminalInput = new Scanner(System.in);

        System.out.print("Input kata kunci dengan ',' sebagai pemisah primary key\ncontoh: among us , american , dll\n>>> ");
        String cariString = terminalInput.nextLine();
        String[] keywords = cariString.split(",");


        // kita check keyword ke database
        System.out.println(" ----------------------------------------------------------------------------------------------------------------");
        System.out.println(" |  No |\tNama Games\t\t|\tTahun Terbit  \t|\t Asal Terbit\t |\tPenerbit\t|");
        System.out.println(" ----------------------------------------------------------------------------------------------------------------");
        cekGamesdiDatabase(keywords);
        System.out.println(" ----------------------------------------------------------------------------------------------------------------");

    }
    private static void cekGamesdiDatabase(String[] keywords) throws IOException{
        FileReader fileInput = new FileReader("database.txt");
        BufferedReader bufferedReader = new BufferedReader(fileInput);

        String data = bufferedReader.readLine();
//        StringTokenizer stringTokenizer = new StringTokenizer(data,",");
        boolean isExist;
        int nomorData = 0;
        while(data != null) {
            nomorData++;
            isExist = true;
//            System.out.println(data);
//            System.out.println(isExist);
            for(String keyword:keywords) {
                isExist = isExist && data.toLowerCase().contains(keyword.toLowerCase().stripTrailing().stripLeading());
            }
//            System.out.println(isExist);

            // tampilkan jika isExistnya true
            if(isExist){
                StringTokenizer stringToken = new StringTokenizer(data,",");
                System.out.printf(" |  %d  ",nomorData); // nomer
                System.out.printf("| %-25s\t",stringToken.nextToken()); // nama games
                System.out.printf("| %s\t\t",stringToken.nextToken()); // tahun terbit
                System.out.printf("| %-20s\t ",stringToken.nextToken()); // asal terbit
                System.out.printf("| %-21s|\n",stringToken.nextToken());// penerbit

                data = bufferedReader.readLine();
            }

            data = bufferedReader.readLine();



        }
    }

    private static void dekorasiMenu(){
        System.out.println("================ Database List Games ================");
        System.out.println("[+] Option yang bisa di pilih: ");
        System.out.println("\t1. Lihat seluruh list Game");
        System.out.println("\t2. Cari data game");
        System.out.println("\t3. Tambah data game");
        System.out.println("\t4. Ubah data game");
        System.out.println("\t5. Hapus data game");
        System.out.println("\t0. Exit");

        System.out.print("\n\n Pilih >> ");
    }
    private static void dekorasiCase(String message){
        System.out.println("|==============================|");
        System.out.println("\t"+message);
        System.out.println("|==============================|\n");

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
