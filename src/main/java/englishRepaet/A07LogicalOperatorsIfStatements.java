package englishRepaet;

public class A07LogicalOperatorsIfStatements {
    public static void main(String[] args) {
        /*
        && and both must be true for true result
        || or either could be true for true result
        ! not reverse
         */

        //if perform if condition evaluates to be true
        //>= greater than

        int age=75;

        if (age>=18){ // other one is ignored
            System.out.println("adult");
        }
        else if (age>=75){
            System.out.println("ok boomer");
        }
        else{
            System.out.println("not adult");
        }


    }
}
