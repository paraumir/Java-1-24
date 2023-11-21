package task2;

public abstract class AbstractQueue<T> implements Queue<T> {
    @Override
    public abstract T dequeue();
    @Override
    public abstract void enqueue(T item);
    @Override
    public abstract int size();
    @Override
    public abstract boolean isEmpty();
    @Override
    public abstract void clear();
}
