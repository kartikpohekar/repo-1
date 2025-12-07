package Day7.Set;

import java.util.*;

public class UniqueWordCount_Q3 {
    public static void main(String[] args) {
        String sentence = "Java is fun and Java is powerful";

        String[] words = sentence.split(" "); // it got splited here, since set it has no duplicates
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words)); // counted here

        System.out.println("Unique words: " + uniqueWords);
        System.out.println("Total unique word count --> " + uniqueWords.size());
    }
}

