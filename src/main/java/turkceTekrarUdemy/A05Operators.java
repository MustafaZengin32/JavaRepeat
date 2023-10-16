package turkceTekrarUdemy;

public class A05Operators {
    public static void main(String[] args) {
        //+ - / * %
        System.out.println(3+4.2);
        System.out.println(10/4.0);
        System.out.println(10%4);//kalan modulus

        int a=4;
        a=a+2;
        //a+=2;
        a*=2;

        System.out.println(a);

        int b=6;
        b--;//post x
        //b-=1; // Yukardaki ile ayni
        System.out.println(b);

        int c=7;
        System.out.println(c++);//7 Henuz guncellenmedi
        System.out.println(c);//8

        int d=8;
        System.out.println(++d);//9 pre x

        System.out.println(3+4*5);//23
        //bolme ile carpma onceligi yok soldan saga okur//Bu sebeple parantez kullanmak onemli











    }
}
