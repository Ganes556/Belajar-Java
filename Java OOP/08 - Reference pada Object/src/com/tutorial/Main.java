package com.tutorial;

class Buku{
    String judul;
    String penulis;
    
    Buku(String judul, String penulis){
        this.judul = judul;
        this.penulis = penulis;
    }
    void display(){
        System.out.println("Judul\t: " + this.judul);
        System.out.println("Penulis\t: " + this.penulis);
    }
}

public class Main{
    public static void main(String[] args) {
        Buku buku1 = new Buku("Laskar Pelangi","andrea hirata");
        buku1.display();
        
        // menampilkan address
        String addressBuku1 = Integer.toHexString(System.identityHashCode(buku1));
        System.out.println(addressBuku1);

// HATI-HATI DALAM MENDUPLICATE SEBUAH OBJECT !!!        
        // assigment object
        Buku buku2 = buku1;
        buku2.display();
        String addressBuku2 = Integer.toHexString(System.identityHashCode(buku1));
        System.out.println(addressBuku2);

        // karena buku1 dan buku2 berada pada address atau referensi yang sama
        buku1.judul = "Laskar Rainbow";
        buku1.display();
        buku2.display();

        fungsi(buku2);
        buku1.display();
        buku2.display();

    }

    public static void fungsi(Buku dataBuku){
        String addressBuku2 = Integer.toHexString(System.identityHashCode(dataBuku));
        System.out.println("address dalam fungsi --> " + addressBuku2);
        dataBuku.penulis = "Andrea hinata";
    }
}