package englishRepetition;

public class A02SwapVariables {
    public static void main(String[] args) {
        String x="way";
        String y="tay";

        //y must be way and x must be tay

        String temp=x;
        x=y;
        y=temp;

        System.out.println(x);
        System.out.println(y);

    }
}
