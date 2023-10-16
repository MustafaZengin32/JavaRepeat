package turkceTekrarUdemy;

public class A21ForLoop {
    public static void main(String[] args) {
        //for (baslatma ; kosul ; arttirma ve azaltma islemi){
              //dongu kosulu dogru oldugu surece burasi calisacak

        int i;

        for(i=0; i<5 ; i++){
            System.out.println(" i ="+i);
        }

        System.out.println("================================");

        for(int j=0; j<5 ; j++){ // j yi dongu icindede tanimlariz ancak j donguye ozgu olur dongu disinda kullanilamaz
            System.out.println(" j ="+j);
        }

        System.out.println("=================================");

        for(int k=10; k>=0 ; k--) {
            System.out.println(" k =" + k);
        }

        System.out.println("================================");

        int l=0;
        for( ;l<5 ; l++) {
            System.out.println("java ogreniyorum");
        }

        System.out.println("================================");

        int a=0;
        int b=10;

        for(;a<10 && b>0 ; a++,b--) {
            System.out.println("a =" + a);
            System.out.println("b =" + b);

        }

        for (int c=2; c<100 ; c*=2){
            System.out.println("c =" +c);
        }

    }
}
