final class Drink implements Item {
    private static final int DEFAULT_COST = 0;
    private final int cost;
    private final String name;
    private final String description;

    // Конструкторы
    public Drink(String name, String description) {
        this(DEFAULT_COST, name, description);
    }

    public Drink(int cost, String name, String description) {
        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    // Методы
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
}
