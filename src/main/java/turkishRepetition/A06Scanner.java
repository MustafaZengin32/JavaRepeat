package turkishRepetition;

import java.util.Scanner;

public class A06Scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Yas girin");
        int yas=scanner.nextInt();
        //double yas1=scanner.nextDouble();
        //byte yas2=scanner.nextByte();
        //String yas3=scanner.nextLine();
        //int  degere int yerine String girersen InputMissmatchException verir
        System.out.println(yas);

        System.out.println("ikici veriyi girin");

        if (scanner.hasNextInt()){  //InputMissmatchException i cozmek icin if else yaptik
            int sayi=scanner.nextInt();
            System.out.println(sayi);
        }
        else {
            System.out.println("lutfen sayi girin");
        }










    }
}
