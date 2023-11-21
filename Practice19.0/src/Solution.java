import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Solution<T, V, K> {
    private T[] array;

    // Конструктор класса
    public Solution(T[] array) {
        this.array = array;
    }

    // Метод для получения элемента по индексу
    public T getElementByIndex(int index) {
        if (index >= 0 && index < array.length) {
            return array[index];
        } else {
            return null; // Или выбросить исключение, в зависимости от требований
        }
    }

    // Метод для конвертации массива строк/чисел в список
    public List<T> convertArrayToList() {
        List<T> list = new ArrayList<>();
        for (T element : array) {
            list.add(element);
        }
        return list;
    }

    // Метод для сохранения содержимого каталога в список и вывода первых 5 элементов
    public void saveDirectoryToListAndPrint(String directoryPath) {
        File directory = new File(directoryPath);
        File[] files = directory.listFiles();
        List<File> fileList = new ArrayList<>();

        if (files != null) {
            for (int i = 0; i < Math.min(5, files.length); i++) {
                fileList.add(files[i]);
            }

            // Вывод первых 5 элементов на экран
            System.out.println("First 5 elements in the directory:");
            for (File file : fileList) {
                System.out.println(file.getName());
            }
        }
    }

    // Вспомогательный метод для создания ArrayList
    public static <E> ArrayList<E> newArrayList(E... elements) {
        ArrayList<E> list = new ArrayList<>();
        for (E element : elements) {
            list.add(element);
        }
        return list;
    }

    // Вспомогательный метод для создания HashSet
    public static <E> HashSet<E> newHashSet(E... elements) {
        HashSet<E> set = new HashSet<>();
        for (E element : elements) {
            set.add(element);
        }
        return set;
    }

    // Вспомогательный метод для создания HashMap
    public static <K, V> HashMap<K, V> newHashMap(K key, V value) {
        HashMap<K, V> map = new HashMap<>();
        map.put(key, value);
        return map;
    }

    public static void main(String[] args) {
        // Пример использования класса Solution
        Integer[] intArray = {1, 2, 3, 4, 5};
        Solution<Integer, String, Long> solution = new Solution<>(intArray);

        // Пример вызова методов
        List<Integer> list = solution.convertArrayToList();
        System.out.println("Converted List: " + list);

        Integer element = solution.getElementByIndex(2);
        System.out.println("Element at index 2: " + element);

        solution.saveDirectoryToListAndPrint("/path/to/directory");

        // Пример использования вспомогательных методов
        ArrayList<String> stringList = Solution.newArrayList("a", "b", "c");
        System.out.println("New ArrayList: " + stringList);

        HashSet<Double> doubleSet = Solution.newHashSet(1.0, 2.0, 3.0);
        System.out.println("New HashSet: " + doubleSet);

        HashMap<String, Integer> stringIntegerMap = Solution.newHashMap("key", 42);
        System.out.println("New HashMap: " + stringIntegerMap);
    }
}