package turkishRepetition;

public class A33Methods01 {

    public static void selamlama(String isim){ // parametre ve degerini gir
        System.out.println("selamlar " + isim);

    }

    public static void toplama(int a,int b,int c){
        System.out.println("toplama " + (a + b + c));


    }
    public static void main(String[] args) {

        selamlama("Murat");

        selamlama("Ayse");

        toplama(3,4,5);
    }


}
