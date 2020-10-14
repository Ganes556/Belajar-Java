package Overloading;
class Pejumlahan{        

    int Jumlah(int a,int b){
        return a + b;
    }

    float Jumlah(float a,float b){
        return a + b;
    }
}

public class Overloading {
    public static void main(String[] args){
        Pejumlahan jumlah = new Pejumlahan();
        System.out.println(jumlah.Jumlah(45,45));
        System.out.println(jumlah.Jumlah(43.5f,43.5f));
    }
}
