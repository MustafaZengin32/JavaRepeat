package turkishRepetition;

import java.util.PriorityQueue;
import java.util.Queue;

public class A52PriorityQueue {
    public static void main(String[] args) {

        //normal queue de fifo gecerli
        //ancak priority queue da yuksek oncelikli olan one gecer , dogal siralama geregi
        //mesela 2 , 4,6 olan priority queue ya 3 eklersek 2 den sonraya eklenir
        //acil serviste yuksek oncelikli one gecer

        //2,1,5,4 eklersen 1,2,4,5 formunda kaydedilir

        //add , offer queue dan
        //clear
        //contains
        //peek kuyrugun basindaki elemani doner , bossa null doner
        //poll
        //size

        Queue<Integer>queue= new PriorityQueue<>();

        queue.offer(5);
        queue.offer(1);
        queue.offer(2);
        queue.offer(100);

        //foreach de en oncelikliyi en ilk verir ama siralama da kesin sirali vermez

        System.out.println(queue.peek());//1

        System.out.println(queue.contains(100));//true

        while (!queue.isEmpty()){
            System.out.println(queue.poll());

        }

        //yukarida oncelik sirasina gore cikardigini gorebiliriz

        System.out.println(queue.isEmpty());//true












    }
}
