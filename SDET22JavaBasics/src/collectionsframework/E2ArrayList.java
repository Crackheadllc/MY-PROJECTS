package collectionsframework;

import java.util.ArrayList;

public class E2ArrayList {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        names.add("Josh");//0
        names.add("John");//1
        names.add("Adam");//2
        names.add("Jilli");//3

        //names.clear();
        names.set(1,"Sara");
        System.out.println(names.indexOf("Adam"));
        System.out.println(names.isEmpty());
        //System.out.println(names.remove());
        System.out.println(names);
    }
}
