package turkceTekrarUdemy;

import java.util.Scanner;

public class A15IfElseIf {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Notunuzu girin");
        int not=scanner.nextInt();

        if (not>=90){
            System.out.println("AA");
        }
        if(not>=80) {
            System.out.println("BB");
        }
        if(not>=70){
            System.out.println("CC");
        }
        else {
            System.out.println("kaldiniz");
        }
        //sadece if ile else ayrilir
        //if ler arasinda ayrim yapmaz kosulu sagliyorsa hepsini calistirir

    }
}
