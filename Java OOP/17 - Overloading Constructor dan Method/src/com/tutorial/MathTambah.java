package com.tutorial;
class MathTambah{
    // overloading pada method static
    protected static int tambah(int a, int b){
        return a + b;
    }

    protected static double tambah(int a, double b){
        return a + b; // int + double = double; ok
    }
}