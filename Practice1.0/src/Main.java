import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        TASK7.main(args);//выбор задачи путём изменения числа
    }

    //ЗАДАЧА 3
    public static class TASK3
    {
        public static void main(String[] args)
        {
            int size = 10;
            int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int sum = 0;
            for (
                    int i = 0;
                    i < size; i++) {
                sum += A[i];
            }

            double average = (double) sum / size;

            System.out.println("Сумма элементов массива: " + sum);
            System.out.println("Среднее арифметическое: " + average);

        }
    }

    //ЗАДАЧА 4
    public static class TASK4
    {
        public static void main(String[] args)
        {
            Scanner scn = new Scanner(System.in);

            //ввод размерности массива

            System.out.print("Введите размер массива: ");
            int size = scn.nextInt();

            int[] A = new int[size];

            //ввод элементов массива

            System.out.print("Введите элементы массива: ");
            for (
                    int i = 0;
                    i < size; i++) {
                A[i] = scn.nextInt();
            }
            int sumDoWhile = 0;//сумматор
            int indDoWhile = 0;//счётчик цикла
            do {
                sumDoWhile += A[indDoWhile];
                indDoWhile++;
            } while (indDoWhile < size);

            int sumWhile = 0;//сумматор
            int indWhile = 0;//счётчик цикла
            while (indWhile < size) {
                sumWhile += A[indWhile];
                indWhile++;
            }

            System.out.println("Сумма элементов массива (do-while): " + sumDoWhile);
            System.out.println("Сумма элементов массива (с while): " + sumWhile);

            int max = A[0];
            int min = A[0];
            indWhile = 0;

            // поиск наименьшего и наибольшего элементов

            while (indWhile < size) {

                if (A[indWhile] > max) {
                    max = A[indWhile];
                }
                if (A[indWhile] < min) {
                    min = A[indWhile];
                }
                indWhile++;
            }
            //вывод
            System.out.println("Максимальный элемент: " + max);
            System.out.println("Минимальный элемент: " + min);
            scn.close();
        }
    }

    //ЗАДАЧА 5
    public static class TASK5
    {
        public static void main(String[] args)
        {
            //проверка наличия аргументов
            if (args.length == 0) {
                System.out.println("Нет аргументов командной строки.");
            } else {
                System.out.println("Аргументы командной строки:");
                // Используем цикл for для вывода аргументов
                for (int i = 0; i < args.length; i++) {
                    System.out.println("Аргумент " + (i + 1) + ": " + args[i]);//вывод аргумента с его номером
                }
            }
        }
    }

    //ЗАДАЧА 6
    public static class TASK6
    {
        public static void main(String[] args)
        {
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%.2f ", 1.0 / i);//форматирование вывода
            }
            System.out.println();
        }
    }

    //ЗАДАЧА 7
    public static class TASK7
    {
        public static void main(String[] args)
        {
            int n = 4;
            int result = fact(n);
            System.out.println("Факториал числа " + n + " равен " + result);
        }
    }


    public static int fact(int n) //создание класса для факториала
    {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }
}