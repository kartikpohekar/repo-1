package Day7.Maps;

import java.util.*;

public class HashMapMethodsDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        // put - add key-value pairs
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        System.out.println("Initial Map: " + map);

        // get - returns value for given key
        System.out.println("Value for key 2: " + map.get(2));

        // remove - removes by key
        map.remove(3);
        System.out.println("After removing key 3: " + map);

        // containsKey - checks if key exists
        System.out.println("Contains key 1? " + map.containsKey(1));

        // containsValue - checks if value exists
        System.out.println("Contains value 'Banana'? " + map.containsValue("Banana"));

        // size - number of key-value pairs
        System.out.println("Size of map: " + map.size());

        // clear - removes all entries
        map.clear();
        System.out.println("After clearing map: " + map);
    }
}

