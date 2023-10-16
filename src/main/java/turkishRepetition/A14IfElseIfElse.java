package turkishRepetition;

import java.util.Scanner;

public class A14IfElseIfElse {
    //if kosul  // bir kosul saglanmazsa alttakine gecer kosul saglandigi anda o blogu calistirip cikar
    //else if baska kosul
    //else if baska kosul // sinirsiz kosul yazilabilir
    //else
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("1 ile 3 arasi islem no gir");
        int islem=scanner.nextInt();

        if (islem==1){
            System.out.println("1. islem");
        }
        else if(islem==2)
        {
            System.out.println("2. islem");
        }
        else if(islem==3){
            System.out.println("3. islem");
        }
        else {
            System.out.println("lutfen 1 ila 3 arasi bir islem no girin");
        }


    }
}
