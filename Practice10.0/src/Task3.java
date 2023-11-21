import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int sum = calculateDigitSum(N);
        System.out.println(sum);
    }

    public static int calculateDigitSum(int number) {
        if (number < 10) {
            return number;
        }
        return number % 10 + calculateDigitSum(number / 10);
    }
}
