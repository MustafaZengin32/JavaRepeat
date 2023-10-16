package turkishRepetition;

public class A48Exception05ExceptionPropagation {

    //ic ice fonk. exp yakalama=ExceptionPropagation

    public static  void ucuncufonk(){


        int a=12/0;

//        try {
//            int a=12/0;
//        }
//
//        catch (ArithmeticException e){
//            System.out.println("bir sayi sifira bolunemez");
//        }

    }
    public static  void ikincifonk(){

        try {

            ucuncufonk();
        }

        catch (ArithmeticException e){
            System.out.println("bir sayi sifira bolunemez");
        }

    }

    public static  void birincik(){
        ikincifonk();
    }

    public static void main(String[] args) {
        birincik();

        //main birinci ikinci ucuncu yukardan asagi bakar ve fonk da exc yakalanip yakalanmadigini kontrol eder
        //stack leri konrol eder
        //biyerde yakalarsa sorunsuz sekilde calisir
        //hic biryerde yakalamaz isek hata verir

    }

}
