package collectionsframework;

import java.util.ArrayList;

public class E5ArrayList {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        names.add("Josh");//0
        names.add("John");//1
        names.add("Adam");//2
        names.add("Jilli");//3
        //names.removeIf(x-> x.contains("o"));
        names.removeIf(x-> x.length()>4);
        System.out.println(names);
    }
}
