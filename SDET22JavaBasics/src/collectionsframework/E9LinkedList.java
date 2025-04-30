package collectionsframework;

import java.util.ArrayList;
import java.util.LinkedList;

public class E9LinkedList {
    public static void main(String[] args) {

        //ArrayList<Integer> numbers = new ArrayList<>();
        LinkedList<Integer> numbers=new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(50);
        System.out.println(numbers);
        numbers.remove(1);
        System.out.println(numbers);
        System.out.println(numbers.get(2));


    }
}
