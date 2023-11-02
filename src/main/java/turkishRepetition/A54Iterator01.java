package turkishRepetition;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class A54Iterator01 {

    public static void main(String[] args) {

        //Next Prevous kavramlari var
        //next bir sonraki elemani
        //hasNext true false sonrasinda eleman var mi
        //hasprevious true false oncesinde elaman var mi kontrol eder


        LinkedList<String> linked1= new LinkedList<>();

        linked1.add("sila");
        linked1.add("irmak");
        linked1.add("poyraz");
        linked1.add("egemen");

        yazdir(linked1);

        Iterator<String> i1=linked1.iterator();

        while(i1.hasNext()){

            System.out.println(i1.next());
        }

    }

    public static void yazdir(LinkedList<String> linked1){

        ListIterator<String> a= linked1.listIterator();

        while(a.hasNext()){
            System.out.println(a.next());
        }




    }
}
