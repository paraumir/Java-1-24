package pr6_3;
import java.util.*;

class FurnitureShop {
    private List<Furniture> inventory;

    public FurnitureShop() {
        inventory = new ArrayList<>();
    }

    public void addFurniture(Furniture furniture) {
        inventory.add(furniture);
    }

    public void displayInventory() {
        System.out.println("Ассортимент магазина:");
        for (Furniture furniture : inventory) {
            furniture.displayInfo();
            System.out.println("-------------------------");
        }
    }
}