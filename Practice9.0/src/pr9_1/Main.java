package pr9_1;

 class Planet implements Nameable {
    private String name;

    public Planet(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

 class Car implements Nameable {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

 class Animal implements Nameable {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Nameable planet = new Planet("Earth");
        Nameable car = new Car("Toyota");
        Nameable animal = new Animal("Cow");

        System.out.println("Planet Name: " + planet.getName());
        System.out.println("Car Name: " + car.getName());
        System.out.println("Animal Name: " + animal.getName());
    }
}