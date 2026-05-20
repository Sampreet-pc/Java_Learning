import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int result = 0;

        while (true) {

            System.out.println("Enter operation (+, -, *, /, %, x to exit): ");
            char ch = sc.next().trim().charAt(0);

            // Exit condition
            if (ch == 'x' || ch == 'X') {
                break;
            }

            // Invalid operator check
            if (ch != '+' && ch != '-' && ch != '*' &&
                    ch != '/' && ch != '%') {

                System.out.println("Invalid input");
                continue;
            }

            System.out.println("Enter 1st number: ");
            int num1 = sc.nextInt();

            System.out.println("Enter 2nd number: ");
            int num2 = sc.nextInt();

            if (ch == '+') {
                result = num1 + num2;

            } else if (ch == '-') {
                result = num1 - num2;

            } else if (ch == '*') {
                result = num1 * num2;

            } else if (ch == '/') {

                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Cannot divide by zero");
                    continue;
                }

            } else if (ch == '%') {

                if (num2 != 0) {
                    result = num1 % num2;
                } else {
                    System.out.println("Cannot divide by zero");
                    continue;
                }
            }

            System.out.println("Result = " + result);
        }

        System.out.println("Calculator closed");
        sc.close();
    }
}