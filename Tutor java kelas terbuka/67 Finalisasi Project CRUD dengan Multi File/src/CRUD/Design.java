package CRUD;

public class Design {
    public static void dekorasiMenu(){
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
    public static void dekorasiCase(String message){
        System.out.println("|==============================|");
        System.out.println("\t"+message);
        System.out.println("|==============================|\n");

    }
    static void dekorasiOutputData(boolean topAndBot){
        if (topAndBot) {
            System.out.println(" --------------------------------------------------------------------------------------------------------");
            System.out.println(" |  No\t|\tNama Games\t\t|  Tahun Terbit |\t Asal Terbit\t |\tPenerbit\t|");
            System.out.println(" --------------------------------------------------------------------------------------------------------");
        }else if(!topAndBot){
            System.out.println(" --------------------------------------------------------------------------------------------------------\n");
        }
    } // pakai default akses modifier
}
