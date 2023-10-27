package turkishRepetition;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class A49JavaFileOutputStream {//Dosyaya veri yazmak
    public static void main(String[] args) {

        //Java input output Api , dosyadan veri almak veri yazdirmak icin kullanilir
        //Java I , O islemlerini hizlandirmak icin Streamleri kullanir
        //Stream , Verilerin I ve O yoluyla Javaprojelrine aktigi veri dizisidir
        //Javada 3 tane hazir stream System.out , System.in ve System.err

        //Output Stream uygulamalari bir dosyaya Stream halinde yazmak icin kullanilir
        //methodlari : write , flush , close

        //Input Stream uygulamalari bir dosyadan veriyi Stream halinde okumak icin kullanilir
        //methodlari : read , available,close( read da dosya yoksa -1 doner)

       //Source ---- 1010101010(InputStream--Java App---101010101(OutputStream)--Destination

        FileOutputStream fos=null;


        try {
            fos=new FileOutputStream("src/main/java/turkishRepetition/dosya",true);
            //bu sekilde true yazarsak ekleme devam eder

//            fos.write(65);
//            fos.write(73);

            byte [] array={101,75,66,68};//bu sekilde byte array i de yazabiliriz
            fos.write(array);

            String s="Mustafa";
            byte[] array1=s.getBytes();
            fos.write(array1);//bu sekilde byte array olark yazarsak Mustafa yi yazabiliriz
            //dosyaya veri yazdirmak istersek mutlaka bu sekilde yazmaliyyiz cunku stream byte okur



        } catch (FileNotFoundException e) {
            System.out.println("file not found exp olustu");
        } catch (IOException e) {
            System.out.println("dosyaya yazilirken hata olustu");
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                System.out.println("dosya kapatilirken bir hata olustu");
            }
        }


    }
}
