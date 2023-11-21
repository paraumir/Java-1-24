import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

class OrderManager {
    private Order[] orders;
    private int[] freeTableNumbers;
    private int size;

    // Конструктор
    public OrderManager() {
        this.orders = new Order[10];
        this.freeTableNumbers = new int[10];
        this.size = 0;

        for (int i = 0; i < 10; i++) {
            freeTableNumbers[i] = i + 1;
        }
    }

    // Методы
    public void add(Order order, int tableNumber) {
        if (size < orders.length && tableNumber > 0 && tableNumber <= 10 && freeTableNumbers[tableNumber - 1] == tableNumber) {
            orders[size++] = order;
            freeTableNumbers[tableNumber - 1] = 0; // Занята таблица
        }
    }

    public Order getOrder(int tableNumber) {
        for (Order order : orders) {
            if (order != null && order.getName().equals("Table " + tableNumber)) {
                return order;
            }
        }
        return null;
    }

    public void addDish(Dish dish, int tableNumber) {
        Order order = getOrder(tableNumber);
        if (order != null) {
            order.addDish(dish);
        }
    }

    public void removeOrder(int tableNumber) {
        for (int i = 0; i < size; i++) {
            if (orders[i] != null && orders[i].getName().equals("Table " + tableNumber)) {
                orders[i] = null;
                freeTableNumbers[tableNumber - 1] = tableNumber; // Освободим таблицу
                break;
            }
        }
    }

    public int freeTableNumber() {
        for (int i = 0; i < 10; i++) {
            if (freeTableNumbers[i] > 0) {
                return freeTableNumbers[i];
            }
        }
        return -1; // Все столики заняты
    }

    public double ordersCostSummary() {
        double totalCost = 0;
        for (Order order : orders) {
            if (order != null) {
                totalCost += order.getCost();
            }
        }
        return totalCost;
    }

    public int dishQuantity(String dishName) {
        int count = 0;
        for (Order order : orders) {
            if (order != null) {
                count += order.dishQuantity(dishName);
            }
        }
        return count;
    }

    public String[] dishesNames() {
        // Используем HashSet для автоматического удаления повторяющихся имен
        HashSet<String> uniqueDishes = new HashSet<>();
        for (Order order : orders) {
            if (order != null) {
                for (Dish dish : order.getDishes()) {
                    uniqueDishes.add(dish.getName());
                }
            }
        }
        return uniqueDishes.toArray(new String[0]);
    }

    public Dish[] sortedDishesByCostDesc() {
        // Используем ArrayList для удобства сортировки
        ArrayList<Dish> allDishes = new ArrayList<>();
        for (Order order : orders) {
            if (order != null) {
                allDishes.addAll(Arrays.asList(order.getDishes()));
            }
        }
        Dish[] sortedDishes = allDishes.toArray(new Dish[0]);
        Arrays.sort(sortedDishes, Comparator.comparingDouble(Dish::getCost).reversed());
        return sortedDishes;
    }
}
