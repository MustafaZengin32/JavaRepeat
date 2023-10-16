package turkishRepetition;

public class A47Interface01PcMuhendisi implements A47Interface01 {

    private boolean askerlik;

    private boolean adli_sicil;

    public A47Interface01PcMuhendisi(boolean askerlik, boolean adli_sicil) {
        this.askerlik = askerlik;
        this.adli_sicil = adli_sicil;
    }

    @Override
    public void askerlik_durumu_sorgula() {

        if (askerlik){
            System.out.println("askerlik yaptim");
        }

        else {
            System.out.println("askerlik yapmadim");
        }
    }

    @Override
    public String mezuniyet_ortalamasi(double derece) {
        return "Ortalamam: " + derece;
    }

    @Override
    public void adli_sicil() {

        if (adli_sicil){
            System.out.println("adli sicil kaydim var");
        }

        else {
            System.out.println("herhangi adli sicil kaydim yok");
        }


    }

    @Override
    public void is_tecrubesi(String[] array) {

        System.out.println("bilgisayarci olarak su sirketlerde calistim");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] );
        }
    }
}
