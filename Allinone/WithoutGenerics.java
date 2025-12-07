package Allinone;
class Box {
    private Object item;

    void setItem(Object item) {
        this.item = item;
    }

    Object getItem() {
        return item;
    }
}

public class WithoutGenerics {
    public static void main(String[] args) {
        Box intBox = new Box();
        intBox.setItem(10);
        System.out.println("Integer value: " + intBox.getItem());

        Box strBox = new Box();
        strBox.setItem("Hello");
        System.out.println("String value: " + strBox.getItem());
    }
}
