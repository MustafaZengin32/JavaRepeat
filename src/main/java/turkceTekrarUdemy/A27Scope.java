package turkceTekrarUdemy;

public class A27Scope {

    int sayi3=20;
    static int sayi4=30;

    public static void main(String[] args) {

        int sayi=10;

        if (sayi>10){
            System.out.println(sayi);

            //int sayi=10; onceden tanimladigi icin buna izin vermedi
            int sayi2=5;



        }

        //System.out.println(sayi2); burda sayiyi gormededi cunku if scope u icinde

        //scope un icinde tanimladigim disinda gecerli degil
        //scope un disinda tanimladigim scope un icinde gecerli
        //Carbage collector scope tanimladigini disinda kullanmadan siler

        //System.out.println(sayi3); bunu da gormez cunku yukarida sayi 3 static olarak tanimlanmadi
        System.out.println(sayi4); // ancak bu gordu cunku yukarida static tanimladik




    }
}
