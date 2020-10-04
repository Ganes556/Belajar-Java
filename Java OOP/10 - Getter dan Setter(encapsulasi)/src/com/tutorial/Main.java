package com.tutorial;

class Data{
    public int intPublic;
    private int intPrivate;

    public Data(){
        this.intPrivate = 0;
        this.intPrivate = 0;
    }

    // getter
    public int getIntPrivate(){
        return intPrivate;
    }
}

public class Main {

    public static void main(String[] args) {
        Data object = new Data();

        // read and write dengan menggunakan public
        object.intPublic = 10; // write
        System.out.println(object.intPublic); // read

        // read only (menggunakan getter)
        System.out.println(object.getIntPrivate());        
    }
}