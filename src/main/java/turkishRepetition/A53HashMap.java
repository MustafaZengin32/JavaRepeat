package turkishRepetition;

import java.util.HashMap;
import java.util.Map;

public class A53HashMap {
    public static void main(String[] args) {

        //Key Value olarak degerler depolanir
        //Bir key sadece bir kez var olabilir
        //ancak value  da boyle bir sinir yoktur
        //ekleme sirasina gore degil karisik depolanir

        HashMap<Integer,String> hashMap = new HashMap<Integer,String>();

        hashMap.put(10,"Java");
        hashMap.put(30,"Python");
        hashMap.put(50,"Php");
        hashMap.put(20,"Php");
        hashMap.put(30,"Xyz");//hashmap de normalde ayni key bidefa kullanilir
                              // ancak ayni key den bidaha eklersen son ekledigin value degerini baz alir

        System.out.println(hashMap);

        System.out.println(hashMap.get(50));//Php

        System.out.println(100);//null

        //yazdirnmak icin asagidaki yontemi kullaniyoruz , Entry Set e ceviriyoruz

        for (Map.Entry<Integer,String> entry : hashMap.entrySet()){
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }


    }
}
