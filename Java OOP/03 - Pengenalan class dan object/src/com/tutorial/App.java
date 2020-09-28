package com.tutorial;

// membuat class sebagain template
class Mahasiswa{
    int NIM;
    String nama;
    String jurusan;
    String alamat;
    
}
public class App {
    public static void main(String[] args) throws Exception {
        // instansiasi / membuat object 
        Mahasiswa mahasiswaStikom = new Mahasiswa();
        mahasiswaStikom.NIM = 200030794;
        mahasiswaStikom.nama = "I Gusti Agung Ganes Satsangga Dipa";
        mahasiswaStikom.jurusan = "Sistem Informasi";
        mahasiswaStikom.alamat = "Jln. Majapahit, Gria Sekawan, D4";

        System.out.println("\n***MAHASISWA STIKOM***");
        System.out.println("[1] " + mahasiswaStikom.NIM);
        System.out.println("[2] " + mahasiswaStikom.nama);
        System.out.println("[3] " + mahasiswaStikom.jurusan);
        System.out.println("[4] " + mahasiswaStikom.alamat + "\n");

        mahasiswaStikom.NIM = 200010059;
        mahasiswaStikom.nama = "I Gusti Agung Ganes Satsangga Dipa2";
        mahasiswaStikom.jurusan = "Sistem Komputer";
        mahasiswaStikom.alamat = "Jln. Majapahit, Gria Sekawan, D5";
        
        System.out.println("[1] " + mahasiswaStikom.NIM);
        System.out.println("[2] " + mahasiswaStikom.nama);
        System.out.println("[3] " + mahasiswaStikom.jurusan);
        System.out.println("[4] " + mahasiswaStikom.alamat + "\n");



    }
}
