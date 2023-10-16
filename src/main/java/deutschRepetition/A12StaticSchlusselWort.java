package deutschRepetition;

public class A12StaticSchlusselWort {

    int value=10;

    static int value1=10;

    //static = Objekt unabhangigkeit


    public static void main(String[] args) {

        //System.out.println(value);wir konnen nicht zu value zugreifen

        A13StaticKatze.schnurren();//Schnurr
        System.out.println(value1);//10

        A13StaticKatze katze = new A13StaticKatze();

        A13StaticKatze katze2 = new A13StaticKatze();

        katze.getFarbe();//weiss
        katze2.getFarbe();//weiss
        katze.setFarbe("schwarz");
        katze.getFarbe();//schwarz
        katze2.getFarbe();//schwarz





    }
}
