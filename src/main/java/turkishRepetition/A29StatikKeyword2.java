package turkishRepetition;

public class A29StatikKeyword2 {
    public static void main(String[] args) {

        A28StaticKeyword seyirci1 = new A28StaticKeyword("Mustafa Zengin");
        A28StaticKeyword seyirci2 = new A28StaticKeyword("Nihan Can");


        seyirci1.oyun_seyret();

        System.out.println("Seyirci Sayisi " + A28StaticKeyword.seyirci_sayisi);
        System.out.println("Seyirci Sayisi " + seyirci1.seyirci_sayisi);
        System.out.println("Seyirci Sayisi " + seyirci2.seyirci_sayisi);


        //selamla();// burada ilk asamada selamla methodu statik olmadigi icin ben direk cagiramam
        //statik methoddan statik olmayan cagirilamaz

        selamla();//asagidaki methodu method statik oldugu icin direk cagirabildik

    }
    public static void selamla(){
        System.out.println("Selamlar....");

    }
}
