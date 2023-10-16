package deutschRepatition;

public class A13StaticKatze {

    static private String farbe="Weiss";

    private int alter;

    public static   void schnurren() {
        System.out.println("Schnurr...");

    }

    public String getFarbe() {
        System.out.println(farbe);
        return farbe;
    }

    public void setFarbe(String neufarbe) {
        farbe=neufarbe;

    }
}
