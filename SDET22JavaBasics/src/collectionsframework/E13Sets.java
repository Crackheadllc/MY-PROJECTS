package collectionsframework;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class E13Sets {
    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(50);
        numbers.add(20);
        numbers.add(10);
        numbers.add(10);

        LinkedHashSet<Integer> uNumber=new LinkedHashSet<>();
        System.out.println(uNumber);

        //System.out.println(numbers);
        //for (Integer i:numbers){
           // System.out.println(i);
       // }
        //numbers.forEach(x-> System.out.println(x));


    }
}
