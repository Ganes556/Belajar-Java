package com.tutorial67;


// import java library
import java.io.*;
import java.util.Scanner;

// import method di library CRUD Design class
import static CRUD.Design.dekorasiCase;
import static CRUD.Design.dekorasiMenu;
// import method di library CRUD Utility class
import static CRUD.Utility.clearScreen;
import static CRUD.Utility.yesOrNo;
// import semua method di library CRUD Operasi class
import static CRUD.Operasi.*;

public class Main {

    public static void main(String[] args) throws IOException {
        try {
            FileReader fileThere = new FileReader("database.txt");
            fileThere.close();
        }catch(Exception e){
            System.out.println("[-]File Database Tidak ditemukan !");
        }

        Scanner terminalInput  = new Scanner(System.in);
        int pilihanUser;
        boolean isLanjutkan = true;

        while(isLanjutkan) {
            clearScreen();
            dekorasiMenu();
            pilihanUser = terminalInput.nextInt();

            switch (pilihanUser) {
                case 1:
                    clearScreen();
                    dekorasiCase("LIST SELURUH GAMES");
                    // Tampilkan data
                    tampilkanData();
                    break;
                case 2:
                    clearScreen();
                    dekorasiCase("CARI DATA GAMES");
                    // Cari data
                    cariData();
                    break;
                case 3:
                    clearScreen();
                    dekorasiCase("TAMBAH DATA GAMES");
                    // Tambah data
                    tambahData();
                    tampilkanData();
                    break;
                case 4:
                    clearScreen();
                    dekorasiCase("UBAH DATA GAMES");
                    // Ubah data
                    deleteUpdateData(true);
                    break;
                case 5:
                    clearScreen();
                    dekorasiCase("HAPUS DATA GAMES");
                    // Hapus data
                    deleteUpdateData(false);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.err.println("[-] Pilihan anda tidak ada di options !\n\tTolong input angka 0-5");
            }

            isLanjutkan = yesOrNo("apakah anda ingin melanjutkan ?");

        }


    }





}