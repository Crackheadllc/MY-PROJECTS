package collectionsframework;

import java.util.ArrayList;

public class E4ArrayList {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        names.add("Josh");//0
        names.add("John");//1
        names.add("Adam");//2
        names.add("Jilli");//3

        for (String n:names){
            System.out.println(n);
        }
        System.out.println("***********");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        System.out.println("**************");
        names.forEach(x-> System.out.println(x));
    }
}
