package turkceTekrarUdemy;

public class A44Inheritance05Kopek extends A44Inheritance04Hayvan{

    private int dis_sayisi;

    public A44Inheritance05Kopek(String isim, int kilo, int boy, int bacak_sayisi, int dis_sayisi) {
        super(isim, kilo, boy, bacak_sayisi);
        this.dis_sayisi = dis_sayisi;
    }

    public int getDis_sayisi() {
        return dis_sayisi;
    }

    public void setDis_sayisi(int dis_sayisi) {
        this.dis_sayisi = dis_sayisi;
    }

    public void kos(int hiz) {
        System.out.println("kopek kosuyor");
        super.harekete_gec(hiz);
    }
}
