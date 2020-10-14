package inheritance;
public class Bebek {
    private String namaBebek;
    Bebek(String namaBebek){
        this.namaBebek = namaBebek;
    }
    public void ciriBebek(){
        Unggas.ciriUmumUnggas();
        System.out.println("Suara bebek : kuek kuek");
        System.out.println("Nama Bebek : " + this.namaBebek);
        System.out.println("lainnya : bebek memiliki selaput pada kakinya");
    }
}
