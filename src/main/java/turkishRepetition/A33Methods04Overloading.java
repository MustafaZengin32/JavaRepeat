package turkishRepetition;

public class A33Methods04Overloading {

    public static void toplama(String a,String b){
        System.out.println("2 sinin  toplamai "+a+b);
    }

    public static void toplama(int a,int b){
        System.out.println("2 sinin toplami "+(a+b));
    }

    public static void toplama(int a,int b,int c){
        System.out.println("3 unun toplamai "+(a+b+c));
    }

    public static void main(String[] args) {

        toplama(1,2,3);
        toplama(3,5);
        toplama("ALi ","Mustafa");
        //methodu birden fazla sekilde cagirma , ancak donus tipi vb degisince ismi ayni kalsa bile hata vermez
        //buna method overloading denir

    }

}
