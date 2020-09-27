package com.tutorial64;

import java.io.*;
import java.time.Year;
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
                    break;
                case 5:
                    clearScreen();
                    dekorasiCase("HAPUS DATA GAMES");
                    // Hapus data
                    deleteData();
//                    hapusRenameFile();

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
            tambahData();
            return;
        }
        String data = bufferedReader.readLine();

        dekorasiOutputData(true);

        int nomorData = 0;
        while (data != null){
            StringTokenizer stringToken = new StringTokenizer(data,",");
            nomorData++;
            System.out.printf(" | %d   ",nomorData); // nomer
            System.out.printf("| %-25s\t", stringToken.nextToken());//nama games
            System.out.printf("| %s\t\t",stringToken.nextToken()); // tahun terbit
            System.out.printf("| %-20s\t ",stringToken.nextToken()); // asal terbit
            System.out.printf("| %-21s|\n",stringToken.nextToken());// penerbit

            data = bufferedReader.readLine();
        }
        dekorasiOutputData(false);
        bufferedReader.close();



        System.out.println("\t\t\t\t++++++++++ Akhir dari database ++++++++++\n");

    }
    private  static void cariData() throws IOException{
        // check data bases ada atau tidak
        try{

            FileReader test = new FileReader("database.txt");

        }catch (Exception e){
            System.err.println("[-] File tidak ada !");
            System.err.println("    Silakan tambahkan data terlebih dahulu");
            tambahData();
            return;
        }

        // ambil keyword dari user
        Scanner terminalInput = new Scanner(System.in);

        System.out.print("Input kata kunci dengan ',' sebagai pemisah primary key\ncontoh: among us , american , dll\n>>> ");
        String cariString = terminalInput.nextLine();
        String[] keywords = cariString.split(",");


        // kita check keyword ke database
        dekorasiOutputData(true);
        cekGamesdiDatabase(keywords,true);
        dekorasiOutputData(false);


    }
    private static boolean cekGamesdiDatabase(String[] keywords,boolean isDisplay) throws IOException{
        FileReader fileInput = new FileReader("database.txt");
        BufferedReader bufferedReader = new BufferedReader(fileInput);

        String data = bufferedReader.readLine();

        boolean isExist = false;
        int nomorData = 0;
        while(data != null) {
            nomorData++;
            isExist = true;

            for(String keyword:keywords) {
                isExist = isExist && data.toLowerCase().contains(keyword.toLowerCase().stripTrailing().stripLeading());
            }

            if(isExist && isDisplay){
                StringTokenizer stringToken = new StringTokenizer(data,",");

                System.out.printf(" | %d   ",nomorData); // nomer
                System.out.printf("| %-25s\t",stringToken.nextToken()); // nama games
                System.out.printf("| %s\t\t",stringToken.nextToken()); // tahun terbit
                System.out.printf("| %-20s\t ",stringToken.nextToken()); // asal terbit
                System.out.printf("| %-21s|\n",stringToken.nextToken());// penerbit
                break;
            }else if(isExist){
                break;
            }

            data = bufferedReader.readLine();



        }
        return isExist;
    }
    private static void tambahData() throws IOException{
        Scanner terminalInput = new Scanner(System.in);
        FileWriter fileWriter = new FileWriter("database.txt",true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String namaGames,tahunTerbit,asalTerbit,penerbit;

        // mengambil input dari user
        System.out.print("Nama Games: ");
        namaGames = terminalInput.nextLine();
        System.out.print("Asal Terbit: ");
        asalTerbit = terminalInput.nextLine();
        System.out.print("Penerbit: ");
        penerbit = terminalInput.nextLine();
        System.out.print("Tahun Terbit, Format (yyyy): ");
        tahunTerbit = ambilTahun(terminalInput);
        // tambahkan data yang sudah anda masukan
        System.out.println("\nData yang akan anda tambahkan adalah ");
        System.out.println("--------------------------------------------");
        System.out.println("Nama Games   : " + namaGames);
        System.out.println("Asal Terbit  : " + asalTerbit);
        System.out.println("Penerbit     : " + penerbit);
        System.out.println("Tahun Terbit : " + tahunTerbit);
        System.out.println("--------------------------------------------");
        String hasil = String.format("%s,%s,%s,%s",namaGames,tahunTerbit,asalTerbit,penerbit);

        boolean save = yesOrNo("SAVE PENAMBAHAN DATA");
        // check save atau tidak
        if (!save){
            return;
        }else {
            // check buku ada di database
            String[] keywords = hasil.split(",");
            boolean check = cekGamesdiDatabase(keywords,false);
            if (!check) {
                bufferedWriter.newLine();
                bufferedWriter.write(hasil);
                bufferedWriter.flush();
                System.out.println("\n***Data berhasil ditambahkan ke database***\n");
            }else{
                clearScreen();
                System.err.println("Data sudah terdaftar di database\nsilakan masukan ulang data:\n");
                tambahData();
            }
        }

        bufferedWriter.close();
    }
    private static void deleteData() throws IOException{
        // ambil database ori
        File database = new File("database.txt");
        FileReader oriDB = new FileReader(database);
        BufferedReader bacaOriDB = new BufferedReader(oriDB);

        // buat database sementara
        File tempDB = new File("tempDB.txt");
        FileWriter membuatTempDB = new FileWriter(tempDB);
        BufferedWriter outputTempDB = new BufferedWriter(membuatTempDB);

        // tampilkan data ori database
        System.out.println("\tList Games ");
        tampilkanData();

        // ambil input yang akan di delete
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("Pilih nomor data yang akan di delete: ");
        int nomorDelete = terminalInput.nextInt();

        // looping untuk membaca tiap data perbaris dan skip data yang akan di delete
        String data = bacaOriDB.readLine();
        boolean isFound = false;
        int nomor = 0;
        while(data != null){
            nomor++;
            boolean isDelete = false;
            // memecah data perkata
            StringTokenizer st = new StringTokenizer(data,",");

            if (nomorDelete == nomor){
                System.out.println("\nData yang akan anda hapus adalah ");
                System.out.println("--------------------------------------");
                System.out.println("Nama Games   : " + st.nextToken());
                System.out.println("Asal Terbit  : " + st.nextToken());
                System.out.println("Penerbit     : " + st.nextToken());
                System.out.println("Tahun Terbit : " + st.nextToken());
                System.out.println("--------------------------------------");
                isDelete = yesOrNo("apakah anda yakin untuk menghapus data");
                isFound = true;
            }
            if (isDelete){
                // skip pindahkan data dari data ori ke data sementara
                System.out.println("\n***Data berhasil dihapus***\n");
            }else{
                // pindahkan data dari data orike data sementara
                outputTempDB.write(data);
                outputTempDB.newLine();
            }


            data = bacaOriDB.readLine();

        }
        if(!isFound){
            System.err.println("\nGames tidak ditemukan");
        }
        // menambahkan data dengan flush
        outputTempDB.flush();
        outputTempDB.close();
        bacaOriDB.close();



        // ERROR TIDAK BISA DELETE FILE DATABASE DAN RENAME tempDB nya !
        // masalahnya buffered file di bagian tampilkanData() masih kebuka jadi close dulu itu dan
        // juga tutup file buffered di bagian fungsi deleteData

        // delete data original database
        database.delete();
        // rename data sementara ke nama database
        tempDB.renameTo(database);
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
    private static void dekorasiOutputData(boolean topAndBot){
        if (topAndBot) {
            System.out.println(" --------------------------------------------------------------------------------------------------------");
            System.out.println(" |  No\t|\tNama Games\t\t|  Tahun Terbit |\t Asal Terbit\t |\tPenerbit\t|");
            System.out.println(" --------------------------------------------------------------------------------------------------------");
        }else if(!topAndBot){
            System.out.println(" --------------------------------------------------------------------------------------------------------\n");
        }
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

        return pilihanAnda.equalsIgnoreCase("y"); // jika y akan melanjutkan looping
    }
    private static String ambilTahun (Scanner terminalInput){
        String tahunTerbit = terminalInput.nextLine();
        while(true) {
            try {
                Year.parse(tahunTerbit);
                break;
            } catch (Exception e) {
                System.err.print("\n[-]Format salah cuk !\n[+]Masukan Tahun Terbit Lagi: ");
                tahunTerbit = terminalInput.nextLine();
            }
        }
        return tahunTerbit;
    }
}

