package turkishRepetition;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class A49JavaFileInputStream {//Dosyalardan veri almak

    public static void main(String[] args) {

        FileInputStream fis=null;

        try {
            fis=new FileInputStream("src/main/java/turkishRepetition/dosya1");

            //System.out.println("birinci karakter "+  (char) (fis.read()));//fis.read byte olark okudugu icin char cast yapmaliyiz
            //System.out.println("ikinci karakter "+  (char) (fis.read()));
            //bu sekilde sira ile okur , deger kalmaz ise -1 doner

            //ortadan biyer okumak istersem kacinci oldugunu bul ve oncesini skip et

            //fis.skip(5);
            //System.out.println("ilk besi atla  "+  (char) (fis.read()));

            //tum dosyayi okumak istersem while dongusu yapabiliriz , -1 ise deger kalmadi demektir

            int deger;

            String s="";

            while ((deger = fis.read()) != -1) {

                s+=(char)deger;

            }

            System.out.println("dosya icerigi "+s);



        } catch (FileNotFoundException e) {
            System.out.println("file bulunamadi");
        } catch (IOException e) {
            System.out.println("dosya okunurken hata olustu");
        } finally {
            try {
                if (fis != null){
                    fis.close();
                }

            } catch (IOException e) {
                System.out.println("dosya kapatilirken hata olustu");
            }
        }


    }

}
