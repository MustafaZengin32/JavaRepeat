package deutschRepatition;

import java.util.Random;

public class A05SwitchCase {
    public static void main(String[] args) {
        Random rand = new Random();
        int i = rand.nextInt(6)+1;
        String ergebnis="";

        switch (i) {
            case 0:
                ergebnis="0";
                //System.out.println("0");
                break;
            case 1:
                ergebnis="1";
                //System.out.println("1");
                break;
            case 2:
                ergebnis="2";
                //System.out.println("2");
                break;
            case 3:
                ergebnis="3";
               // System.out.println("3");
                break;
            case 4:
                ergebnis="4";
                //System.out.println("4");
                break;
            case 5:
                ergebnis="5";
                //System.out.println("5");
                break;
            case 6:
                ergebnis="6";
                //System.out.println("6");
                break;
            default:
                ergebnis="ungultig";

        }
        System.out.println(ergebnis);
    }
}
