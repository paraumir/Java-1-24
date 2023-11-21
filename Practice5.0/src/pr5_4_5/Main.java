package pr5_4_5;

public class Main {
    public static void main(String[] args) {
        MovablePoint point1 = new MovablePoint(1, 2, 1, 1);
        MovablePoint point2 = new MovablePoint(4, 5, 1, 1);

        MovableRectangle rectangle = new MovableRectangle(1, 2, 4, 5, 1, 1);

        System.out.println("Точка 1: " + point1);
        System.out.println("Точка 2: " + point2);
        System.out.println("Прямоугольник : " + rectangle);

        point1.moveUp();
        point2.moveDown();
        rectangle.moveLeft();

        System.out.println("Точка 1: " + point1);
        System.out.println("Точка 2: " + point2);
        System.out.println("Прямоугольник сдвинулся: " + rectangle);
    }
}

