package turkceTekrarUdemy;

public class A46AbstractClass01Kare extends A46AbstractClass01Sekil{

    private int kenar;

    public A46AbstractClass01Kare(String isim,int kenar) {
        super(isim);
        this.kenar = kenar;
    }


    @Override
    void alan_hesapla() {

        System.out.println(getIsim()+"alani "+kenar*kenar);

    }
}
