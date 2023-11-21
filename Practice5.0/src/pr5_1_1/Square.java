package pr5_1_1;

public class Square extends Rectangle {
    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }
    public Square(double side) {
        super(side, side);
    }

    public double getSide() {
        return getWidth(); // Ширина и длина квадрата одинаковы
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}
