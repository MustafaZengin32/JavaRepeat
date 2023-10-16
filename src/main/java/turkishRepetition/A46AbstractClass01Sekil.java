package turkishRepetition;

public abstract class A46AbstractClass01Sekil {

    //mutlaka override edilmesi gereken methodlari bir class da biriktirip daha sonra bu classs dan alt classlar uretmek
    //istersek abstrakt class kullanilir

    //abstract class dan objeler olusturamayiz

    //referansi alt classlara referans olabilir

    //hem govdeli hem govdesiz methodlar birarada olabilir , hem soyut hem somut

    //ozellik eklenebilir

    //bir class in abstract olmasi en az bir tane soyut method olmali

    //method abstract olarak tanimlamali ki alt sinifta mutlaka kullanilsin

    //override edilmesine gerek kalmayan methodlari somut yazabiliriz

    private String isim;

    public A46AbstractClass01Sekil(String isim) {
        this.isim = isim;
    }

    public void ismin_soyle(){

        System.out.println("bu obje "+isim+" objesidir");
    }

    abstract void alan_hesapla();

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}
