import java.util.Stack;

public class RPNCalculator {
    public static double calculateRPN(String expression) {
        Stack<Double> stack = new Stack<>();
        String[] tokens = expression.split(" ");

        for (String token : tokens) {
            if (isNumeric(token)) {
                stack.push(Double.parseDouble(token));
            } else if (isOperator(token)) {
                if (stack.size() < 2) {
                    System.out.println("Ошибка: недостаточно операндов для оператора " + token);
                    return Double.NaN;
                }
                double operand2 = stack.pop();
                double operand1 = stack.pop();
                double result = performOperation(operand1, operand2, token);
                stack.push(result);
            } else {
                System.out.println("Ошибка: недопустимый токен " + token);
                return Double.NaN;
            }
        }

        if (stack.size() == 1) {
            return stack.pop();
        } else {
            System.out.println("Ошибка: остались лишние операторы");
            return Double.NaN;
        }
    }

    private static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isOperator(String str) {
        return str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/");
    }

    private static double performOperation(double operand1, double operand2, String operator) {
        return switch (operator) {
            case "+" -> operand1 + operand2;
            case "-" -> operand1 - operand2;
            case "*" -> operand1 * operand2;
            case "/" -> operand1 / operand2;
            default -> Double.NaN;
        };
    }
}