package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class IntarfaceMapPractice {

    public static void main(String[] args) {

        Map<Integer,String> map = new LinkedHashMap<>();

        map.put(1, "Виктор");
        map.put(2, "Анна");
        map.put(3, "Борис");
        map.put(4, "Алексей");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey());
        }

        Map<String, Integer> threeMap = new TreeMap<>();
        threeMap.put("Виктор",1);
        threeMap.put("Анна",2);
        threeMap.put("Борис",3);
        threeMap.put("Алексей",4);

        for (Map.Entry<String, Integer> entry : threeMap.entrySet()) {
            System.out.println(entry.getKey());
        }
    }
}
