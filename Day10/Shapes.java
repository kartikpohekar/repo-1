package Day10;

class Shape {
    double area() { return 0; }
}
class Circle extends Shape {
    double radius;
    Circle(double r) { this.radius = r; }
    double area() { return Math.PI * radius * radius; }
}
class Rectangle extends Shape {
    double length, width;
    Rectangle(double l, double w) { this.length = l; this.width = w; }
    double area() { return length * width; }
}
public class Shapes {
    public static void main(String[] args) {
        Shape c = new Circle(5);
        Shape r = new Rectangle(4, 6);
        System.out.println("Circle area: " + c.area());
        System.out.println("Rectangle area: " + r.area());
    }
}
