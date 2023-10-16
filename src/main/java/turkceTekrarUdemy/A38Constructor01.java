package turkceTekrarUdemy;

public class A38Constructor01 {


        private String hesapNo;
        private double bakiye;
        private String isim;
        private String email;
        private String telefonNo;

    public A38Constructor01() {
        System.out.println("Kendi yazdigimiz constructor");

//       this.hesapNo="bilgi yok";
//       this.bakiye=0.0;
//       this.isim="bilgi yok";
//       this.email="bilgi yok";
//       this.telefonNo="bilgi yok";

        //yukaridakiler yerine this icine sirayla yazarsak hepsini yazdiri

        //this("Bilgi yok",0.0,"Bilgi yok","Bilgi yok","Bilgi yok");
    }

    public A38Constructor01(double bakiye) {
        this.bakiye = bakiye;
    }

    public A38Constructor01(String hesapNo, double bakiye, String isim, String email, String telefonNo) {
        this.hesapNo = hesapNo;
        this.bakiye = bakiye;
        this.isim = isim;
        this.email = email;
        this.telefonNo = telefonNo;

        System.out.println("coklu constructor");
    }

    public void paraYatir(double miktar){
         bakiye+=miktar;

         System.out.println("Yeni bakiye "+miktar);


     }

     public void paraCekme(double miktar){
         if(miktar>1500){
             System.out.println("cekemezsin");
         }

         if(bakiye-miktar<0){
             System.out.println("yetersiz , suanki bakiye" +bakiye);
         }

         else{
             bakiye-=miktar;
             System.out.println("yeni bakiye "+bakiye);
         }

     }

    public String getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefonNo() {
        return telefonNo;
    }

    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }
}
