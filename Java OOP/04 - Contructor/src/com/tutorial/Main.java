package com.tutorial;



// kelas tanpa contrictor / class polos
class Polos{
    String string;
    int integer;
}

// class dengan contructor
class Mahasiswa{
    String nama;
    int NIM;
    String jurusan;

    // contructor kelakuan mirip __init__ di python
    // dipanggil pertama saat object pertama kali dibuat
    // Mahasiswa(){
    //     System.out.println("ini adalah contructor");
    // }

    // contructor dengan parameter
    Mahasiswa(String inputNama,int inputNIM,String inputJurusan){
        nama = inputNama;
        NIM = inputNIM;
        jurusan = inputJurusan;
        System.out.println(inputNama);
        System.out.println(inputNIM);
        System.out.println(inputJurusan);
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        
        Mahasiswa mahasiswa1 = new Mahasiswa("udin maruko",1928311,"Sistem Perganjaan");
        Mahasiswa mahasiswa2 = new Mahasiswa("otong surotong",999999,"Sistem Perkentuan");
        
        // Polos polos = new Polos();
        // polos.string = "String dari polos";
        // polos.integer = 0;

        // System.out.println(polos.string);
        // System.out.println(polos.integer);

    }
}
