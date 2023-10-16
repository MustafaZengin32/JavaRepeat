package englishRepetition;

public class A12BreakContinue {
    //continue skips rest of code forces the next iteration of loop

    //break exits a loop/switch

    public static void main(String[] args) {
        for (int i = 0; i <20;i++) {
            if (i==13){
                continue;
            }
            System.out.println("i\n"+i);
        }
    }

}
