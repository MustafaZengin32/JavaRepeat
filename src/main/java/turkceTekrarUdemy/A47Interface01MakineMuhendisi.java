package turkceTekrarUdemy;

public class A47Interface01MakineMuhendisi implements A47Interface01{

    private boolean askerlik;

    private boolean adli_sicil;

    public A47Interface01MakineMuhendisi(boolean askerlik, boolean adli_sicil) {
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

        if (array.length==0){
            System.out.println("herhangi tecrubem yok");
        }

        else {
            System.out.println("makine muh olarak buralarda calistim");

            for (int i = 0; i <array.length;i++){
                System.out.println(array[i]);

            }

        }

    }

    public void referans_getir(String [] array){

        if (array.length==0){
            System.out.println("herhangi referansim  yok");
        }

        else {
            System.out.println("referanslarim... ");

            for (int i = 0; i <array.length;i++){
                System.out.println(array[i]);

            }

        }

    }
}
