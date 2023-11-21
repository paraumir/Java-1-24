import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "data.txt"; // Имя файла, с которым вы будете работать

        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Запись в файл");
            System.out.println("2. Вывод информации из файла");
            System.out.println("3. Замена информации в файле");
            System.out.println("4. Добавление текста в конец файла");
            System.out.println("5. Выход");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    writeToFile(fileName, scanner);
                    break;
                case 2:
                    readFromFile(fileName);
                    break;
                case 3:
                    replaceInFile(fileName, scanner);
                    break;
                case 4:
                    appendToFile(fileName, scanner);
                    break;
                case 5:
                    scanner.close();
                    System.out.println("Программа завершена.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Неправильный выбор. Попробуйте снова.");
            }
        }
    }

    private static void writeToFile(String fileName, Scanner scanner) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            System.out.print("Введите текст для записи в файл: ");
            String input = scanner.next();
            writer.write(input);
            System.out.println("Запись в файл успешно выполнена.");
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }

    private static void readFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName)) ) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }

    private static void replaceInFile(String fileName, Scanner scanner) {
        try {
            System.out.print("Введите текст для замены: ");
            String search = scanner.next();
            System.out.print("Введите текст, на который хотите заменить: ");
            String replace = scanner.next();

            File file = new File(fileName);
            String content = new String();
            String line;
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                while ((line = reader.readLine()) != null) {
                    content += line + System.lineSeparator();
                }
            }

            content = content.replaceAll(search, replace);

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                writer.write(content);
                System.out.println("Замена в файле успешно выполнена.");
            }
        } catch (IOException e) {
            System.err.println("Ошибка при замене информации в файле: " + e.getMessage());
        }
    }

    private static void appendToFile(String fileName, Scanner scanner) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true)) ) {
            System.out.print("Введите текст для добавления в конец файла: ");
            String input = scanner.next();
            writer.write(input);
            System.out.println("Добавление в файл успешно выполнено.");
        } catch (IOException e) {
            System.err.println("Ошибка при добавлении в файл: " + e.getMessage());
        }
    }
}