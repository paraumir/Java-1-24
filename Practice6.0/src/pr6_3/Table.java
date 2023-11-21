package pr6_3;

class Table extends Furniture {
    private int numberOfSeats;

    public Table(String name, double price, int numberOfSeats) {
        super(name, price);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void displayInfo() {
        System.out.println("Имя: " + getName());
        System.out.println("Цена: " + getPrice());
        System.out.println("Кол-во мест: " + numberOfSeats);
    }
}