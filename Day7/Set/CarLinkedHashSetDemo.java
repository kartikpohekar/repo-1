package Day7.Set;

import java.util.*;

public class CarLinkedHashSetDemo {
    public static void main(String[] args) {
        Set<String> cars = new LinkedHashSet<>();

        cars.add("BMW");
        cars.add("Audi");
        cars.add("Tesla");
        cars.add("BMW"); // duplicate ignored & maintains insertion order
        System.out.println("Cars after adding (insertion order): " + cars);

        cars.remove("Audi");
        System.out.println("After removing Audi: " + cars);

        System.out.println("Total size --> " + cars.size());

        System.out.println("Contains Tesla ? " + cars.contains("Tesla"));
        System.out.println("Contains Audi ? " + cars.contains("Audi"));

        cars.clear();
        System.out.println("After clear is done --> " + cars);
    }
}
