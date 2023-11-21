package pr6_3;

class Chair extends Furniture {
    private int numberOfLegs;

    public Chair(String name, double price, int numberOfLegs) {
        super(name, price);
        this.numberOfLegs = numberOfLegs;
    }

    public void displayInfo() {
        System.out.println("Имя: " + getName());
        System.out.println("Цена: " + getPrice());
        System.out.println("кол-во ног: " + numberOfLegs);
    }
}
