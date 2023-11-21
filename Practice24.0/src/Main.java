public class Main {
    public static void main(String[] args) {
        try {
            // Пример использования
            Drink cola = new Drink(2, "Кола", "Освежает");
            Dish burger = new Dish(5, "Бургер", "Not American");

            InternetOrder internetOrder = new InternetOrder(new Item[]{cola, burger});

            System.out.println("Общая стоимость: " + internetOrder.getTotalCost());
            System.out.println("Кол-во предметов: " + internetOrder.getTotalItems());

            // Добавление новой позиции в заказ
            Dish salad = new Dish(3, "Салат", "мммм салатик");
            internetOrder.addPosition(salad);

            System.out.println("Общая стоимость после добавления салата: " + internetOrder.getTotalCost());
            System.out.println("Кол-во предметов после добавления салата: " + internetOrder.getTotalItems());

            // Удаление позиции из заказа
            internetOrder.removePosition("Кола");

            System.out.println("Общая стоимость после удаления Колы: " + internetOrder.getTotalCost());
            System.out.println("Кол-во предметов после удаления Колы: " + internetOrder.getTotalItems());

            // Получение отсортированных по убыванию цены позиций заказа
            Item[] sortedItems = internetOrder.getSortedItemsByCost();
            System.out.println("Сортировка по цене:");
            for (Item item : sortedItems) {
                System.out.println(item.getName() + ": " + item.getCost());
            }

            // Тесты исключений
            // Попытка создать блюдо с некорректными параметрами
            Dish invalidDish = new Dish(-1, "", ""); // Ожидается IllegalArgumentException

            // Попытка добавить заказ с уже существующим адресом
            InternetOrder existingOrder = new InternetOrder(new Item[]{});
            OrderManager orderManager = new OrderManager();
            orderManager.addOrder("existingAddress", (Order) existingOrder);
            orderManager.addOrder("existingAddress", (Order) new InternetOrder(new Item[]{})); // Ожидается OrderAlreadyAddedException

            // Попытка получить заказ для несуществующего столика
            orderManager.getOrder("123"); // Ожидается IllegalTableNumber
        } catch (IllegalArgumentException e) {
            System.err.println("IllegalArgumentException: " + e.getMessage());
        } catch (IllegalTableNumber e) {
            System.err.println("IllegalTableNumber: " + e.getMessage());
        }
    }
}