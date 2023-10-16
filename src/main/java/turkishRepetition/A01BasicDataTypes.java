package turkishRepetition;

public class A01BasicDataTypes {
    public static void main(String[] args) {

        String a="Merhaba";
        System.out.println(a);

        String b="Java";
        String c="Kolay";
        System.out.println(b+c);

        int d=35;
        String e=a+d;
        System.out.println(e);

        double f=3.52;
        byte g=10;
        char h='+';
        a=a+f+g;
        System.out.println(a);

        a=a+h;
        System.out.println(a);

        String i="Java\tKolay\tDildir";//Java   Kolay	Dildir// Bir tab kadar bosluk
        System.out.println(i);

        String j="Java\nKolay\nDildir";//n new line demek yani yeni satira gec
        /*
         Java
         Kolay
         Dildir
         */
        System.out.println(j);














    }
}
