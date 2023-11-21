package pr6_3;

// ����� ������, ������������� �� Furniture
class Sofa extends Furniture {
    private int seatingCapacity;

    public Sofa(String name, double price, int seatingCapacity) {
        super(name, price);
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("�����: " + getName());
        System.out.println("����: " + getPrice() + " ���.");
        System.out.println("�����������: " + seatingCapacity + " �������");
    }
}