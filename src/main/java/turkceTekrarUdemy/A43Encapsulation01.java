package turkceTekrarUdemy;

public class A43Encapsulation01 {

        //bir sinifin detaylarini baska sinifta gizlemek , detaylari gizlemek , ozellikleri privat yapariz

    //degerlere sacma degerler verilebilir
    //degerlerin degeri degistirilebilir



        public String isim ;
        public int bakiye ;
        public String sehir ;


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
        System.out.println(" bakiye"+bakiye);

    }

    }


