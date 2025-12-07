package Day7.List;

import java.util.*;

public class MergeLists {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(3, 5, 7, 5);
        List<Integer> list2 = Arrays.asList(2, 7, 8, 3);

        List<Integer> merged = new ArrayList<>();
        merged.addAll(list1);
        merged.addAll(list2);

        List<Integer> result = new ArrayList<>();
        for (Integer num : merged) {
            if (!result.contains(num)) result.add(num);
        }

        Collections.sort(result);
        System.out.println("Unique List --> " + result);
    }
}

