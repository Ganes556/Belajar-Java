
class Display{
    // variable class static 
    // adalah variable yang tersetting bareng-bareng pada class ini
    static String type = "Display";
    private String name;

    Display(String name){
        this.name = name;
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

        

        // tampilkan vairable class static
        System.out.println("\nStatic variable");
        System.out.println(display1.type);
        System.out.println(display2.type);
        System.out.println(Display.type);
    }
}