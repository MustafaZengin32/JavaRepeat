package turkceTekrarUdemy;

public class A23StringManipulations {
    public static void main(String[] args) {

        String a="Mustafa";

        String b=new String("Mustafa");

        System.out.println("Harf sayisi"+ b.length());

        System.out.println("Sifirimci index"+b.charAt(0));

        System.out.println("Son eleman"+b.charAt(b.length()-1));

        for (int i=0; i<b.length(); i++){
            System.out.println(b.charAt(i));
        }

        System.out.println(b.startsWith("Mu"));

        System.out.println(b.indexOf("a"));

        System.out.println(b.indexOf("b"));

        System.out.println(b.lastIndexOf("a"));//Mustafa //6

        System.out.println(b.toLowerCase()); //mustafa

        String c="1923";

        int d= Integer.parseInt(c); //String i integer a cevir

        System.out.println(d);

        int e=1905;

        String f=String.valueOf(e); // Int i String e cevirme

        String a1="Alice";

        String a2="Alice";

        //Burada esit olur  iki string ayni yer tek obje olusturur java

        if (a1==a2){
            System.out.println("Esitler");
        }



        String b1 =new String("Ali");

        String b2 =new String("Ali");

        //Burada farkli objeler oldugu icin icerikler ayni olsada esit olmaz

        if (b1==b2){
            System.out.println("Esitler");
        }

        //Ama biz bu farkli objeleri equals olarak tanimlar isek icerigi kontrol ettigi icin esittir

        if (b1.equals(b2)){
            System.out.println("Bu sefer esitir");
        }











    }
}
