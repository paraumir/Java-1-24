package pr4_1;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(7.0);

        System.out.println("Круг 1:");
        System.out.println("Радиус: " + circle1.getRadius());
        System.out.println("Площадь: " + circle1.calculateArea());
        System.out.println("Длинна окружности: " + circle1.calculateCircumference());

    }
}
