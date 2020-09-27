package com.tutorial66;
import vaksion.util.tvindo;
public class Main {
    public static void main(String[] args) {
        // public, private, default, protected

        // dengan access modifier public dapat di akses
            Lain.methodPublic();

        // dengan access modifier private tidak dapat di akses
            // Lain.methodPrivate();

        // dapat di akses, karna dalam package yang sama
            Lain.methodDefault();
            Lain.methodProtected();

        // memanggil method public dari package yang berbeda
            tvindo.devisi1Public();
            // tvindo.devisi2Private(); tidak bisa
            // tvindo.devisi3Default(); tidak bisa
            // tvindo.devisi4Protected(); tidak bisa

    }

}
