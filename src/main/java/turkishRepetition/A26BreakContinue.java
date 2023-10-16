package turkishRepetition;

import java.util.Scanner;

public class A26BreakContinue {
    public static void main(String[] args) {
        //break kirmak sonlandirmak
        //Dongu break ile karsilasirsa islem yapmadan sonlandirir kosul dogru kalmis olsa bile
        //Icinde bulundugu donguyu sonlandirir digerlerine mudahale edemez

        int i=0;

        while(i<20){
            if (i==10){
                break;
            }
            System.out.println("i = "+i);
            i++;
        }

        Scanner scanner=new Scanner(System.in);

        while(true){

            System.out.println("Sayi girin ");
            int islem=scanner.nextInt();

            if (islem==-1){
                System.out.println("Donguden cikiliyor");
                break;
            }
            System.out.println("islem "+islem);
        }

        //continue yazinca altindaki islemleri gormez onlari umursamaz direk dongu blogunun basina doner
        //sonsuz dongu tehlikesi var dikkat

        for (int j = 0; j <10;j++) {
            if (j==3||j==5){
                continue;
            }
            System.out.println("j="+j);
        }

        int k=0;

        while (k<10){
            if (k==3||k==5){
                k++;
                //continue dan once ++ yapmaz isen ifade 3 de kalir 3 de 10 dan hep kucuk oldugu icin sonsuza girer
                //bu sebeple arttiririm azaltim yapmak continue da ozellikle onemli
                continue;
            }

            System.out.println("k="+k);
            k++;

        }







    }
}
