package maps;

import java.util.HashMap;
import java.util.Map;

public class E2Maps {
    public static void main(String[] args) {

        HashMap<String, Integer> scoresMap =new HashMap<>();
        scoresMap.put("Alice", 85);
        scoresMap.put("Bob", 92);
        scoresMap.put("Charlie", 70);
        scoresMap.put("David", 60);
        //for (Map.Entry<String,Integer>entry:scoresMap.entrySet()){
        for (var entry:scoresMap.entrySet()){
            System.out.println(entry.getValue());
            //System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
