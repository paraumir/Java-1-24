package pr5_1_1;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, boolean filled, double radius) {
        super(filled, color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double getArea() {
        return Math.PI * radius * radius;
    }


    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }


    public String toString() {
        return "Circle[" + super.toString() + ", radius=" + radius + "]";
    }
}
