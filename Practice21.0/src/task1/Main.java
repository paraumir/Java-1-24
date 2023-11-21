package task1;

public class Main {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);

        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());

        for(int i = 0; i < 7; i++)
            queue.enqueue(i);

        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());

        for(int i = 0; i < 7; i++)
            System.out.println(i + "'th element: " + queue.dequeue());

        System.out.println("----------");
        for(int i = 0; i < 7; i++)
            queue.enqueue(i);

        for(int i = 0; i < 7; i++)
            System.out.println(i + "'th element: " + queue.dequeue());

        System.out.println("----------");
        queue.clear();

        for(int i = 0; i < 7; i++)
            System.out.println(i + "'th element: " + queue.dequeue());
    }
}
