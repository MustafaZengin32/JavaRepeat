package turkishRepetition;

import java.util.Scanner;

public class A19MiniProjeHesapMakinesi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen yapmak istediginiz islemi girin");
        char islem=scanner.next().charAt(0);

        System.out.println("lutfen ilk sayiyi girin");
        double a=scanner.nextDouble();

        System.out.println("lutfen ikinci sayiyi girin");
        double b=scanner.nextDouble();

        switch (islem) {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;

            default:
                System.out.println("lutfen gecerli bir islem girin");
                 break;
        }

    }
}
