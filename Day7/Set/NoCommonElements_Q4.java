package Day7.Set;

import java.util.*;

public class NoCommonElements_Q4 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 2, 6);

        Set<Integer> set1 = new HashSet<>(list1);
        Set<Integer> set2 = new HashSet<>(list2);

        set1.retainAll(set2); // this keeps only common elements

        boolean noCommon = set1.isEmpty();
        System.out.println("Do both lists have no elements in common? --> " + noCommon);
    }
}
