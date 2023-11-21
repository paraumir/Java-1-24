package pr6_1;

abstract class Dish {
    private String material;
    private String color;

    public Dish(String material, String color) {
        this.material = material;
        this.color = color;
    }

    public abstract void use();

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }
}

// Класс для тарелки
class Plate extends Dish {
    private int diameter;

    public Plate(String material, String color, int diameter) {
        super(material, color);
        this.diameter = diameter;
    }


    public void use() {
        System.out.println("Вы поели из тарелки.");
    }

    public int getDiameter() {
        return diameter;
    }
}

// Класс для кружки
class Cup extends Dish {
    private int volume;

    public Cup(String material, String color, int volume) {
        super(material, color);
        this.volume = volume;
    }


    public void use() {
        System.out.println("Вы выпили из кружки.");
    }

    public int getVolume() {
        return volume;
    }
}

public class main {
    public static void main(String[] args) {
        Plate plate = new Plate("Керамика", "Белый", 20);
        Cup cup = new Cup("Фарфор", "Синий", 250);

        System.out.println("Тарелка: Материал - " + plate.getMaterial() + ", Цвет - " + plate.getColor() + ", Диаметр - " + plate.getDiameter() + " см");
        plate.use();

        System.out.println("Кружка: Материал - " + cup.getMaterial() + ", Цвет - " + cup.getColor() + ", Объем - " + cup.getVolume() + " мл");
        cup.use();
    }
}
