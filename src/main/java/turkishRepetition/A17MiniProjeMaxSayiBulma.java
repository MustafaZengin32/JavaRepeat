package turkishRepetition;

import java.util.Scanner;

public class A17MiniProjeMaxSayiBulma {
    public static void main(String[] args) {
        //Kullanicidan alinan 3 sayidan en buyuk olani bulun

        Scanner scanner = new Scanner(System.in);
        System.out.println("3 adet sayi girin");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        //a=b=c ise hepsi birbirine esit else olarak yaz
        // a>b ve a>c ise en buyuk a
        //b>a ve b>c ise en buyuk b
        //c>a ve c>b ise en buyuk c

        if (a > b && a > c) {
            System.out.println("en buyuk a = "+a);
        } else if (b > a && b > c) {
            System.out.println("en buyuk b= "+b);
        } else if (c > a && c > b) {

                System.out.println("en buyuk c= "+c);
            }
        else{
                System.out.println("sayilar birbirine esit");
            }



    }
}


