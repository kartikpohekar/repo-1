package Allinone;
class Person {
    String name;
    int age;

    void setPersonDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    String company;
    double salary;

    void setEmployeeDetails(String company, double salary) {
        this.company = company;
        this.salary = salary;
    }

    void showEmployeeDetails() {
        showPersonDetails();
        System.out.println("Company: " + company);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    String department;
    int teamSize;

    void setManagerDetails(String department, int teamSize) {
        this.department = department;
        this.teamSize = teamSize;
    }

    void showManagerDetails() {
        showEmployeeDetails();
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
    }
}

public class Multilevelinheri {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.setPersonDetails("Kartik Pohekar", 22);
        m.setEmployeeDetails("Wipro", 55000);
        m.setManagerDetails("Devops", 8);
        m.showManagerDetails();
    }
}
