import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Задача 1: Вывести на экран сумму чисел массива с помощью циклов for, while, do while.
        int[] numbers = {1, 2, 3, 4, 5};
        int sumFor = 0;
        int sumWhile = 0;
        int sumDoWhile = 0;

        for (int i = 0; i < numbers.length; i++) {
            sumFor += numbers[i];
        }

        int j = 0;
        while (j < numbers.length) {
            sumWhile += numbers[j];
            j++;
        }

        int k = 0;
        do {
            sumDoWhile += numbers[k];
            k++;
        } while (k < numbers.length);

        System.out.println("Сумма (for): " + sumFor);
        System.out.println("Сумма (while): " + sumWhile);
        System.out.println("Сумма (do while): " + sumDoWhile);

        // Задача 2: Вывести на экран аргументы командной строки в цикле for.
        System.out.println("Аргументы командной строки:");
        for (int l = 0; l < args.length; l++) {
            System.out.println(args[l]);
        }

        // Задача 3: Вывести на экран первые 10 чисел гармонического ряда.
        System.out.println("Первые 10 чисел гармонического ряда:");
        for (int m = 1; m <= 10; m++) {
            double harmonicNumber = 1.0 / m;
            System.out.println(harmonicNumber);
        }

        // Задача 4: Сгенерировать, вывести и отсортировать массив случайных целых чисел.
        int[] randomArray = new int[10];
        System.out.print("Сгенерированный массив: ");
        for (int n = 0; n < randomArray.length; n++) {
            randomArray[n] = (int) (Math.random() * 100);
            System.out.print(randomArray[n] + " ");
        }

        Arrays.sort(randomArray);

        System.out.print("\nОтсортированный массив: ");
        for (int value : randomArray) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Задача 5: Метод для вычисления факториала числа с помощью цикла.
        int number = 5;
        long factorial = calculateFactorial(number);
        System.out.println("Факториал " + number + " = " + factorial);
    }

    public static long calculateFactorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}