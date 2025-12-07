package Day8;
import java.io.*;

class Person implements Serializable {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class SerializationDemo {
    public static void main(String[] args) {
        try {
            Person p1 = new Person("Kartik", 25);

            FileOutputStream fileOut = new FileOutputStream("person.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(p1);
            out.close();
            fileOut.close();

            FileInputStream fileIn = new FileInputStream("person.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Person p2 = (Person) in.readObject();
            in.close();
            fileIn.close();

            System.out.println("Deserialized Person:");
            System.out.println("Name: " + p2.name);
            System.out.println("Age: " + p2.age);

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
