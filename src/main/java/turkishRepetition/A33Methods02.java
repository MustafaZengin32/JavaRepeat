package turkishRepetition;

public class A33Methods02 {

    public static void toplama1(int a, int b , int c){

        System.out.println(a+b+c);

        //return a; burada void ile return kullanilmaz cunku void sadece bisey yazdirir return etmez
    }

    public static int toplama(int a, int b , int c){

        System.out.println(a+b+c);

        return (a+b+c);
    }




    public static void main(String[] args) {
        //method in icine gonderdigimiz degerler dogrulutusunda bize deger dondurur , bunu saglayan return dur
        toplama1(1,2,3);

        //System.out.println(toplama1(1,2,3)););
        // yukarda toplama1 methodunda return olmadigi icin burda biz deger donduremedik sadece yukardaki gibi methodu
        //yazarak method ne dondurdu ise sout olmadan onu yazdirdik

        System.out.println(toplama(2, 3, 4));//Burda hata vermedi cunku return var
        //System.out.println(toplama1(););//burda hata var void var dolayisi ile return yok




    }
}
