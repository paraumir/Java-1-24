package task2;

public interface Queue<T> {
    void enqueue(T item);
    T dequeue();
    T front();
    int size();
    boolean isEmpty();
    void clear();
}
