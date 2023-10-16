package turkishRepetition;

import java.util.Arrays;
import java.util.Scanner;

public class A34Arrays {
    public static void main(String[] args) {
        //Int da sadece tek deger vardi , array sayesinde coklu veri depolayabiliriz

        int x=5;

        int [] y;

        int [] b= new int[10]; //Burada 10 dan fazla veri depolanamaz , 10 ile sinirladik

        System.out.println(Arrays.toString(b));//[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        b[5]=32;
        b[0]=9;

        System.out.println(Arrays.toString(b));//[9, 0, 0, 0, 0, 32, 0, 0, 0, 0]

        int [] c= {30,40,50,60,70};

        System.out.println(Arrays.toString(c));//[30, 40, 50, 60, 70]

        System.out.println(c[0]);//30
        System.out.println(c[4]);//70
        //System.out.println(a[6]);//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
                                   // Index 6 out of bounds for length 5

        int [] a = new int [5];

        for (int i = 0; i < 5; i++){
            a[i] = i*4+2;
        }

        for (int i = 0; i <5 ; i++){
            System.out.println(a[i]);//2 6 10 14 18
        }

        Scanner scanner= new Scanner(System.in);

        int [] d=new int[5];

        for (int i = 0; i <5 ;i++){
            System.out.println("Lutfen "+(i+1)+" inci degeri girin");
            d[i] =scanner.nextInt();
        }

        for (int i = 0; i <5 ; i++){
            System.out.print(d[i] + " ");
        }

        int [] e = {10,20,30 ,40,50};
        System.out.println(e.length);


        //array i method a gonderme

        array_bastir(e);

        System.out.println(array_ortalam(e));//30.0


    }

    public static void array_bastir(int[]array){
        for(int i = 0; i <array.length; i++){
            System.out.println("element"+(i+1) + " : "+array[i]);
        }
    }

    public static double array_ortalam(int[]array){
        int sum=0;
        for(int i=0; i<array.length; i++){
            sum += array[i];

        }

        return (double) sum/array.length;



    }

}
