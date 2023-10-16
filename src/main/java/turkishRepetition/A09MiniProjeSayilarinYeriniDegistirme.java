package turkishRepetition;

import java.util.Scanner;

public class A09MiniProjeSayilarinYeriniDegistirme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ilk sayiyi gir: ");
        int ilk=scanner.nextInt();
        System.out.print("Ikinci sayiyi gir: ");
        int ikinci=scanner.nextInt();

        System.out.println("ilk sayi: "+ilk+" ikinci: "+ikinci);

        int geciciilk=ilk;
        ilk=ikinci;
        ikinci=geciciilk;

        System.out.println("degistirilmis ilk: "+ilk+" degistirilmis ikinci: "+ikinci);

    }
}
