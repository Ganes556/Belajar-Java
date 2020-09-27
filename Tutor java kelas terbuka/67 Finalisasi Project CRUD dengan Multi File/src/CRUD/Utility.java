package CRUD;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Year;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Utility {
    protected static boolean cekGamesdiDatabase(String[] keywords,boolean isDisplay) throws IOException {
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
        fileInput.close();
        bufferedReader.close();
        return isExist;
    }
    public static void clearScreen(){
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
    public static boolean yesOrNo(String message){
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
    protected static String ambilTahun (Scanner terminalInput){
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
