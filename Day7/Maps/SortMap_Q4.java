package Day7.Maps;

import java.util.*;

public class SortMap_Q4 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(3, "Banana");
        map.put(1, "Apple");
        map.put(2, "Cherry");

        // Sort by keys
        TreeMap<Integer, String> sortedByKey = new TreeMap<>(map);
        System.out.println("Sorted by keys: " + sortedByKey);

        // Sort by values
        List<Map.Entry<Integer, String>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        LinkedHashMap<Integer, String> sortedByValue = new LinkedHashMap<>();
        for (Map.Entry<Integer, String> e : list)
            sortedByValue.put(e.getKey(), e.getValue());

        System.out.println("Sorted by values: " + sortedByValue);
    }
}

