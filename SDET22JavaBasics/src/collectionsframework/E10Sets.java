package collectionsframework;

import java.util.ArrayList;
import java.util.HashSet;

public class E10Sets {
    public static void main(String[] args) {
        HashSet<Integer> numbers=new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(10);
        System.out.println(numbers);
    }
}
