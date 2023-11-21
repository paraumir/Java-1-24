import java.util.HashMap;
import java.util.Map;

// Переименованный класс OrderManager
class OrderManager {
    private Map<String, Order> addressOrderMap;

    // Конструктор
    public OrderManager() {
        this.addressOrderMap = new HashMap<>();
    }

    // Перегруженные методы для работы с адресами заказов
    public void addOrder(String address, Order order) {
        addressOrderMap.put(address, order);
    }

    public Order getOrder(String address) {
        return addressOrderMap.get(address);
    }

    public void removeOrder(String address) {
        addressOrderMap.remove(address);
    }

    // Перегруженные методы для добавления позиции к заказу
    public void addPosition(String address, Item item) {
        Order order = addressOrderMap.get(address);
        if (order != null) {
            order.addPosition(item);
        }
    }

    // Методы для работы с интернет-заказами
    public Order[] getAllInternetOrders() {
        return addressOrderMap.values().toArray(new Order[0]);
    }

    public double getTotalInternetOrdersCost() {
        double totalCost = 0;
        for (Order order : addressOrderMap.values()) {
            if (order != null) {
                totalCost += order.getTotalCost();
            }
        }
        return totalCost;
    }

    public int getTotalOrderedDishesCount(String dishName) {
        int totalCount = 0;
        for (Order order : addressOrderMap.values()) {
            if (order != null) {
                totalCount += order.getItemsCount(dishName);
            }
        }
        return totalCount;
    }
}