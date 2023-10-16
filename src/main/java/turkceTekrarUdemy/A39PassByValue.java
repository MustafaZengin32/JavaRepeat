package turkceTekrarUdemy;

import java.util.Arrays;

public class A39PassByValue {
    public static void main(String[] args) {
        String str="Java";

        int [] arr={1,2,3};

        method1(str);

        method2(arr);

        System.out.println(Arrays.toString(arr));//[1, 4, 3]
        //Burasi icerigi degistirir cok boyutlu

        method3(arr);

        System.out.println(Arrays.toString(arr));//[1, 4, 3]
        //Burda referans degisti icerik degil o sebeple arr ayni yukardaki gibi kaldi

        System.out.println(str);//Java


    }

    public static void method3(int [] arr){
        int [] yeniarr={10 , 11, 12, 13};
        arr=yeniarr;

    }

    public static void method2(int [] arr){
        arr[1]=4;
        arr[2]=3;
    }

    public static void method1(String str){
        str=str.toUpperCase();

    }


}
