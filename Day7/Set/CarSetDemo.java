package Day7.Set;

import java.util.*;

public class CarSetDemo {
    public static void main(String[] args) {
        Set<String> cars = new HashSet<>();

        cars.add("BMW");
        cars.add("Audi");
        cars.add("Tesla");
        cars.add("BMW"); // --> Will be ignored since its SET !
        System.out.println("Cars after adding: " + cars);

        cars.remove("Audi");
        System.out.println("After removing Audi: " + cars);

        System.out.println("Total size --> " + cars.size());

        System.out.println("Contains  Tesla ? " + cars.contains("Tesla"));
        System.out.println("Contains Audi ? " + cars.contains("Audi"));

        cars.clear();
        System.out.println("After clear is done -->  " + cars);
    }
}
