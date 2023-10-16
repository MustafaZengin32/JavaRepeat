package turkceTekrarUdemy;

public class A28StaticKeyword {

    //simdiye kadar objeye bagli methodlar kullandik , ulasmak icin obje olusturmak gerekirdi
    //statik anahtar sinifa bagli oluyor obje olusturmaya gerek yok
    //sinifa bagli oldugu icin sadece ir kere olusturmak yeterli olacak
    //statik bellekte bidefa olusur bu sebeple degisiklikle beraber artar sifirlanmaz



    //private String isim;
    private static String isim;

    public static int seyirci_sayisi;

    public A28StaticKeyword(String isim) {
        this.isim = isim;

        seyirci_sayisi++;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void oyun_seyret(){
        System.out.println(isim+" oyun seyrediyor");

    }

    public static int getSeyirci_sayisi() {

        //System.out.println(isim);//burada ilk olarak isim degiskeni statik olmadigi icin
        // sen burada statik bir methoddan statik olmayan bir degiskeni cagiramazsin

        System.out.println(isim);//ancak simdi yukaridaki isim degiskenini statik yaptigin icin
                                 //direk ulasabilirsin

        return seyirci_sayisi;
    }
}
