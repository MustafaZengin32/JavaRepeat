package turkishRepetition;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class A51Set {
    public static void main(String[] args) {
        //Set Interface i implemente eden 3 class Hashset, LinkedHashSet,TreeSet
        //Collection i extend eder ve List ile ortak methodlari var
        //Set element bir elemntten sadece bitane depo eder , LinkedKist de sinir yok

        Set<String> s;

        HashSet<String> s1;
        //bellekte bir degeri hash fonk. gore depolar , belli key e gore depo eder
        //elementler ekleme sirasina gore depolamaz

        LinkedHashSet<String>s2;
        //elementleri ekleme sirasiyla depolar,bir eleman sadece bir kere depolanir

        TreeSet<String>s3;
        //elementleri alfabetik siralar

        //HashSet elementler sirali degil , hashset ile hizlica bulariz
        //TreeSet alfabetik siralar
        //LinkedHashSet ekleme sirasina gore siralar

        Set<String>set1=new HashSet<String>();
        Set<String>set2=new LinkedHashSet<String>();
        Set<String>set3=new TreeSet<String>();

        set1.add("Java");
        set1.add("Python");
        set1.add("C++");
        set1.add("JavaScript");

        set2.add("Java");
        set2.add("Python");
        set2.add("C++");
        set2.add("JavaScript");

        set3.add("Java");
        set3.add("Python");
        set3.add("C++");
        set3.add("JavaScript");

        System.out.println("*********************************");

        System.out.println("HashSet");

        for (String a:set1) {
            System.out.println(a);

        }

        System.out.println("*********************************");
        System.out.println("LinkedHashSet");

        for (String b:set2) {
            System.out.println(b);

        }

        System.out.println("*********************************");
        System.out.println("TreeSet");

        for (String c:set3) {
            System.out.println(c);

        }

        //hepsinde de ayni elementten sadece bir defa ekleyebilirim

        System.out.println(set1.contains("Go"));//false
        System.out.println(set1.contains("Java"));//true

        System.out.println(set1.isEmpty());//false

        Set<String>set4=new HashSet<String>();
        Set<String>set5=new HashSet<String>();

        set4.add("Java");
        set4.add("C++");
        set4.add("Python");
        set4.add("JavaScript");
        set4.add("Php");

        set4.add("Go");
        set4.add("Java");
        set4.add("CSS");

        //fark bulma
        //removeall

        //kesisim bulma
        //retainall

        //sirasiz olunca hashsett hizli
        //sirali degerlerde treeset daha avantajli









    }
}
