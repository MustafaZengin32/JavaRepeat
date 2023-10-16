package deneme;

//import turkceTekrarUdemy.A32AccessModifier01Araba;

import turkceTekrarUdemy.A32AccessModifier01Araba;

public class AccessModifier {
    public static void main(String[] args) {


        //A32AccessModifier01Araba araba1=new A32AccessModifier01Araba();
        // System.out.println(araba1.model);//A32 default yapildiginda burasi paket disi oldugu icin erisemedi
        //}

        A32AccessModifier01Araba araba=new A32AccessModifier01Araba();
        System.out.println(araba.model);
        System.out.println(araba.renk);
        System.out.println(araba.yil);

        //System.out.println(araba.ureticiulke);//privat oldugu icin ulasamadim
        //System.out.println(araba.alici);//privat oldugu icin ulasamadim
        //hem farkli paket hem farkli class

       // System.out.println(araba.ekranboyutu);
       // System.out.println(araba.sportiflik);//Hata aliriz cunku bu degerler default ve farkli pakette

        //System.out.println(araba.sessistemi);
        //System.out.println(araba.bilgisayarmarkasi);//deger protected ve farkli pakette oldugumuz icin ulasamadik




    }
}