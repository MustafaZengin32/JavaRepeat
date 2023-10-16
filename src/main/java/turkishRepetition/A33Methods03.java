package turkishRepetition;

public class A33Methods03 {

    public static int ikiilecarp(int a){
        return  a*2;
    }
    public static int ikiiletopla(int a){
        return  a+2;
    }

    public static int dortilecarp(int a){
        return  a*4;
    }

    public static int deneme(int a){
        System.out.println("cikti deneme");
        return  a*2;
        //System.out.println("yazdiramaz ki");//yazdiramadi cunku return un altinda , return methoddaki son nokta
    }

    public static void main(String[] args) {

        System.out.println(dortilecarp(ikiiletopla(ikiilecarp(8))));
        //Return sayesinde ard arda yazdirdik ve hem birbirinin hem de sout un icinde yazdik
        //return altina yazilan calismaz

        System.out.println(deneme(4));

    }

}
