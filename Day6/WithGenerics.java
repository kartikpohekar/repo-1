package Day6;
class GenericBox<T> {
    private T item;

    void setItem(T item) {
        this.item = item;
    }

    T getItem() {
        return item;
    }
}

public class WithGenerics {
    public static void main(String[] args) {
        GenericBox<Integer> intBox = new GenericBox<>();
        intBox.setItem(10);
        System.out.println("Integer value: " + intBox.getItem());

        GenericBox<String> strBox = new GenericBox<>();
        strBox.setItem("Hello");
        System.out.println("String value: " + strBox.getItem());
    }
}
