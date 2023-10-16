package turkceTekrarUdemy;

public class A44Inheritance01Calisan { //super class ya da base class
    //bir sinifin baska siniftran ozellikleri  ve methodlari miras almak
    //ortak ozellikleri tek tek tanimlamak yerine bir siniftan onu cekmek
    //is-a inheritance

    private String isim;

    private int maas;

    private String departman;

    public A44Inheritance01Calisan(String isim, int maas, String departman) {
        this.isim = isim;
        this.maas = maas;
        this.departman = departman;
    }

    public void calis(){
        System.out.println("Calisan calisiyor...");
    }
    public void bilgilerigoster(){
        System.out.println("isim "+isim);
        System.out.println("maas "+maas);
        System.out.println("departman "+departman);

    }

    public void departmandegistir(String yenidepartman){
        System.out.println("departman degisiyor...");
        this.departman=yenidepartman;

        System.out.println("yeni departman "+this.departman);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }
}
