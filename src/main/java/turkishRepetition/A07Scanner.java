package turkishRepetition;

import java.util.Scanner;

public class A07Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yas=scanner.nextInt();

        String isim=scanner.nextLine();

        System.out.println("yas:"+yas);
        System.out.println("isim"+isim);

        //Burada int 5 yazip enter a basinca java onu /n yani enter i algilayip sonraki stringi girmis kabul ediyor
        //Bu unlu hatata dumy deniyor cozmek icin araya scanner.nextLine(); yazariz
        //Bu sorun premitive den String e gecince olur









    }
}
