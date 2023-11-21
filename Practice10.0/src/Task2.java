import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int s = scanner.nextInt();

        int count = countNumbersWithSum(k, s);
        System.out.println(count);
    }

    public static int countNumbersWithSum(int k, int s) {
        if (s < 1 || s > 9 * k) {
            return 0; // Нет таких чисел
        }

        if (k == 1) {
            return 1; // Единственное однозначное число с суммой s
        }

        int[][] dp = new int[k + 1][s + 1];

        for (int i = 1; i <= 9; i++) {
            if (i <= s) {
                dp[1][i] = 1;
            }
        }

        for (int i = 2; i <= k; i++) {
            for (int j = 1; j <= s; j++) {
                for (int x = 0; x <= 9; x++) {
                    if (j >= x) {
                        dp[i][j] += dp[i - 1][j - x];
                    }
                }
            }
        }

        return dp[k][s];
    }
}
