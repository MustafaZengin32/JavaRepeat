package turkishRepetition;

import java.util.Scanner;

public class A48Exception03Throw {

    //throw ile istedigimiz zaman kendi exception i mizi olustururuz

    public static void mekan_kontrol(int yas){
        if (yas<18){
            throw new ArithmeticException();

        }
        else {
            System.out.println("mekana hos geldin");
        }
    }

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lutfen yasinizi girin");

        int yas=scanner.nextInt();

       // mekan_kontrol(yas);//burada hata firlattigi icin try icine alinmali

        try{
            mekan_kontrol(yas);

        }

        catch (ArithmeticException e){
            System.out.println("18 den kucuksun giremezsin...");

        }

    }

}
