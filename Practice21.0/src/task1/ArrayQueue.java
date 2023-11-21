package task1;

public class ArrayQueue {
    private int front, rear, size;
    private final int capacity;
    private final int[] array;

    //Для очереди, реализованной на основе массива, инвариант:
    //"Элементы в очереди организованы в порядке FIFO (First-In-First-Out), то
    //есть элемент, который был добавлен первым, будет удален первым".
    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        front = this.size = 0;
        rear = capacity - 1;
        array = new int[this.capacity];
    }

    //Предусловие: Нет (эта функция всегда может быть вызвана).
    //Постусловие: Возвращается `true`, если в очереди нет элементов, и `false` в противном случае.
    public boolean isEmpty() {
        return (this.size == 0);
    }

    //Предусловие: Нет (эта функция всегда может быть вызвана).
    //Постусловие: Возвращается `true`, если в очереди нет пустых ячеек, и `false` в противном случае.
    public boolean isFull() {
        return (this.size == this.capacity);
    }

    //Предусловие: Нет (эта функция всегда может быть вызвана).
    //Постусловие: Возвращается количество элементов в очереди.
    public int size() {
        return this.size;
    }

    //Предусловие: Очередь не должна быть полной.
    //Постусловие: Элемент добавляется в конец очереди.
    public void enqueue(int item) {
        if (isFull())
            return;

        this.rear = (this.rear + 1) % this.capacity;
        this.array[this.rear] = item;
        this.size = this.size + 1;
    }

    //Предусловие: Очередь не должна быть пустой.
    //Постусловие: Первый элемент удаляется из очереди и возвращается.
    public int dequeue() {
        if (isEmpty())
            return Integer.MIN_VALUE;

        int item = this.array[this.front];
        this.front = (this.front + 1) % this.capacity;
        this.size = this.size - 1;
        return item;
    }

    //Предусловие: Очередь не должна быть пустой.
    //Постусловие: Возвращается первый элемент в очереди.
    public int element() {
        if (isEmpty())
            return Integer.MIN_VALUE;

        return this.array[this.front];
    }

    //Предусловие: Нет (эта функция всегда может быть вызвана).
    //Постусловие: Все элементы удаляются из очереди.
    public void clear() {
        for (int i = 0; i < size; i++)
            array[(front + i) % capacity] = 0;

        front = 0;
        size = 0;
        rear = capacity - 1;
    }
}