package com.tutorial;

class Data{
    public int intPublic;
    private int intPrivate;
    private double doublePrivate;
    public Data(){
        this.intPublic = 0;
        this.intPrivate = 10;
    }

    // getter
    public int getIntPrivate(){
        return intPrivate;
    }
    // setter
    public void setDoublePrivate(double value){
        this.doublePrivate = value;
    }
    public double getDoublePrivate() {
        return this.doublePrivate;
    }
}

class Lingkaran{
    private double diameter;

    Lingkaran(double diameter){
        this.diameter = diameter;
    }

    // setter 
    public void setDiameter(double jari2) {
        this.diameter = jari2 *2;
    }

    // getter
    public double getJari2(){
        return this.diameter/2;
    }

    // getter 
    public double getLuas(){
        return 3.14* Math.pow(this.getJari2(), 2);
    }

}

public class Main {

    public static void main(String[] args) {
        Data object = new Data();

        // read and write dengan menggunakan public
        object.intPublic = 5; // write
        System.out.println("public : " + object.intPublic); // read

        // read only (menggunakan getter)
        int angka = object.getIntPrivate();
        System.out.println("getter : " + angka);  
              

        // write only (hanya bisa menulis, dengan menggunakan setter)
        object.setDoublePrivate(10.5);       
        System.out.println("setter : " + object.getDoublePrivate());
        
        // setter jari-jari dari diameter
        Lingkaran object2 = new Lingkaran(5);
        System.out.println("Jari-jari : " + object2.getJari2());
        object2.setDiameter(14); // diameter
        System.out.println("Jari-jari : " + object2.getJari2());

        // Luas lingkaran
        System.out.println(object2.getLuas());
    }
}