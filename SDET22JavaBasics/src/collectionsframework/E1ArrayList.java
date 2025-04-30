package collectionsframework;

import java.util.ArrayList;

public class E1ArrayList {
    public static void main(String[] args) {


        ArrayList<String>names=new ArrayList<>();
        names.add("Josh");
        names.add("John");
        names.add("Adam");
        names.add("Jilli");
        System.out.println(names.size());
        //names.remove("Jilli");
        names.remove(3);
        System.out.println(names.size());
        System.out.println(names);
        System.out.println(names.contains("Adam"));
        System.out.println(names.contains("Sara"));
        System.out.println(names.get(0));
    }
}
