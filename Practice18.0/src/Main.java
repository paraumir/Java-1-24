import java.io.Serializable;

// Обобщенный класс MyClass с тремя параметрами
class MyClass<T extends Comparable<T>, V extends Serializable & Animal, K> {
    private T t;
    private V v;
    private K k;

    // Конструктор
    public MyClass(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    // Методы возвращающие значения переменных
    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    // Метод выводящий на консоль имена классов для трех переменных
    public void printClassNames() {
        System.out.println("Тип T: " + t.getClass().getName());
        System.out.println("Тип V: " + v.getClass().getName());
        System.out.println("Тип K: " + k.getClass().getName());
    }
}

// Обобщенный класс MinMax
class MinMax<T extends Comparable<T>> {
    private T[] array;

    // Конструктор
    public MinMax(T[] array) {
        this.array = array;
    }

    // Метод для нахождения минимального элемента массива
    public T findMin() {
        if (array.length == 0) {
            return null;
        }

        T min = array[0];
        for (T element : array) {
            if (element.compareTo(min) < 0) {
                min = element;
            }
        }

        return min;
    }

    // Метод для нахождения максимального элемента массива
    public T findMax() {
        if (array.length == 0) {
            return null;
        }

        T max = array[0];
        for (T element : array) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }

        return max;
    }
}

// Класс Калькулятор
class Calculator {
    // Обобщенные статические методы
    public static <T extends Number, U extends Number> T sum(T a, U b) {
        return (T) Double.valueOf(a.doubleValue() + b.doubleValue());
    }

    public static <T extends Number, U extends Number> T multiply(T a, U b) {
        return (T) Double.valueOf(a.doubleValue() * b.doubleValue());
    }

    public static <T extends Number, U extends Number> T divide(T a, U b) {
        if (b.doubleValue() == 0) {
            throw new ArithmeticException("Деление на ноль");
        }
        return (T) Double.valueOf(a.doubleValue() / b.doubleValue());
    }

    public static <T extends Number, U extends Number> T subtract(T a, U b) {
        return (T) Double.valueOf(a.doubleValue() - b.doubleValue());
    }
}

// Класс Matrix
class Matrix<T> {
    private T[][] matrix;

    // Конструктор
    public Matrix(T[][] matrix) {
        this.matrix = matrix;
    }

    // Метод для вывода матрицы на консоль
    public void printMatrix() {
        for (T[] row : matrix) {
            for (T element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

// Пример использования
public class Main {
    public static void main(String[] args) {
        MyClass<Integer, SerializableAnimal, String> myObject = new MyClass<>(5, new SerializableAnimal(), "Hello");
        myObject.printClassNames();

        Integer[] numbers = {1, 5, 3, 8, 2};
        MinMax<Integer> minMax = new MinMax<>(numbers);
        System.out.println("Минимум: " + minMax.findMin());
        System.out.println("Максимум: " + minMax.findMax());

        System.out.println("Сумма: " + Calculator.sum(5, 3.2));
        System.out.println("Произведение: " + Calculator.multiply(2.5, 4));
        System.out.println("Деление: " + Calculator.divide(10, 2));
        System.out.println("Вычитание: " + Calculator.subtract(7, 3.5));

        Double[][] matrixData = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}, {7.0, 8.0, 9.0}};
        Matrix<Double> doubleMatrix = new Matrix<>(matrixData);
        doubleMatrix.printMatrix();
    }
}

// Класс SerializableAnimal реализует интерфейсы Serializable и Animal
class SerializableAnimal implements Serializable, Animal {
    // Реализация методов интерфейса Animal
    @Override
    public void makeSound() {
        System.out.println("Животное издает звук");
    }

    @Override
    public void eat() {
        System.out.println("Животное ест");
    }
}

// Интерфейс Animal
interface Animal {
    void makeSound();  // Метод звука
    void eat();        // Метод поедания
}