package Day7.Maps;

import java.util.*;

public class WordCount_Q2 {
    public static void main(String[] args) {
        String str = "Java is fun and Java is powerful";
        String[] words = str.toLowerCase().split(" ");
        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words)
            map.put(word, map.getOrDefault(word, 0) + 1);

        System.out.println(map);
    }
}
