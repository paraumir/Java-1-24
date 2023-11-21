import java.util.Scanner;

public class OnlinePurchase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в онлайн магазин!");
        System.out.print("Введите ваше ФИО: ");
        String fullName = scanner.nextLine();

        System.out.print("Введите ваш ИНН: ");
        String inn = scanner.nextLine();

        try {
            if (isValidInn(inn)) {
                System.out.println("Заказ успешно оформлен для клиента: " + fullName);
            } else {
                System.out.println("Недействительный ИНН. Пожалуйста, проверьте введенные данные.");
            }
        } catch (Exception e) {
            System.out.println("Ошибка при проверке ИНН: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    // Простая проверка ИНН для России
    private static boolean isValidInn(String inn) throws Exception {
        if (inn == null || inn.length() != 12) {
            throw new Exception("ИНН должен состоять из 12 цифр");
        }

        try {
            Long.parseLong(inn); // проверка, что ИНН состоит только из цифр
        } catch (NumberFormatException e) {
            throw new Exception("ИНН должен состоять только из цифр");
        }

        int[] weights = {7, 2, 4, 10, 3, 5, 9, 4, 6, 8};
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            sum += Character.getNumericValue(inn.charAt(i)) * weights[i];
        }

        int controlDigit = sum % 11 % 10;

        return controlDigit == Character.getNumericValue(inn.charAt(10));
    }
}