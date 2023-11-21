package pr5_1_1;

public class ShapeTester {
    public static void main(String[] args) {
        Shape circle = new Circle("Red", true, 5.0);
        Shape rectangle = new Rectangle("Blue", false, 4.0, 6.0);
        Shape square = new Square("Green", true, 3.0);

        Shape[] shapes = {circle, rectangle, square};

        for (Shape shape : shapes) {
            System.out.println(shape.toString());
            System.out.println("Area: " + shape.getArea());
            System.out.println("Perimeter: " + shape.getPerimeter());
        }
    }
}