package turkishRepetition;

import java.util.Scanner;

public class A33Methods {

    public static void selamlama(){
        System.out.println("merhaba nasilsiniz?");
        System.out.println("selamlar...");
    }
    //methodlar classlara ozgu

    public static void faktoriyel(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("sayi giring...");
        int sayi=scanner.nextInt();

        int faktoriyel=1;

        while(sayi>0){
            faktoriyel=sayi*faktoriyel;
            sayi--;
        }
        System.out.println("faktoriyel "+faktoriyel);


    }
    public static void main(String[] args) {
        //System.out.println("");//Aslinda buradaki println Systm class inda bir method
        //faktoriyel mesela birden cok yapicaz bu sebeple pratik olmak icin fakt. methodu olustur ve hep kullan

        /*Methodlar nasil tanimlanir:

       1/Erisim belirleyici public protected...(optional)
       2/Ekstra ozellikler static final...(optional)
       3/Donus tipi
       4/Method adi
       5/Parametreler(optional)

       //public static String testmethod("alias"){
       //method blogu
       //islemler burada
       }
         */
        selamlama();//method cagirma

        faktoriyel();

    }
}
