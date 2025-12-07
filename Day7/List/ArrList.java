package Day7.List;
import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(15);
        list.add(25);
        list.add(15);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        int num = list.get(1);
        System.out.println(num);

        list.set(1, 100);
        System.out.println(list);

        System.out.println(list.size());

        System.out.println(list.contains(5));
        System.out.println(list.contains(25));

        System.out.println(list.indexOf(15));
        System.out.println(list.indexOf(100));

        list.clear();
        System.out.println(list);
        System.out.println(list.size());
    }
}