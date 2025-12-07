package Allinone;
public class GenericExample<T> {
    // T is a type parameter --> can be Integer, String, etc
    T value;

    // Method to set value of any type
    void setValue(T value) {
        this.value = value;
    }

    // Method to get value of any type
    T getValue() {
        return value;
    }

    public static void main(String[] args) {
        //Integer type object
        GenericExample<Integer> intObj = new GenericExample<>();
        intObj.setValue(10);
        System.out.println("Integer value: " + intObj.getValue());

        // String type object 
        GenericExample<String> strObj = new GenericExample<>();
        strObj.setValue("Hello");
        System.out.println("String value: " + strObj.getValue());
    }
}
