package turkceTekrarUdemy;

import java.util.Scanner;

public class A13IfElse1 {
    public static void main(String[] args) {

        /*
        if (kosul){
        kosul true ise bu blok calisir
        }

        else{
        bu blogun uzerindeki herhangi bir kosul calismaz ise bu blok calisir
        }
         */

        //Sayi iste 18 den kucukse mekana giremez, esit ya da buyuk ise girebilir

        Scanner scanner=new Scanner(System.in);
        System.out.println("yas giriniz");
        int yas=scanner.nextInt();

        if (yas<18){
            System.out.println("giremezsin");
        }
        else{ //tek basina else yazilmaz
            System.out.println("serbest girebilirsin");
        }


    }
}
