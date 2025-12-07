package Allinone;
class BasePerson {
    String name;

    BasePerson(String name) {
        this.name = name;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
    }
}

class Student extends BasePerson {
    int rollNumber;

    Student(String name, int rollNumber) {
        super(name);
        this.rollNumber = rollNumber;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Roll Number: " + rollNumber);
    }
}

public class Superkey {
    public static void main(String[] args) {
        Student s = new Student("Kartik", 101);
        s.displayInfo();
    }
}
