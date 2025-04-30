package maps;

import java.util.HashMap;

public class E3Maps {
    public static void main(String[] args) {

        HashMap<String, Integer> scoresMap = new HashMap<>();
        scoresMap.put("Alice", 85);
        scoresMap.put("Bob", 92);
        scoresMap.put("Charlie", 70);
        scoresMap.put("David", 60);
        //scoresMap.entrySet().removeIf(entry -> entry.getKey().contains("a"));
        //scoresMap.entrySet().removeIf(entry->entry.getValue()>70);
        scoresMap.entrySet().removeIf(entry->entry.getKey().contains("a")&& entry.getValue()<70);
        System.out.println(scoresMap);
    }
}

