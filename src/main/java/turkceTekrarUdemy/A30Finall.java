package turkceTekrarUdemy;

public class A30Finall {

    //public final class A30Finall { //sayet class i final yaparsak ondan hicbir alt sinif turetemeyiz


    public final int obje_sayisi;

    public A30Finall() {
        obje_sayisi=4;//bu sekilde yukarida deger vermeyip constructor da  deger verince de calisir
                      //ya da direk consructor icinde hem tanimlayip hem de deger verilebilir
    }

    public void deneme(){
        //obje_sayisi=4;burada yukarida deger vermeyip herhangi methodda da deger atanamaz constructor olmali
    }

        //final yazilan degere sadece 1 ozellik veriliyor
        //ya tanimlanirken ya da obje olustururken constructor icinde degeri verilir
        //herhangi fonksiyon da verilmez
        //degistirilmesini istemediginiz ornek db sifresi

        // public final int obje_sayisi; //burda hata verir degeri tanimlanirken ya da consrtructorda vermeliyim

        //public final int obje_sayisi=4;//burasi sorunsuz calisir tanimlanirken deger verdik

    //final tanimladigin degerlerin getter setterleri cikmaz

    //public static final // tum classlardan ulasirim //obje olusturmadan sinif ismi ile ulasirim //degerini degistiremem

    public final void baglantikur(String username,String password) {
        System.out.println(username);
        System.out.println(password);

        //Burada methodumun override edilmesini istemiyorsam final yazarim
    }



    public  void baglantikur1(final String username1,final String password1) {

        //username1="root2"; //hata verir verdigin final degeri method icinde degistiremezsin hata verir

        System.out.println(username1);
        System.out.println(password1);

        //Burada methodumun override edilmesini istemiyorsam final yazarim
    }














}
