package Day10;
import java.util.*;
class ThreeNumbers {
    public static void main(String[] args) {
        System.out.println("Enter 3 numbers below one by one\n");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if (a == b && b == c) System.out.println("All equal");
        else if (a == b || b == c || a == c) System.out.println("Two equal");
        else System.out.println("All different");
    }
}
