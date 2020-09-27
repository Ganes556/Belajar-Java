package CRUD;
// import java library
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.StringTokenizer;

// import semua method di class Design,utility
import static CRUD.Design.*;
import static CRUD.Utility.*;
public class Operasi {
    public static void tampilkanData() throws IOException {
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
    public  static void cariData() throws IOException{
        // check data bases ada atau tidak
        try{
            FileReader test = new FileReader("database.txt");
            test.close();
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
    public static void tambahData() throws IOException{
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
                bufferedWriter.write(hasil);
                bufferedWriter.newLine();
                bufferedWriter.flush();
                System.out.println("\n***Data berhasil ditambahkan ke database***\n");
            }else{
                clearScreen();
                System.err.println("Data sudah terdaftar di database\nsilakan masukan ulang data:\n");
                tambahData();
            }
        }
        fileWriter.close();
        bufferedWriter.close();
    }
    public static void deleteUpdateData(boolean Update) throws IOException {
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
        int nomorUpdateDelete;

        // cek apakah ingin menghapus atau tidak

        if (Update) {
            System.out.print("Pilih nomor data yang akan di update: ");

        } else if(!Update) {
            System.out.print("Pilih nomor data yang akan di hapus: ");

        }
        nomorUpdateDelete = terminalInput.nextInt();

        // looping untuk update dan delete
        String data = bacaOriDB.readLine();
        boolean isFound = false;
        int nomor = 0;
        while (data != null) {
            nomor++;
            // meyakinkan mau di delete dan update
            boolean isUpdateDeleteData = false;
            StringTokenizer st = new StringTokenizer(data, ",");

            // logika update
            if (nomorUpdateDelete == nomor && Update) {
                System.out.println("\nData yang akan anda update adalah ");
                System.out.println("--------------------------------------");
                System.out.println("Nama Games   : " + st.nextToken());
                System.out.println("Tahun Terbit : " + st.nextToken());
                System.out.println("Asal Terbit  : " + st.nextToken());
                System.out.println("Penerbit     : " + st.nextToken());
                System.out.println("--------------------------------------");

                // update data

                st = new StringTokenizer(data, ",");
                String[] fileData = {"Nama Games","Tahun Terbit","Asal Terbit","Penerbit"}; // format data
                String[] tempData = new String[4];

                for(int i = 0; i < fileData.length;i++){
                    boolean isUpdateData = yesOrNo("Apakah anda ingin memperbarui " + fileData[i] );
                    String original = st.nextToken();
                    // check jika ingin perbarui atau tidak
                    if(isUpdateData){
                        // mengambil input data baru
                        terminalInput = new Scanner(System.in);
                        String dataBaru;
                        //  cek bagian pengambilan tahun
                        if(fileData[i].equalsIgnoreCase("Tahun Terbit")){
                            System.out.print("Tahun Terbit, Format (yyyy): ");
                            dataBaru = ambilTahun(terminalInput);
                        }else{
                            System.out.print("\nMasukan " + fileData[i] + " yang baru: ");
                            dataBaru = terminalInput.nextLine();
                        }
                        tempData[i] = dataBaru;
                    }else{
                        tempData[i] = original;
                    }
                }

                // tampilkan data yang baru ke terminal
                st = new StringTokenizer(data,",");
                System.out.println("\nData baru anda adalah ");
                System.out.println("--------------------------------------");
                System.out.println("Nama Games   : " + st.nextToken() + "--> "+ tempData[0]);
                System.out.println("Tahun Terbit : " + st.nextToken() + "--> "+ tempData[1]);
                System.out.println("Asal Terbit  : " + st.nextToken() + "--> "+ tempData[2]);
                System.out.println("Penerbit     : " + st.nextToken() + "--> "+ tempData[3]);
                System.out.println("--------------------------------------");
                isUpdateDeleteData = yesOrNo("Apakah anda yakin untuk merubah data tersebut");
                if(isUpdateDeleteData) {
                    // check data baru di database
                    boolean isExist = cekGamesdiDatabase(tempData,false);
                    if (isExist){
                        System.err.println("\n\n[-] Data sudah ada di database proses pembaruan data dibatalkan !");
                    }else{
                        String namaGames = tempData[0];
                        String tahunTerbit = tempData[1];
                        String asalTerbit = tempData[2];
                        String penerbit = tempData[3];
                        data = String.format("%s,%s,%s,%s",namaGames,tahunTerbit,asalTerbit,penerbit);
                    }
                }
                isFound = true;
                // logika hapus data
            }else  if(nomorUpdateDelete == nomor && !Update){
                System.out.println("\nData yang akan anda hapus adalah ");
                System.out.println("--------------------------------------");
                System.out.println("Nama Games   : " + st.nextToken());
                System.out.println("Tahun Terbit : " + st.nextToken());
                System.out.println("Asal Terbit  : " + st.nextToken());
                System.out.println("Penerbit     : " + st.nextToken());
                System.out.println("--------------------------------------");
                isUpdateDeleteData = yesOrNo("Apakah anda yakin untuk menghapus data");
                isFound = true;

            }


            // skip untuk hapus data
            if (isUpdateDeleteData && !Update) {
                // skip pindahkan data dari data ori ke data sementara
                System.out.println("\n***Data berhasil dihapus***\n");
                // pindahkan data dari data ori ke data sementara bagi tipe delete maupun update
            } else {
                outputTempDB.write(data);
                outputTempDB.newLine();
            }

            data = bacaOriDB.readLine();
        }
        // check nomor yang di pilih ada tau tidak
        if(!isFound){
            System.err.println("\nGames tidak ditemukan");
        }
        // close and flush
        outputTempDB.flush();
        outputTempDB.close();
        membuatTempDB.close();
        oriDB.close();
        bacaOriDB.close();
        System.gc();

        // ERROR TIDAK BISA DELETE FILE DATABASE DAN RENAME tempDB nya !
        // masalahnya buffered file di bagian tampilkanData() masih kebuka jadi close dulu itu dan
        // juga tutup file buffered di bagian fungsi deleteData


        // delete data original database
        database.delete();
        // rename data sementara ke nama database
        tempDB.renameTo(database);

    }

}
