package turkishRepetition;

import java.io.IOException;
import java.util.Scanner;

public class A48Exception04Throws {

    //check exception ise altini cizer ve bizden methoda throws eklemeye zorlar

    public static void mekan_kontrol(int yas) throws IOException {
        if (yas<18){
            throw new IOException();//bunu check yaptigim icin methoda throws ekletti

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

        try {
            mekan_kontrol(yas);//ayni method oldugu icin uyari verdi ve try catch ya da throws a zorladi
        } catch (IOException e) {
            System.out.println("IO exp olustu");
        }

        //bunu try catch ile sarmayip methoda throws eklersek biz yakalayamayiz ama api yapan sonradan yakalar




    }

}
