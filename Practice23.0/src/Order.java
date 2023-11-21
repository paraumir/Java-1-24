import java.util.Arrays;
class Order {
    private static final int DEFAULT_SIZE = 10;
    private int size;
    private Dish[] dishes;
    private double cost;
    private String name;

    // Конструктор
    public Order(String name) {
        this.name = name;
        this.size = 0;
        this.dishes = new Dish[DEFAULT_SIZE];
        this.cost = 0;
    }

    // Методы
    public boolean addDish(Dish dish) {
        if (size < dishes.length) {
            dishes[size++] = dish;
            cost += dish.getCost();
            return true;
        }
        return false;
    }

    public boolean remove(String dishName) {
        for (int i = size - 1; i >= 0; i--) {
            if (dishes[i].getName().equals(dishName)) {
                cost -= dishes[i].getCost();
                System.arraycopy(dishes, i + 1, dishes, i, size - i - 1);
                dishes[--size] = null;
                return true;
            }
        }
        return false;
    }

    public int removeAll(String dishName) {
        int count = 0;
        for (int i = size - 1; i >= 0; i--) {
            if (dishes[i].getName().equals(dishName)) {
                cost -= dishes[i].getCost();
                System.arraycopy(dishes, i + 1, dishes, i, size - i - 1);
                dishes[--size] = null;
                count++;
            }
        }
        return count;
    }

    public int dishQuantity(String dishName) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (dishes[i].getName().equals(dishName)) {
                count++;
            }
        }
        return count;
    }

    public Dish[] getDishes() {
        return Arrays.copyOf(dishes, size);
    }

    public double getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }
}