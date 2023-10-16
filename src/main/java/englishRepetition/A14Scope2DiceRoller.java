package englishRepetition;

import java.util.Random;

public class A14Scope2DiceRoller {

    Random random;
    int number;

    public A14Scope2DiceRoller() {

        random = new Random();

       // Random random = new Random();
       // int number=0;

        roll();
    }

    void roll(){
        //number=random.nextInt(6)+1;
        //System.out.println(number);
        number=random.nextInt(6)+1;
        System.out.println(number);

    }
}
