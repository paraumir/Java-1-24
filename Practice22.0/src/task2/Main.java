package task2;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        ChairFactory factory = new ChairFactory();

        VictorianChair vicChair = factory.createVictorianChair();
        MagicChair magChair = factory.createMagicChair();
        FunctionalChair funChair = factory.createFunctionalChair();

        client.setChair(vicChair);
        client.sit();
        client.setChair(magChair);
        client.sit();
        client.setChair(funChair);
        client.sit();
    }
}
