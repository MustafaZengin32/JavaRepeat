package turkishRepetition;

import java.util.LinkedList;
import java.util.Queue;

public class A52Queue {
    //Fifo , first in first out ilk giren ilk cikar
    //kuyruktan deger silmek istersem ilk eklenen den silinmeye baslar

    public static void main(String[] args) {

        //add elemani ekler , ekleyemezse hata firlatir
        //offer add ile ayni ama daha guvenli kendi sinifinin methodu , miras degil
        //remove kuyrugun ilk elemanini siler , bossa hata verir
        //poll kuyrugun ilk elemanini siler , kuyruk bossa hata degil , null dondurur
        //element en bastaki elemani doner , bossa hata verir
        //peek elemnet ile ayni ama bossa null gonderir
        //yani biz offer , pull , peek kullanacagiz

        Queue<String> queue = new LinkedList<String>();

        queue.offer("Java");
        queue.offer("Python");
        queue.offer("Php");
        queue.offer("C++");

        System.out.println(queue.peek());//Java
        System.out.println(queue);

        for (String line :queue) {

            System.out.println(line);

        }

        System.out.println("--------------------------------");

        System.out.println("eleman cikariliyor");

        System.out.println(queue.poll());

        System.out.println(queue);

        System.out.println(queue.isEmpty());





    }

}
