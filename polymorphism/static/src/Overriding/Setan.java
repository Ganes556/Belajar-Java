package Overriding;

public class Setan{    
    
    public String sound(){
        return "Setan bersuara : seram";
    }
    public String caraJalan(){
        return "Cara berjalan : jalan kaki";
    }
    public void show(){
        System.out.println("\n" + this.sound());
        System.out.println(this.caraJalan());
    }

}