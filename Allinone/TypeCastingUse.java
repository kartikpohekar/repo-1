package Allinone;
public class TypeCastingUse {
    public static void main(String[] args) {
        int num1 = 5;
        double num2 = 2.5;
        double result = num1 + num2; 
        System.out.println("Arithmetic operation result: " + result); // converted to double (implicit)

        double salary = 12345.67; // explicit - assigining values
        int roundedSalary = (int) salary; 
        System.out.println("Rounded salary: " + roundedSalary);

        printDouble((double) num1);
    }

    static void printDouble(double val) {
        System.out.println("Value passed to method: " + val);
    }
}
