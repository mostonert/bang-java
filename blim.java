# bang-java
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String expression = scanner.nextLine();
        try {
            double result = evaluateExpression(expression);
            System.out.println("Результат: " + result);
        } catch (Exception e) {
            System.out.println("Ошибка при вычислении");
        }
    }

    public static double evaluateExpression(String expression) {
        return new java.util.Scanner(expression).nextDouble();
    }
}
