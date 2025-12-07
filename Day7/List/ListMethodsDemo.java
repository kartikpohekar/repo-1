package Day7.List;

import java.util.*;

public class ListMethodsDemo {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();

        cars.add("BMW");
        cars.add("Audi");
        cars.add("Tesla");
        cars.add("BMW");
        System.out.println("List after adding elements: " + cars);

        cars.remove(1);
        System.out.println("After removing element at index 1: " + cars);

        System.out.println("Element at index 1: " + cars.get(1));

        cars.set(1, "Mercedes");
        System.out.println("After setting Mercedes at index 1: " + cars);

        System.out.println("Size of list: " + cars.size());

        System.out.println("List contains BMW ? -->  " + cars.contains("BMW"));

        System.out.println("Index of first occurrence of  BMW -->  " + cars.indexOf("BMW"));

        cars.clear();
        System.out.println("List after clear(): " + cars);
    }
}
