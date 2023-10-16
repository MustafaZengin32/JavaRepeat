package turkishRepetition;

public class A48Exception06MyExceptionClass extends ArithmeticException {

    public A48Exception06MyExceptionClass(String message){
       super(message);

    }
    @Override
    public void printStackTrace() {
        System.out.println("bu bir invalid exception");
    }

    //bir tane ust class dan turetmek gerekir
        //bu sekilde oradan istedigim methodu override edebilirim

}
