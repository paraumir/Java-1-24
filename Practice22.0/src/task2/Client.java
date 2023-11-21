package task2;

public class Client {
    public Chair chair;

    public void sit(){
        System.out.println("Sit on " + chair.getClass().getName());
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
