package collectionsframework;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class E11Sets {
    public static void main(String[] args) {

        LinkedHashSet<Integer> numbers=new LinkedHashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(10);
        System.out.println(numbers);
    }
}
