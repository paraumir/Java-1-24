package pr6_3;

public class Main {
    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop();

        Chair chair = new Chair("Стул 1", 100.0, 4);
        Table table = new Table("Стол 1", 200.0, 6);

        shop.addFurniture(chair);
        shop.addFurniture(table);

        shop.displayInventory();
    }
}



