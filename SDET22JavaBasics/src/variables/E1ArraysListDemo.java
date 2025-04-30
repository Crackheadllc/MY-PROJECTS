package variables;

import java.util.ArrayList;

public class E1ArraysListDemo {
    public static void main(String[] args) {
        int[] arr={10,45};
        ArrayList<Integer>arrayList=new ArrayList();
        System.out.println(arrayList.size());
        arrayList.add(10);
        System.out.println(arrayList.size());
        System.out.println(arrayList);
    }
}
