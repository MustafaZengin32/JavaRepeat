package turkceTekrarUdemy;

public class A43Encapsulations01B {

    private String isim;

    private int bakiye = 120;

    private String sehir;

    public A43Encapsulations01B(String isim, int bakiye, String sehir) {
        this.isim = isim;

     if (bakiye>=0 &&bakiye<=120){
         this.bakiye = bakiye;
     }
        this.sehir = sehir;
    }
    public  void dogalgaz_kullan(int miktar) {
        if (this.bakiye-miktar<0){
            System.out.println("yeterli bakiye yok");
        }
        else{
            this.bakiye-=miktar;

            if (this.bakiye<=0){
                System.out.println("bakiye bitti abone merkezone gidin kredi yukleyin, max yukleme 120 tl");
            }

            else {
                System.out.println("yeni bakiye"+bakiye);
            }
        }
    }

    public  void bakiye_ogren() {
        System.out.println(" bakiye "+bakiye);

    }
}
