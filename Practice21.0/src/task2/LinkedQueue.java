package task2;

public class LinkedQueue<T> extends AbstractQueue<T>{
    static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<T> front, rear;
    private int size;

    public LinkedQueue() {
        this.front = this.rear = null;
        this.size = 0;
    }
    @Override
    public T dequeue() {
        if (this.front == null)
            return null;

        Node<T> temp = this.front;
        this.front = this.front.next;

        if (this.front == null)
            this.rear = null;

        size--;
        return temp.data;
    }

    @Override
    public void enqueue(T item) {
        Node<T> temp = new Node<>(item);

        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }

        this.rear.next = temp;
        this.rear = temp;
        size++;
    }

    @Override
    public T front() {
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        front = rear = null;
        size = 0;
    }
}
