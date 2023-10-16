package turkceTekrarUdemy;

import java.util.Arrays;
import java.util.Scanner;

public class A34Arrays01 {
    public static int [] array_doldur(int sayi){

        Scanner scanner = new Scanner(System.in);

        int [] cikti = new int[sayi];

        for (int i = 0; i < sayi; i++){
            cikti[i] = scanner.nextInt();
        }
        return cikti;

    }

    public static  void array_bastir(int [] array){
        for (int i = 0; i < array.length; i++){
            System.out.println("Elemet"+(i+1)+" "+array[i]);
        }
    }

    public static void main(String[] args) {

        int [] a=array_doldur(5);

        array_bastir(a);

        //Array siralama

        int [] x={200 , 50 ,60 ,80 ,100};

        System.out.println(Arrays.toString(x));

        Arrays.sort(x);

        System.out.println(Arrays.toString(x));

        int [] a1={1,2,3,4,5};
        int [] a2={1,2,3,4,5};

        System.out.println(Arrays.equals(a1, a2));//true //yerleri farkli ama icerik ayni
        System.out.println(a1==a2);//false // bellekte farkli yer gostewrdigi icin false , burda referans kontrolu var





    }



}
