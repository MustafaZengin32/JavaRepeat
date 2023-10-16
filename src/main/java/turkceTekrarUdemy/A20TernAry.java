package turkceTekrarUdemy;

import java.util.Scanner;

public class A20TernAry {
    public static void main(String[] args) {
        //if else switch yerine basit olanlari yazariz
        //if(a>0) {a*=2;} else {a+=10;}

        //a=       a>0       ?      a*=2 :     a+10;
        //         booelan          true ise   false ise
        //Terary sadece deger dondurur ya yazdirilmali ya da variable a atanmali
        //yazdiracaksan sorun yok ama atama yapilirsa true ve false sonuc atama yapilanla ayni olmali


        //sayi isteyin 5 e bolunurse 5 in kati , bolunemezse 5 in kati degil yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("bir tamsayi girin");
        int sayi=scanner.nextInt();

        String sonuc=(sayi%5==0)?"5 in katidir":"5 in kati degildir";

        System.out.println(sonuc);

        scanner.nextLine();
        System.out.println("bir harf girin");
        char harf=scanner.next().charAt(0);
        char  yeniharf= (harf>'a'&& harf<'z') ? (char) (harf - 32) :harf;
        System.out.println(yeniharf);




    }
}
