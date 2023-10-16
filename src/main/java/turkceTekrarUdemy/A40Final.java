package turkceTekrarUdemy;

public class A40Final {
    //bi kere belirledin degistiremezsin

    //public final int obje_sayisi=4;

    public final int obje_sayisi=4;


    public A40Final() {
        //obje_sayisi=5;//ilk olarak 4 verdim , final oldugu icin degismez

        //obje_sayisi=5;//hata vermez cunku final degerini ilk vermezsen  constructor icinde verebilirsin ya da ilk tanimlanirken

    }

    public void deneme() {

       // obje_sayisi=5;//burda hata alirsin cunku degeri yalniz tanimlarken ya da  constructor icinde verebilirsin

    }

    //methodlar final olursa override edilemez
    //class final ise class dan alt siniflar uretilemez
}
