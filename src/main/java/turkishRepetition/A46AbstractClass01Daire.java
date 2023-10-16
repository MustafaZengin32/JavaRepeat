package turkishRepetition;

public class A46AbstractClass01Daire extends A46AbstractClass01Sekil {

    private int  yaricap;

    public A46AbstractClass01Daire(String isim,int yaricap) {
        super(isim);
        this.yaricap=yaricap;
    }


    @Override
    void alan_hesapla() {

        System.out.println(getIsim()+"alani"+ Math.PI*yaricap*yaricap);

    }
}
