package Day10;
import java.util.*;
class WordCount {
    public static void main(String[] args) {
        String text = "this is a test this is only a test";
        String[] words = text.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String w : words) map.put(w, map.getOrDefault(w, 0) + 1);
        System.out.println(map);
    }
}
