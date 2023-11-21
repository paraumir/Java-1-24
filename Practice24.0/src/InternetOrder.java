import java.util.*;

class InternetOrder {
    private Node head;
    private int size;

    // Конструкторы
    public InternetOrder() {
        this.head = new Node(null);
        this.size = 0;
    }

    public InternetOrder(Item[] items) {
        this();
        for (Item item : items) {
            addPosition(item);
        }
    }

    // Методы
    public boolean addPosition(Item item) {
        Node newNode = new Node(item);
        newNode.next = head.next;
        newNode.prev = head;
        head.next = newNode;
        if (newNode.next != null) {
            newNode.next.prev = newNode;
        }
        size++;
        return true;
    }

    public boolean removePosition(String itemName) {
        Node current = head.next;
        Node lastMatch = null;

        while (current != null) {
            if (current.item.getName().equals(itemName)) {
                lastMatch = current;
            }
            current = current.next;
        }

        if (lastMatch != null) {
            lastMatch.prev.next = lastMatch.next;
            if (lastMatch.next != null) {
                lastMatch.next.prev = lastMatch.prev;
            }
            size--;
            return true;
        }
        return false;
    }

    public int removeAllPositions(String itemName) {
        int count = 0;
        Node current = head.next;

        while (current != null) {
            if (current.item.getName().equals(itemName)) {
                current.prev.next = current.next;
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                count++;
                size--;
            }
            current = current.next;
        }

        return count;
    }

    public int getTotalItems() {
        return size;
    }

    public Item[] getItems() {
        Item[] items = new Item[size];
        Node current = head.next;

        for (int i = 0; i < size; i++) {
            items[i] = current.item;
            current = current.next;
        }

        return items;
    }

    public int getTotalCost() {
        int totalCost = 0;
        Node current = head.next;

        while (current != null) {
            totalCost += current.item.getCost();
            current = current.next;
        }

        return totalCost;
    }

    public int getItemsCount(String itemName) {
        int count = 0;
        Node current = head.next;

        while (current != null) {
            if (current.item.getName().equals(itemName)) {
                count++;
            }
            current = current.next;
        }

        return count;
    }

    public String[] getDistinctItemNames() {
        Set<String> itemNamesSet = new HashSet<>();
        Node current = head.next;

        while (current != null) {
            itemNamesSet.add(current.item.getName());
            current = current.next;
        }

        return itemNamesSet.toArray(new String[0]);
    }

    public Item[] getSortedItemsByCost() {
        Item[] items = getItems();
        Arrays.sort(items, Comparator.comparingInt(Item::getCost).reversed());
        return items;
    }

    // Внутренный класс Node
    private static class Node {
        private final Item item;
        private Node next;
        private Node prev;

        public Node(Item item) {
            this.item = item;
            this.next = null;
            this.prev = null;
        }
    }
}