package Allinone;
public class WrapperExample {
    public static void main(String[] args) {
        // Converting primitive to object (Autoboxing)
        int a = 10;
        Integer obj = a;
        System.out.println("Autoboxing: " + obj);

        // Converting object to primitive (Unboxing)
        Integer num = 25;
        int b = num;
        System.out.println("Unboxing: " + b);
    }
}
