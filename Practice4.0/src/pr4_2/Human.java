package pr4_2;

public class Human {
    private Head head;
    private Leg leftLeg;
    private Leg rightLeg;
    private Hand leftHand;
    private Hand rightHand;

    public Human() {
        this.head = new Head();
        this.leftLeg = new Leg("left");
        this.rightLeg = new Leg("right");
        this.leftHand = new Hand("left");
        this.rightHand = new Hand("right");
    }

    public void speak(String message) {
        head.talk(message);
    }

    public void walk() {
        leftLeg.move();
        rightLeg.move();
    }

    public void wave() {
        leftHand.wave();
        rightHand.wave();
    }
}

class Head {
    public void talk(String message) {
        System.out.println("Говорит: " + message);
    }
}

class Leg {
    private String side;

    public Leg(String side) {
        this.side = side;
    }

    public void move() {
        System.out.println(side + " нога идет.");
    }
}

class Hand {
    private String side;

    public Hand(String side) {
        this.side = side;
    }

    public void wave() {
        System.out.println(side + " рука машет.");
    }
}