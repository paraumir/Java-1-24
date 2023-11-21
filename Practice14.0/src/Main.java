import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Интерфейс, представляющий список ожидания.
 *
 * @param <E> тип элементов в списке ожидания
 */
interface IWaitList<E> {
    void add(E element);
    E remove();
    boolean contains(E element);
    boolean containsAll(Collection<E> c);
    boolean isEmpty();
}

/**
 * Обобщенная реализация списка ожидания с использованием ConcurrentLinkedQueue.
 *
 * @param <E> тип элементов в списке ожидания
 */
class WaitList<E> implements IWaitList<E> {
    protected ConcurrentLinkedQueue<E> content;

    public WaitList() {
        content = new ConcurrentLinkedQueue<>();
    }

    public WaitList(Collection<E> c) {
        content = new ConcurrentLinkedQueue<>(c);
    }

    @Override
    public void add(E element) {
        content.add(element);
    }

    @Override
    public E remove() {
        return content.poll();
    }

    @Override
    public boolean contains(E element) {
        return content.contains(element);
    }

    @Override
    public boolean containsAll(Collection<E> c) {
        return content.containsAll(c);
    }

    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }

    @Override
    public String toString() {
        return content.toString();
    }
}

/**
 * Ограниченный список ожидания с указанной вместимостью.
 *
 * @param <E> тип элементов в списке ожидания
 */
class BoundedWaitList<E> extends WaitList<E> {
    private int capacity;

    public BoundedWaitList(int capacity) {
        super();
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void add(E element) {
        if (content.size() < capacity) {
            super.add(element);
        } else {
            System.out.println("Невозможно добавить элемент, список ожидания полон.");
        }
    }

    @Override
    public String toString() {
        return "Ограниченный список ожидания с вместимостью " + capacity + ": " + content.toString();
    }
}

/**
 * Несправедливый список ожидания, позволяющий удалить конкретный элемент и переместить элемент в конец.
 *
 * @param <E> тип элементов в списке ожидания
 */
class UnfairWaitList<E> extends WaitList<E> {
    public UnfairWaitList() {
        super();
    }

    public void remove(E element) {
        content.remove(element);
    }

    public void moveToBack(E element) {
        if (content.remove(element)) {
            content.add(element);
        } else {
            System.out.println("Элемент не найден в списке ожидания.");
        }
    }
}

/**
 * Основной класс для демонстрации использования классов и интерфейсов списков ожидания.
 */
public class Main {
    public static void main(String[] args) {
        // Пример использования
        BoundedWaitList<Integer> boundedWaitList = new BoundedWaitList<>(3);
        boundedWaitList.add(1);
        boundedWaitList.add(2);
        boundedWaitList.add(3);
        boundedWaitList.add(4);  // Это должно вывести сообщение об ошибке

        System.out.println(boundedWaitList);

        UnfairWaitList<String> unfairWaitList = new UnfairWaitList<>();
        unfairWaitList.add("A");
        unfairWaitList.add("B");
        unfairWaitList.add("C");

        unfairWaitList.remove("B");
        unfairWaitList.moveToBack("A");

        System.out.println(unfairWaitList);
    }
}