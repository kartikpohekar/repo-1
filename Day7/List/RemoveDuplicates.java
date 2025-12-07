package Day7.List;

import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 30, 20, 20, 10, 30, 20, 40);
        List<Integer> result = new ArrayList<>();
        for (Integer num : list) {
            if (!result.contains(num)) result.add(num);
        }
        System.out.println("Removed Duplicates -- >" + result);
    }
}
