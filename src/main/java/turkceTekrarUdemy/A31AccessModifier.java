package turkceTekrarUdemy;

 public class A31AccessModifier { // Bu public

    //class A31AccessModifier { //Bu default  //privat ve protected kullanilamaz




    /*
    public paket ici paket disindan ulasilabilir
    default sadece ayni paketten ulasilabilir , hicbirsey yazmazsak default olur
    protected ve privat class icin kullanilamaz

    privat a sadece ayni class dan ulasilabilir paket ici ya da disi fark etmez

    protected default gibi ayni paketten erisebilir , farkli olarak bunun alt classi ise paket disindan
    oda ulasabilir




     */

     public static void main(String[] args) {
         A32AccessModifier01Araba araba=new A32AccessModifier01Araba();
         System.out.println(araba.model);
         System.out.println(araba.renk);
         System.out.println(araba.yil);//

         //System.out.println(araba.ureticiulke);//privat oldugu icin ulasamadim
         //System.out.println(araba.alici);//privat oldugu icin ulasamadim

         System.out.println(araba.ekranboyutu);
         System.out.println(araba.sportiflik);//sorun yok default olsa da bu degerler ayni pakette

         System.out.println(araba.sessistemi);
         System.out.println(araba.bilgisayarmarkasi);//sorun yok cunku deger protected ve ayni paketteyiz




     }

}
