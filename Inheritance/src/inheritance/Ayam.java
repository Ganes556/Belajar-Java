package inheritance;
public class Ayam extends Unggas{
    private String namaAyam;
    Ayam(String namaAyam){
        this.namaAyam = namaAyam;
    }
    public void ciriAyam(){
        Unggas.ciriUmumUnggas();
        System.out.println("Suara ayam : kukuruyuk");
        System.out.println("Nama Ayam : " + namaAyam);
        System.out.println("Lainnya : ayam mempunyai tanduk pada kakinya");
    }
}
