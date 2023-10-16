package turkceTekrarUdemy;

public class A48Exception01TryCatch {

    public static void main(String[] args) {


    //run time normal akisini bozan seyler
    //kendimiz yakalayip guvenli sekilde kullanabiliriz
    //Input Output , yakalarsak program devam edebilir aksine program durur
    //ongorup yakalarsak sorunsuz devam ederiz
    //En ustte Throwable onun altinda Exception ve Error var

    //Exception in  altinda IOException , SQL Exception,Class notFound exception,
    // RunTimeException(ArithmethikException,NullPointerException,NumberFormatException,IndexoutofBoundsException)

    //Error un altinda StackowerflowException,VirtualMachineErrorException,OutofMemoryException vardir

    //Exception turleri CheckException,UncheckedException ve Errordur
    //CheckException Runtime exception dan turemeyen her class dir IO, yakalamazsak java bunu soyler

    //UncheckedException RunTime dan turer ve java bize bunu soylemez , hatalari yakalamak developer sorumlulugunda
    //1/0 Aritmetik Exp , onceden exp atacagini bilmemiz lazim

    //String s=null; sout(s.length()); //NullPointerException null uzerinde islem yapilamaz

    //int b=12/0; ArithmeticException

    //String s="a123"; int i=Integer,parselint(s); //NumberFormatException

        //int a=30/0; //uncheck runtime exception //ArithmeticException

        //Eger yukaridaki kod yazili olsa idi zaten program orda hata verir durur alttakini okumazdi bile

        //int a1 [] = {1,2,3,4,5};
        //System.out.println(a1[6]);//ArrayIndexOutOfBoundsException

        /*
        try{
            //Exception olusabilecek kodlar
        }
        catch (Exception_Turu e){
            //Exception durumunda yapilacak islemler
        }

         */

        try{
            int a=30/0;
        }

        catch (ArithmeticException e) {//Exception yazsak da olurdu cunku super claasi ancak spesifik olsun diye direk
                                       //hangi hata ise onu yazmaliyiz

            System.out.println("sayi 0 a bolunemez");

        }

        try{
            int a []= {0,1,2,3,4};
            System.out.println(a[7]);
        }

        catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("index i bulamadi");

        }

        try{
            int a []= {0,1,2,3,4};
            System.out.println(a[8]);
        }

        catch (RuntimeException e) {//RunTimeCastException da ArrayIndexoutException in ust classidir, yazilabilir.

            //e.printStackTrace();//ArrayIndexOutOfBoundsException
                                //burda direk java nin verdigi hata mesajini yazdiririz
                                //biz RunTimeException yazmis olsak bile ayrintisini ogrenebiliriz
        }

        System.out.println("-----------------------------------------------------------------------------------------");


        try{
            int a []= {0,1,2,3,4,5};
            System.out.println(a[7]);

            int b=30/0;//burada zaten ust satirda hata buldu direk catch aradi ve ust sinif Exception oldugu icin mesaji yazdirdi
        }

        catch (Exception e) {//normalde ozelden genele yazmali //catch i yakalarsa alttakilere bakmaz

            System.out.println("hata olustu");

        }


        System.out.println("-----------------------------------------------------------------------------------------");







    }



}
