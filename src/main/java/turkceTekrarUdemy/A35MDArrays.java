package turkceTekrarUdemy;

import java.util.Arrays;

public class A35MDArrays {
    public static void main(String[] args) {
        int [] a ={1,2,3,4,5,6};

        int [][] a2=new int [2][2];

        System.out.println(Arrays.toString(a));//[1, 2, 3, 4, 5, 6]

        a2 [0][0]=10;
        a2 [0][1]=20;
        a2 [1][0]=30;
        a2 [1][1]=40;


        int [][] array2={{10,20},{30,40}};
        System.out.println(array2[0][1]);//20

        for (int i=0; i<array2.length; i++){
            for (int j=0; j<array2.length;j++){
                System.out.print(array2[i][j]+" ");
            }
            System.out.println();
        }













    }
}
