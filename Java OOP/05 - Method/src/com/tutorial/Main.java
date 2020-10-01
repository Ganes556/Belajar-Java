package com.tutorial;

class Mahasiswa{
    String nama = "nama Asli";
    String NIM;

    // contructor
    Mahasiswa(String nama, String NIM){
        this.nama = nama;
        this.NIM = NIM;
    }

    // method tanpa return dan tanpa parameter
    void show(){
        System.out.println("Nama: " + this.nama);
        System.out.println("NIM: " + this.NIM);
    }

    // method tanpa return dan dengan parameter
    void setNama(String nama){
        this.nama = nama;
    }

    // method dengan tapi tidak ada prameternya
    String getNama(){
        return this.nama;
    }
    String getNIM(){
        return this.NIM;
    }

    // method dengan retern dan parameter
    String sayHai(String message){
        return message + " juga, " + " nama saya adalah " + this.nama;
    }
}
class Dosen{
    String nama;
     // contructor
     Dosen(String namanya){
         this.nama = namanya;
     }
}
public class Main{
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("ucup","20001909");
        // method
        mahasiswa1.show();
        mahasiswa1.setNama("Hujingan");
        mahasiswa1.show();
        
        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa1.getNIM());

        String data = mahasiswa1.sayHai("Hallo bro");
        System.out.println(data);

        // karna methodnya tidak static otomatis class lain tidak bisa memanggilnya
        // Dosen dosen = new Dosen("condek mas");
        // System.out.println(dosen.);  --> tidak ada 
    }
}