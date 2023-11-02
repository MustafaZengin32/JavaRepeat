package turkishRepetition;

import javax.swing.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class A53Map {

    public static void map_yazdir(Map<Integer, String>map){

        map.put(10,"C++");
        map.put(5,"Java");
        map.put(1,"Python");
        map.put(2,"Php");
        map.put(100,"C");

        for (Map.Entry<Integer,String>entry : map.entrySet()){

            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
            
        }
    }
    public static void main(String[] args) {

        //HashMap key value karisik sekilde depolanir ve cikti verir
        //LinkedHashMAp de giris sirasina gore depolanir
        //TreeMap objeler keylere gore siralanir



        Map<Integer,String> hashmap=new HashMap<Integer,String>();

        Map<Integer,String> linkedhashmap=new LinkedHashMap<>();

        Map<Integer,String> treemap=new TreeMap<>();

        System.out.println("********************************");

        map_yazdir(hashmap);

        System.out.println("********************************");

        map_yazdir(linkedhashmap);

        System.out.println("********************************");

        map_yazdir(treemap);












    }


}
