package turkishRepetition;

import java.util.Scanner;

public class A18MiniProjeKitleEndexi {
    public static void main(String[] args) {
        //index=kilo/boy*boy
        //index<18.5 zayif
        //18.5<index<25 normal
        //25<index<30 fazla kilolu
        //index>30 obez

        Scanner scanner=new Scanner(System.in);
        System.out.println("kilonuzu girin");
        double kilo=scanner.nextDouble();
        System.out.println("boyunuzu girin");
        double boy=scanner.nextDouble();

        double index=kilo/(boy*boy);

        if (0<index && index > 18.5) {
            System.out.println("zayif");
        }
        else if (18.5<=index && index<25){
            System.out.println("normal");

        }
        else if (index>=25 && index<30){
            System.out.println("fazla kilolu");
        }
        else if(index>=30){
            System.out.println("obez");
        }
        else{
            System.out.println("hatali giris yeniden deneyin");
        }
    }
}
