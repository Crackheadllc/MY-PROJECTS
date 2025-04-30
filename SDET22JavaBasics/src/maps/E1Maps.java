package maps;

import java.util.HashMap;

public class E1Maps {
    public static void main(String[] args) {


        HashMap<String,Integer> fruit=new HashMap<>();
        fruit.put("Apples",2);
        fruit.put("Orange",4);
        fruit.put("Mango",5);
        fruit.put("Kiwi",7);
        System.out.println(fruit);
        System.out.println(fruit.get("Mango"));
        System.out.println(fruit.size());
        System.out.println(fruit.isEmpty());
        fruit.remove("Orange");
        System.out.println(fruit);
        System.out.println(fruit.containsKey("Kiwi"));
        System.out.println(fruit.containsValue(2));
        fruit.replace("Apple",9);
        System.out.println(fruit);
    }
}
