package turkceTekrarUdemy;

public class A42Varargs {

        void o1(int a,int... b) {
            System.out.println(b.length);

        }

        void o1(char c,int... d) {
            System.out.println(d[0]);

        }

    public static void main(String[] args) {

        A42Varargs vrg=new A42Varargs();
        vrg.o1('b',4,5,6,7);
        vrg.o1(3,4,5,6,7);

        //Varargs parametresi son da olmali , iki vargas yanyana olmaz ilk kurala aykiri




    }
}
