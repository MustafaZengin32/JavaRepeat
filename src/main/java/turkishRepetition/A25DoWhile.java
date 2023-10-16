package turkishRepetition;

public class A25DoWhile {
    public static void main(String[] args) {
        /*
        do{
        /Kosul dogru oldugu surece calisir
        //while an farki en az bikere calisir kosul dogru olsa ya da olmasa bile
        }
        while(kosul);

         */

        int i=0;

        do{
            System.out.println("i="+i);
            i++;
        }while(i<5);

        int j=0;

        while(j<5){
            System.out.println("j="+j);
            j++;
        }

        //sayinin rakamlari toplami

        int sayi=365;
        int sum=0;

        do{
            sum=sum+sayi%10;
            sayi/=10;

        }while(sayi>0);

        System.out.println(sum);
    }
}
