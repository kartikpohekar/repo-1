package Day10;

import java.util.*;
class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter the year:");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println((year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) ? "Leap year" : "Not leap year");
    }
}
