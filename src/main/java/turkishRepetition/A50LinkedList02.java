package turkishRepetition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A50LinkedList02 {
    public static void main(String[] args) {

        List<String > list_string=new ArrayList<>();

        list_string.add("Java");
        list_string.add("C++");
        list_string.add("Python");
        list_string.add("Php");
        list_string.add("Go");

        Collections.sort(list_string);//bu sekilde list i siraladik

        for (String s : list_string) {
            System.out.println(s);

        }

        //sik sik arama yapacaksam arraylist , hizli
        //silme islmemi linkedlist hizli




    }
}
