package turkishRepetition;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class A50LinkedList01 {
    public static void main(String[] args) {
        //framework onceden hazirlanmis kutuphanelerin oldugu , yenilerinin eklenebilecegi yapilardir
        // jango , spring ... java framework

        //Collectionframework verileri gruplar halinde tutmak , farkli benzer turden objeler
        //iCINDE BIRCOK METHOD VE CLASSLAR VAR
        //Verilerin liste halinde tutulmasi icin List Interface
        //Itarable --> Collection-->List ,Queue,Set ........ Map Interface Farkli ama burda siniflandirilmis

        //ArrayList

        //ArrayList <String> arraylist=new ArrayList<String>();//public class ArrayList<E> extends AbstractList<E>implements List<E>,
        //public interface List<E> extends Collection<E>
        //public interface Collection<E> extends Iterable<E>


        List<String> list = new ArrayList<String>();//list referansi kullandim

        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println(list.get(0));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }

        System.out.println("***********************");

        for (String s : list) {
            System.out.println(s);
        }

        list.remove(0);

        System.out.println("***********************");


        for (String s : list) {
            System.out.println(s);
        }

        LinkedList<Integer> linkedList = new LinkedList<>();//veriler referanslarla birbirine baglanir

        ArrayList<Integer> arrayList1 = new ArrayList<>();//veriler sirali olarak siralanir


        zamanhesapla("LinkediList", linkedList);
        zamanhesapla("ArrayList",arrayList1);
        //LinkediList ekleme suresi 216
        //ArrayList ekleme suresi 269  burada arraylist biraz daha hizli cunku direk sona ekliyor
        //LinkediList ekleme suresi yavas cunku siralayip aralarinda referans kurup ekliyor

        zamanhesapla1("LinkediList", linkedList);
        zamanhesapla1("ArrayList",arrayList1);// Buradada list ddaha hizli ilk eleman olarak ekledik



    }

        public static void zamanhesapla(String veri_tipi, List<Integer> list){

        long basla;

        long bitis;

        basla=System.currentTimeMillis();

            for (int i = 0; i <1000000 ; i++) {
                list.add(i);
            }
        bitis=System.currentTimeMillis();

            System.out.println(veri_tipi+" ekleme suresi "+(bitis-basla));

        }

    public static void zamanhesapla1(String veri_tipi, List<Integer> list){

        long basla;

        long bitis;

        basla=System.currentTimeMillis();

        for (int i = 0; i <1000000 ; i++) {
            list.add(0,i);
        }
        bitis=System.currentTimeMillis();

        System.out.println(veri_tipi+" ekleme suresi "+(bitis-basla));

    }

    }
