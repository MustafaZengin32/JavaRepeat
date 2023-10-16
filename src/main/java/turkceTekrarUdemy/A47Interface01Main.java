package turkceTekrarUdemy;

public class A47Interface01Main {
    public static void main(String[] args) {

       // A47Interface01 muhendis1=new A47Interface01();//interfaceden obje olusturulamaz sadece referans olur
        A47Interface01PcMuhendisi muhendis1=new A47Interface01PcMuhendisi(false,false);

        muhendis1.askerlik_durumu_sorgula();

        muhendis1.adli_sicil();

        System.out.println(muhendis1.mezuniyet_ortalamasi(3.07));

        String [] tecrube={"Havelsan","Tai","Roketsan"};

        muhendis1.is_tecrubesi(tecrube);

        A47Interface01MakineMuhendisi muhendis2=new A47Interface01MakineMuhendisi(true,false);

        String [] referans1={"Mustafa","Sertac"};

        String [] tecrube1={};

        muhendis2.adli_sicil();

        muhendis2.askerlik_durumu_sorgula();

        System.out.println(muhendis2.mezuniyet_ortalamasi(3.5));

        muhendis2.is_tecrubesi(tecrube1);//herhangi tecrubem yok

        muhendis2.referans_getir(referans1);












    }
}
