package turkceTekrarUdemy;

public class A02BasicDataTypes {
    public static void main(String [] args){

        int a=4;
        int b;
        b=5;
        System.out.println(a);
        System.out.println("b nin degeri: " + b + " dir");

        //int 1murat olmaz ilk harf sayi olamaz

        //tekli yorum satiri //
        //coklu yorum satiri

        /*
        dfds
        dsff
         */

        //Tamsayi veri tipleri bsil
        // (fd bc)

        //int 32 byte
        int c=4;
        System.out.println(Integer.MAX_VALUE);//2147483647 2 uzeri 31 10 basamakli
        System.out.println(Integer.MIN_VALUE); // -2147483648

        byte d=100;
        System.out.println(Byte.MAX_VALUE);// 127
        System.out.println(Byte.MIN_VALUE);//-128

        short e=100;
        System.out.println(Short.MAX_VALUE);//32767
        System.out.println(Short.MIN_VALUE);//-32768

        long f=100;
        System.out.println(Long.MAX_VALUE);// 9223372036854775807 19 basamak en yuksek deger tutan veri tipi
        System.out.println(Long.MIN_VALUE);// -9223372036854775808

        // byte -->short ->integer-->long
        //kucukten buyuge otomatik

        short j=1000;
        int i =(j/2);

        //buyukten kucuge otomatik yapmaz

        byte g=100;
        //byte h=g/2; hata verir casting yapmali
        byte h= (byte) (g/2);

        short k=100;
        byte l=2;
        int m=4;

        long n=k+l+m; // byte -->short ->integer-->long
        System.out.println(n);

        //fd float double ondalik veri tipi
        double o =5.25;
        double p=4.0;//4d

        //float r=5.0;// byte -->short ->integer-->long-->float-->double
        //Hata verir sagdan sola otomatik donusum yapamaz
        float r=(float)5.0;
        float s=5f;//Ya da float oldugunu boyle deklere ederiz
        float t=5.2f;

        int ab=22/7;
        float ac=22f/7f;//6-7 digits
        double aa=22d/7d;//15 digits

        System.out.println(ab);//3
        System.out.println(ac);
        System.out.println(aa);

        int ad=5;
        float ae=ad;// byte -->short ->integer-->long-->float-->double
        double af=ad;

        double ag=3.52;
        //float ah=ag;// byte -->short ->integer-->long-->float-->double tersine olmaz hata verir
        float ah= (float) ag;//veri kaybi olmamasi icin

        //double virgulden sonra daha fazla deger alir ayni sonucu gostermek icin

        char ba='A';
        char bb='7';
        char bc= '\u1F60';//ὠ//https://symbl.cc/tr/search/?q=Kalp+emoji//unicode

        System.out.println(bc);

        boolean ca=true;
        boolean cb=false;

        System.out.println(ca);
        System.out.println(cb);


















































    }

}
