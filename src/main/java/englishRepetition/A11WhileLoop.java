package englishRepetition;

import java.util.Scanner;

public class A11WhileLoop {
    public static void main(String[] args) {
        //while loop executes a block of code as long as it is condition remains true

        Scanner scanner = new Scanner(System.in);

        String name="";

        while (name.isBlank()){
            System.out.println("Enter name");
            name=scanner.nextLine();
        }

        System.out.println("Hi "+name);
    }
}
