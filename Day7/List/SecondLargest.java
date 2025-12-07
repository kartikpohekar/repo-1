package Day7.List;

import java.util.*;
public class SecondLargest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 40, 30, 20, 50);
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int n : list) {
            if (n > largest) {
                second = largest;
                largest = n;
            } else if (n > second && n != largest) {
                second = n;
            }
        }
        System.out.println("Second Largest --> " + second);
    }
}
