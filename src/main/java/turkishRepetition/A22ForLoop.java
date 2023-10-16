package turkishRepetition;

import java.util.Scanner;

public class A22ForLoop {
    public static void main(String[] args) {
        //Kullanicidan bir sayi alin ve bunun faktoreiyelini hesaplayin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi girin");

        int sayi =scanner.nextInt();

        int faktor=1;

        for (int i=1 ;i<=sayi ;i++){
            faktor*=i;

            System.out.println("faktoriye "+i+" nin degeri= "+faktor);

        }

        System.out.println("Faktoriyel "+sayi+" nin degeri=  "+ faktor);
    }
}
