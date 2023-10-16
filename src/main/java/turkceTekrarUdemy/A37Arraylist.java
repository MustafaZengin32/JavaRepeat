package turkceTekrarUdemy;

import java.util.ArrayList;

public class A37Arraylist {
    public static void main(String[] args) {
        //arraylerin genisletilmis hali
        //array lengt i genisletilemez ancak arraylist genisletilebilir

        ArrayList <String> arrayList= new ArrayList<>();

        System.out.println(arrayList);

        arrayList.add("Metallica");
        arrayList.add("Roses");
        arrayList.add("Black");
        arrayList.add("Iron");

        System.out.println(arrayList);//[Metallica, Roses, Black, Iron]

        System.out.println(arrayList.get(0));//Metallica

        System.out.println(arrayList.size());//4

        System.out.println("***************************");

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        arrayList.remove("Metallica");

        System.out.println(arrayList);//[Roses, Black, Iron]

        arrayList.remove(1);

        System.out.println(arrayList);//[Roses, Iron]

        arrayList.add(0,"Metalica");
        arrayList.add(1,"Black");

        System.out.println(arrayList);//[Metalica, Black, Roses, Iron]

        System.out.println(arrayList.indexOf("Metalica"));//0
        arrayList.add("Metalica");
        System.out.println(arrayList);//[Metalica, Black, Roses, Iron, Metalica]
        System.out.println(arrayList.lastIndexOf("Metalica"));//4
        System.out.println(arrayList.indexOf("Dreams"));//-1 Herhangi deger yoksa -1 verir

        arrayList.set(4 , "Megadead");//array i guncelleme
        System.out.println(arrayList);//[Metalica, Black, Roses, Iron, Megadead]

        arrayyazdir(arrayList);
    }

    public static void arrayyazdir(ArrayList<String> a){

        for(String w : a){
            System.out.println(w);
        }
    }
}
