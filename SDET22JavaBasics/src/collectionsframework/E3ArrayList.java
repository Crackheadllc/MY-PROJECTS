package collectionsframework;

import java.util.ArrayList;

public class E3ArrayList {
    public static void main(String[] args) {

        ArrayList<String> names1=new ArrayList<>();
        names1.add("Josh");//0
        names1.add("John");//1
        names1.add("Adam");//2
        names1.add("Jilli");//3

        ArrayList<String> names2=new ArrayList<>();
        names2.add("Sara");//0
        names2.add("Joni");//1
        names2.add("Black");//2
        names2.add("Jush");//3

        ArrayList<String> allNames=new ArrayList<>();
        allNames.addAll(names2);
        allNames.addAll(names1);
        System.out.println(allNames);
        allNames.removeAll(names2);
        System.out.println(allNames);
    }
}
