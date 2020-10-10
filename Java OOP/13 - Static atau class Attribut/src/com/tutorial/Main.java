
class Display{
    // variable class static 
    // adalah variable yang tersetting bareng-bareng pada class ini
    static String type = "Display";
    private String name;

    Display(String name){
        this.name = name;
    }
    void setType(String setType){
        // type = setType; // alternatif 1
        // this.type = setType; // alternatif 2
        Display.type = setType; // alternatif 3, recomended
    }

    public void show(){
        System.out.println(this.name);
    }
}
public class Main{
    public static void main(String Args[]){
        Display display1 = new Display("yuyun");
        display1.show();

        Display display2 = new Display("yuyun2");
        display2.show();

        // rubah variable static dari luar
        display1.setType("Monitoro22 !");
        // tampilkan vairable class static
        System.out.println("\nStatic variable");
        System.out.println(display1.type);
        System.out.println(display2.type);
        System.out.println(Display.type);
    }
}