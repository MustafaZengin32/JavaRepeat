package turkceTekrarUdemy;

import java.util.Scanner;

public class A16SwitchCase {

    public static void main(String[] args) {
        /*
        switch (0==0){

            case durum1:
                islemler
                        break;
            case durum2:
                islemler
                        break;
            default:
                islemler
                        break;

        }

        */
        Scanner scanner = new Scanner(System.in);
        int islem=scanner.nextInt();

        switch (islem){  //islem burada bir kosul degil bir deger , deger case lerden birine esit oldugunda o degeri iceren
                         //case in icindeki kodu calistirir.Break yoksa break gorene kadar devam eder(default dahil)
                         //break gorunce donguyu kirar

            case 1:
                System.out.println("1.islem");
                //break;
            case 2:
                System.out.println("2.islem");
                //break;
            case 3:
                System.out.println("3.islem");
                //break;
            default:
                System.out.println("Gecersiz islem");
                //break;
        }


    }
}
