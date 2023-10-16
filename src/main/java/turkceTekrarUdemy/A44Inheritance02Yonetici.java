package turkceTekrarUdemy;

public class A44Inheritance02Yonetici  extends A44Inheritance01Calisan{  //sub class alt sinif

    private int sorumlukisi;
    public A44Inheritance02Yonetici(String isim, int maas, String departman,int sorumlukisi) {
        super(isim, maas, departman);//this yazinca olmaz cunku private , bizim dolayli yoldan almamiz lazim
                                     //Calisan sinifi zaten super class di o sebeple super yazarsak ulasiriz
                                     //miras almak icin  constructor olusturmak sart

        this.sorumlukisi=sorumlukisi;//bu sekilde ekstra ozellik ekleyebiliriz, bunu da constructor icine yazmaliyiz
    }

    public void zam_yap(int zam_miktari){
        System.out.println("Calisanlara "+zam_miktari+"zam yapildi ");
    }

    public void bilgilerigoster(){//normalde bu methodu miras almistik ancak kendi icimizde tekrar tanimlarsak
                                 // kendi methodumuz kullanilir ,Test sinifindan cagirirsak bunu gosterir
        System.out.println("isim "+getIsim());
        System.out.println("maas "+getMaas());
        System.out.println("departman "+getDepartman());

        //ancak tekrar calisan methodundakini kullanmak istersem super.bilgilerigoster yazmam gerekir
        System.out.println("sorumlu kisi sayisi "+this.sorumlukisi);

    }
}
