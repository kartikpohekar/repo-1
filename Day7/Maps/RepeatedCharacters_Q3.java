package Day7.Maps;

import java.util.*;

public class RepeatedCharacters_Q3 {
    public static void main(String[] args) {
        String str = "programming";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        HashMap<Character, Integer> result = new HashMap<>();
        for (Map.Entry<Character, Integer> e : map.entrySet())
            if (e.getValue() > 1)
                result.put(e.getKey(), e.getValue());

        System.out.println(result);
    }
}

