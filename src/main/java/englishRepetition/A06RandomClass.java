package englishRepetition;

import java.util.Random;

public class A06RandomClass {
    public static void main(String[] args) {

        Random random = new Random();

        int x=random.nextInt();
        System.out.println(x);

        int y=random.nextInt(100);//we can limit the size of number for exp until 99
        System.out.println(y);

        double x1=random.nextDouble();
        System.out.println(x1);

        boolean x2=random.nextBoolean();// 2 results true or false
        System.out.println(x2);










    }
}
