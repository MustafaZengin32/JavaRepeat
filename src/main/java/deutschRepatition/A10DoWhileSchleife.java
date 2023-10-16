package deutschRepatition;

public class A10DoWhileSchleife {
    public static void main(String[] args) {
        int number=6;

        //kopfgesteuerte Schleife
        while (number<=5){
            System.out.println(number);
            number++;
        }

        System.out.println("****************************************************************");

        int number1=6;
        //fussgesteuerte Schleife

        do {
            System.out.println(number1);
            number1++;
        }while (number1<=5);
    }
}
