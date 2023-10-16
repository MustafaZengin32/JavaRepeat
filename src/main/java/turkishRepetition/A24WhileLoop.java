package turkishRepetition;

public class A24WhileLoop {

    public static void main(String[] args) {


    /*
    while(dongu kosulu){

    }
    //for da arttirma azaltma dongu icinde olur
    //while de bu durum farkli , () icinde degil blok icin kendimiz arttiririz
    //Ayrica ilk deger int=0; gibi , dongu oncesi tanimlanir () icin degil
     */

    //0 dan 10 a kadar degerleri yazdir.

    for(int i=0; i<10; i++){
        System.out.println("i = " + i);
    }

    int j=0;

    while(j<10){

        System.out.println("j = " + j);
        j++;
    }

    //Faktoriyel i while ile yazin

        int multiple=1;
        int sayi=5;
        int i=1;

        while(i<=sayi){

            multiple*=i;
            i++;
        }

        System.out.println(multiple);


        int sayi1=6;
        int faktoriyel=1;

        while (sayi1>0){
            faktoriyel*=sayi1;
            sayi1--;
        }
        System.out.println(faktoriyel);

    //Sonsuz dongu kosul her zaman true ise sonsuza kadar dongu doner
    //Arttirim azaltim unutursan for da mesela basina gelebilir




    }
}
