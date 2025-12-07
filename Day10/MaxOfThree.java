package Day10;
import java.util.*;
class MaxOfThree {
    public static void main(String[] args) {
        System.out.println("Enter 3 Numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println("Max -->" + max);
    }
}
