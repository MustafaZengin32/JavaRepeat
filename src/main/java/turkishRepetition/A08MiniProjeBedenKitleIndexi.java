package turkishRepetition;

import java.util.Scanner;

public class A08MiniProjeBedenKitleIndexi {
    public static void main(String[] args) {
        //Kullanicidan aldigin boy kilo degerlerine gore beden kitle endeksini bulun

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kilo girin");
        int kilo=scanner.nextInt();
        System.out.print("boy girin");
        double boy=scanner.nextDouble();

        double endeks=kilo/(boy*boy);
        System.out.println(endeks);
    }
}
