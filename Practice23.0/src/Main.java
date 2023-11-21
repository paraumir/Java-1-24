public class Main {
    public static void main(String[] args) {
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
    }
}

