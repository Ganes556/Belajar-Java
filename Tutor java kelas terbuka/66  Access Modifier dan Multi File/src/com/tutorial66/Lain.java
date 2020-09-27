package com.tutorial66;

public class Lain {
    // bagian ini dapat dipangil dimana saja
    public static void methodPublic(){
        System.out.println("Lain:Public");
    }
    // ini hanya bisa diakses oleh class yang bersangkutan
    private static void methodPrivate(){
        System.out.println("Lain:Public");
    }
    // ini hanya bisa diakses di package yang sama
    static void methodDefault(){
        System.out.println("Lain:Default");
    }
    // ini hanya bisa diakses oleh dalam package yang sama dan subclassnya
    protected static void methodProtected(){
        System.out.println("Lain:Protecte");
    }
}
