import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Java Calculator!");
        System.out.println("Please enter the first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Please enter the second number:");
        double num2 = scanner.nextDouble();
        System.out.println("Please enter the operation (+, -, *, /):");
        String operator = scanner.next();

        double result;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Division by zero is not allowed!");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator!");
                return;
        }

        System.out.println("The result is: " + result);
    }
}
