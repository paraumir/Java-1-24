package pr9_2;

 class Product implements Priceable {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }


    public double getPrice() {
        return price;
    }
}

 class Service implements Priceable {
    private String name;
    private double price;

    public Service(String name, double price) {
        this.name = name;
        this.price = price;
    }


    public double getPrice() {
        return price;
    }
}

public class Main {
    public static void main(String[] args) {
        Priceable product = new Product("Laptop", 1000.00);
        Priceable service = new Service("Plumbing", 50.00);

        System.out.println("Product Price: $" + product.getPrice());
        System.out.println("Service Price: $" + service.getPrice());
    }
}
