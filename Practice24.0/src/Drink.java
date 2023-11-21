import java.util.Objects;

final class Drink implements Item {
    private static final double MIN_COST = 0;

    private final int cost;
    private final String name;
    private final String description;

    // Конструктор
    public Drink(int cost, String name, String description) {
        if (cost < MIN_COST || name.isEmpty() || description.isEmpty()) {
            throw new IllegalArgumentException("Invalid Drink parameters");
        }

        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    // Реализация методов интерфейса Item
    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    // Переопределение метода equals для корректного сравнения объектов
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Drink drink = (Drink) obj;
        return Double.compare(drink.cost, cost) == 0 &&
                Objects.equals(name, drink.name) &&
                Objects.equals(description, drink.description);
    }

    // Переопределение метода hashCode для корректного хэширования объектов
    @Override
    public int hashCode() {
        return Objects.hash(cost, name, description);
    }
}