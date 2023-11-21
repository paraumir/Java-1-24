package pr6_2;
abstract class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Абстрактный метод, который будет реализован в подклассах
    public abstract void bark();

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

// Подкласс для породы Лабрадор
class Labrador extends Dog {
    public Labrador(String name, int age) {
        super(name, age);
    }

    @Override
    public void bark() {
        System.out.println(getName() + " лайет: Гав-гав!");
    }
}

// Подкласс для породы Далматинец
class Dalmatian extends Dog {
    public Dalmatian(String name, int age) {
        super(name, age);
    }

    @Override
    public void bark() {
        System.out.println(getName() + " лайет: Вау-вау!");
    }
}

public class main {
    public static void main(String[] args) {
        Dog labrador = new Labrador("Барон", 3);
        Dog dalmatian = new Dalmatian("Лука", 2);

        labrador.bark();
        dalmatian.bark();
    }
}

